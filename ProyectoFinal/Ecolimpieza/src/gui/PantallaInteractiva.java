package gui;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public abstract class PantallaInteractiva{
	protected float x, y;
	protected int ancho, largo;
	protected boolean sobre_boton=false;
	protected Rectangle limites;

	public PantallaInteractiva(float x, float y, int ancho, int alto){
		this.x=x;
		this.y=y;
		this.ancho=ancho;
		this.largo=largo;
		limites=new Rectangle((int)x, (int)y, ancho, alto);
	}

	//setters y getters
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	//metodos
	public boolean isSobre_boton() {
		return sobre_boton;
	}

	public void setSobre_boton(boolean sobre_boton) {
		this.sobre_boton = sobre_boton;
	}

	public Rectangle getLimites() {
		return limites;
	}

	public void setLimites(Rectangle limites) {
		this.limites = limites;
	}

	public abstract void tick();

	public abstract void render(Graphics g);

	public abstract void onClick();

	public void enMouseMove(MouseEvent e){
		if(limites.contains(e.getX(),e.getY()))
			sobre_boton=true;
		else
			sobre_boton=false;
	}

	public void enMouseRelease(MouseEvent e){
		if(sobre_boton)
			onClick();
	}


}