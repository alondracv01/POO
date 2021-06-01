package InterfazdeUsuario;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

import ObjetosJuego.Fondo;
import ObjetosJuego.ManejodeEnemigos;
import ObjetosJuego.ManejoBasura;
import ObjetosJuego.Obstaculos;
import ObjetosJuego.Basura;
import ObjetosJuego.Personaje;
import util.Assets;
import util.Recurso;
import util.Sonido;
import util.Tiempo;

public class PantallaJuego extends JPanel implements Runnable, KeyListener{
	public static final int PRIMER_ESTADO_JUEGO = 0;
	public static final int ESTADO_JUGANDO = 1;
	public static final int JUEGO_TERMINADO = 2;
	public static final int JUEGO_PAUSADO = 3;
	public static final int JUEGO_TERMINADO_FINAL = 4;


	public static final float GRAVEDAD=0.15f;
	public static final float SUELOY=700;//en pixeles
	private Personaje principal;
	private Thread thread;
	private Fondo fondo;
	private ManejodeEnemigos manejo_enemigos;
	private ManejoBasura manejo_basura;
	private ArchivoRecord archrecord = new ArchivoRecord();
	private int puntaje;
	private int record = archrecord.lecturaArchivo();
	private Tiempo tiempo;
	//private Obstaculos obst;
	
	private int estadoJuego = PRIMER_ESTADO_JUEGO;
	
	private BufferedImage imagenGameOver;
	private BufferedImage imagenVida;
	private BufferedImage imagenPausa;
	
	private MouseManager mouseM;

	//private AudioClip sonido_p;
	File sonido_p;
	static Clip clip;
	static AudioInputStream son_p;
	
	public static Sonido spuntaje;//=new Sonido(Assets.spuntaje);
	public static Sonido smorir;
	public static Sonido sbrincar;
	
	public MouseManager mouse;
	
	public PantallaJuego() {
		thread=new Thread(this);
		principal=new Personaje();
		principal.setX(50);
		principal.setY(225);
		fondo=new Fondo();
		tiempo=new Tiempo();
		manejo_enemigos=new ManejodeEnemigos(principal);
		manejo_basura = new ManejoBasura(principal, this);
		imagenGameOver = Recurso.getImagenRecurso("Recursos/gameover.png");
		imagenVida = Recurso.getImagenRecurso("Recursos/corazonroto.png");
		imagenPausa = Recurso.getImagenRecurso("Recursos/pausa-removebg-preview.png");
		mouseM=new MouseManager();
		//spuntaje=new Sonido(Assets.spuntaje);
		//smorir=new Sonido("Recursos/dead.wav");
		//sbrincar=new Sonido(Assets.sjump);
		//sbrincar.play();
		//obst=new Obstaculos();
		sonido_p=new File("Recursos/coin.wav");
		try {
			son_p=AudioSystem.getAudioInputStream(sonido_p);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			clip=AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	public void setEstadoJuego(int estadoJuego) {
		this.estadoJuego=estadoJuego;
	}
	
	public int getEstadoJuego() {
		return estadoJuego;
	}
	
	public void comenzarJuego() {
		thread.start();
	}

	@Override
	public void run() {
		//game loop
		while(true) {
			try {
				actualizar();
				//obst.update();
				//if(obst.getMedidas().intersects(principal.getMedidas())) {
					//chocan los personajes
				//}
				repaint();
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void actualizar() {
		switch(estadoJuego) {
			case ESTADO_JUGANDO:
				if(archrecord.lecturaArchivo() <= puntaje)
				{
					archrecord.escrituraArchivo(puntaje);
					record = archrecord.lecturaArchivo();
				}
				principal.update();
				fondo.update();
				manejo_enemigos.update();
				manejo_basura.update();
				tiempo.update();
				if(!principal.getVivo()) {
					estadoJuego = JUEGO_TERMINADO;
					if(principal.getVidas()==0) {
						estadoJuego=JUEGO_TERMINADO_FINAL;
					}
				}
				break;
		}
		
	}
	
	public void aumentarPuntaje(int puntaje) {
		clip.close();
	    try {
			clip.open(son_p);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    clip.start();
		//clip.loop(Clip.LOOP_CONTINUOUSLY);
		//clip.stop();
		//clip.close();
		this.puntaje += puntaje;
		//spuntaje.play();
		//clip.close();

	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//g.setColor(Color.BLACK);
		//g.drawLine(0, (int)SUELOY, getWidth(), (int)SUELOY);
		switch(estadoJuego) {
			case PRIMER_ESTADO_JUEGO:
				principal.dibujar(g);
				break;
			case ESTADO_JUGANDO:
				fondo.draw(g);
				principal.dibujar(g);
				manejo_enemigos.dibujar(g);
				manejo_basura.dibujar(g);
				//g.setFont(g.getFont().deriveFont(20f));
				g.setFont (new Font ("SansSerif", Font.BOLD | Font.ITALIC, 20));
				g.drawString("Puntaje: "+String.valueOf(puntaje), 40, 40);
				g.drawString("Record: "+String.valueOf(record), 1300, 20);
				//g.setFont(g.getFont().deriveFont(20f));
				g.drawString("Vidas: "+String.valueOf(principal.getVidas()), 40, 20);
				g.setFont (new Font ("SansSerif", Font.BOLD | Font.ITALIC, 20));
				g.drawString(tiempo.getFormatTime(), 750,20);
				break;
			case JUEGO_TERMINADO_FINAL:
				fondo.draw(g);
				principal.dibujar(g);
				manejo_enemigos.dibujar(g);
				manejo_basura.dibujar(g);
				g.drawImage(imagenGameOver, 650, 100, null);
				g.drawImage(imagenVida, 700, 400, 200, 200, null);
				g.setFont (new Font ("SansSerif", Font.BOLD | Font.ITALIC, 30));
				g.drawString("Puntaje: "+String.valueOf(puntaje), 730, 60);
				g.drawString("Record: "+String.valueOf(record), 1300, 20);
				g.setFont (new Font ("SansSerif", Font.BOLD | Font.ITALIC, 20));
				g.drawString(tiempo.getFormatTime(), 800,20);
				break;
			case JUEGO_TERMINADO:
				fondo.draw(g);
				principal.dibujar(g);
				manejo_enemigos.dibujar(g);
				manejo_basura.dibujar(g);
				//g.drawImage(imagenGameOver, 650, 100, null);
				g.drawImage(imagenVida, 560, 150, 400, 400, null);
				break;
			case JUEGO_PAUSADO:
				fondo.draw(g);
				principal.dibujar(g);
				manejo_enemigos.dibujar(g);
				manejo_basura.dibujar(g);
				g.drawImage(imagenPausa, 470, 225, null);
				break;
		}
	}
	
	private void  reiniciarJuego() {
		if(principal.getVidas()>0) {
			principal.setVivo(true);
			principal.setX(50);
			principal.setY(225);
			manejo_enemigos.reiniciar();
		}
		else {
			//principal.setVivo(false);
			//estadoJuego=JUEGO_TERMINADO_FINAL;
			puntaje=0;
			principal.setVivo(true);//quitarrr
			principal.setVidas(3);
			manejo_enemigos.reiniciar();
			tiempo.setCurrentUpdate(0);
		}
	}

	public MouseManager getMouseManager() {
		return mouseM;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		//principal.saltar();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_SPACE:
				if(estadoJuego == PRIMER_ESTADO_JUEGO) {
					estadoJuego = ESTADO_JUGANDO;
				}
				else 
					if(estadoJuego == ESTADO_JUGANDO) {
						principal.saltar();
						//sbrincar.play();
					}
					else
						if(estadoJuego == JUEGO_TERMINADO) {
							reiniciarJuego();
							estadoJuego = ESTADO_JUGANDO;
						}
						else
							if(estadoJuego == JUEGO_TERMINADO_FINAL) {
								reiniciarJuego();
								estadoJuego = ESTADO_JUGANDO;
							}
				break;
			case KeyEvent.VK_ENTER:
				if(estadoJuego==ESTADO_JUGANDO) {
					estadoJuego=JUEGO_PAUSADO;
				}
				else 
					if(estadoJuego==JUEGO_PAUSADO) {
						estadoJuego=ESTADO_JUGANDO;
					}
					
		}
	}

	
}
