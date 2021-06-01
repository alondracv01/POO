package ObjetosJuego;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import util.Recurso;

public class Obstaculos extends Enemigo{
	
	private BufferedImage imagen, imagen2;
	private int posX, posY;
	private Rectangle rect;
	
	public Obstaculos(){
		imagen=Recurso.getImagenRecurso("Recursos/opcionperro1-removebg-preview.png");
		imagen2=Recurso.getImagenRecurso("Recursos/gatomiau2.png");
		posX=600;
		posY=520;
		rect=new Rectangle();
		//rect.intersects(rect);
	}
	
	public void update() {
		posX-=2;
		rect.x=posX;
		rect.y=posY;
		rect.width=imagen.getWidth();
		rect.height=imagen.getHeight();
	}
	
	@Override
	public Rectangle getMedidas() {
		return rect;
	}
	
	@Override
	public void dibujar(Graphics g) {
		g.drawImage(imagen, posX, posY, null);
	}
	
	public void setX(int x) {
		posX=x;
	}
	
	public void setY(int y) {
		posY=y;
	}
	
	public void setImagen(BufferedImage img) {
		this.imagen=img;
	}
	
	@Override
	public boolean fueradelaPantalla() {
		return(posX+imagen.getWidth()<0);
	}
}
