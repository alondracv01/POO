package ObjetosJuego;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import util.Recurso;

public class Basura extends Beneficio{
	
	private BufferedImage imagen, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9;
	private int posX, posY;
	private Rectangle rect;
	private Personaje principal;
	
	public Basura(Personaje principal){
		this.principal = principal;
		imagen=Recurso.getImagenRecurso("Recursos/basura1.png");
		imagen2=Recurso.getImagenRecurso("Recursos/basura2.png");
		imagen3=Recurso.getImagenRecurso("Recursos/basura3.png");
		imagen4=Recurso.getImagenRecurso("Recursos/basura4.png");
		imagen5=Recurso.getImagenRecurso("Recursos/basura5.png");
		imagen6=Recurso.getImagenRecurso("Recursos/basura6.png");
		imagen7=Recurso.getImagenRecurso("Recursos/basura7.png");
		imagen8=Recurso.getImagenRecurso("Recursos/basura8.png");
		imagen9=Recurso.getImagenRecurso("Recursos/basura9.png");
		posX=600;
		posY=650;
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
	
	@Override
	public boolean toco() {
		if(getMedidas().intersects(principal.getMedidas())) {
			setY(-500);
		}
		return getMedidas().intersects(principal.getMedidas());
	}
}
