package ObjetosJuego;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Enemigo {
	public abstract Rectangle getMedidas();
	public abstract void dibujar(Graphics g);
	public abstract void update();
	public abstract boolean fueradelaPantalla();
}
