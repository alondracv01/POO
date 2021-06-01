package ObjetosJuego;
import static InterfazdeUsuario.PantallaJuego.GRAVEDAD;
import static InterfazdeUsuario.PantallaJuego.SUELOY;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import util.Animacion;
import util.Recurso;

public class Personaje {
	private float x=0;
	private float y=0;
	private float velocidady=0;
	private Animacion personajeCorre;
	private Rectangle rect;
	private boolean estaVivo = true;
	private int vidas=3;
	//private static Sonido s

	
	public Personaje() {
		personajeCorre = new Animacion(150);
		personajeCorre.addFrame(Recurso.getImagenRecurso("Recursos/nina1.png"));
		personajeCorre.addFrame(Recurso.getImagenRecurso("Recursos/nina1_2.png"));
		rect=new Rectangle();
	}
	
	public void update() {
		personajeCorre.update();
		//Lineas para saltar
		if(y>=SUELOY-personajeCorre.getFrame().getHeight()) {
			velocidady=0;
			y=SUELOY-personajeCorre.getFrame().getHeight();
		}
		else {
			//x+=1;
			velocidady+=2*GRAVEDAD;
			y+=velocidady;
		}
		rect.x=(int)x;
		rect.y=(int)y;
		rect.width=personajeCorre.getFrame().getWidth();
		rect.height=personajeCorre.getFrame().getHeight();
		
	}
	
	public Rectangle getMedidas() {
		return rect;
	}
	
	public void dibujar(Graphics g) {
		g.setColor(Color.BLACK);
		//g.drawRect((int)x, (int)y, personajeCorre.getFrame().getWidth(), personajeCorre.getFrame().getHeight());
		g.drawImage(personajeCorre.getFrame(), (int)x, (int)y, null);
	}
	
	public void saltar() {
		velocidady=-12;
		y+=velocidady;
	}
	
	public void setX(float x) {
		this.x=x;
	}
	
	public void setY(float y) {
		this.y=y;
	}
	
	public void setVelocidadY(float velocidady) {
		this.velocidady=velocidady;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getVelocidadY() {
		return velocidady;
	}
	
	public void setVivo(boolean vivo) {
		estaVivo = vivo;
	}
	
	public boolean getVivo() {
		return estaVivo;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public void setVidas(int vidas) {
		this.vidas=vidas;
	}
}

