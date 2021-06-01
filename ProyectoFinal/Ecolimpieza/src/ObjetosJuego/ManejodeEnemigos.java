package ObjetosJuego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import util.Recurso;

public class ManejodeEnemigos {
	private List<Enemigo> enemigos;
	private Random random;
	private BufferedImage imagen, imagen2;
	private Personaje principal;

	public ManejodeEnemigos(Personaje principal) {
		this.principal = principal;
		enemigos=new ArrayList<Enemigo>();
		imagen=Recurso.getImagenRecurso("Recursos/opcionperro1-removebg-preview.png");
		imagen2=Recurso.getImagenRecurso("Recursos/gatomiau2.png");
		random=new Random();
		enemigos.add(getRandomObstaculos());
	}
	
	public void update() {
		for(Enemigo e: enemigos) {
			e.update();
			if(e.getMedidas().intersects(principal.getMedidas())) {
				principal.setVivo(false);
				principal.setVidas(principal.getVidas()-1);
			}
		}
		Enemigo primerEnemigo=enemigos.get(0);
		if(primerEnemigo.fueradelaPantalla()) {
			enemigos.remove(primerEnemigo);
			enemigos.add(getRandomObstaculos());
		}
	}
	
	public void dibujar(Graphics g) {
		for(Enemigo e: enemigos) {
			e.dibujar(g);
		}
	}
	
	public void reiniciar() {
		enemigos.clear();
		enemigos.add(getRandomObstaculos());
	}
	
	private Obstaculos getRandomObstaculos() {
		Obstaculos obst=new Obstaculos();
		obst.setX(1600);
		if(random.nextBoolean()) {
			obst.setImagen(imagen);
		}else {
			obst.setImagen(imagen2);
		}
		return obst;
	}
}

