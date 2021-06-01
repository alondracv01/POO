package ObjetosJuego;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;

import util.Recurso;

public class Fondo {
	
	private BufferedImage fondoparque;
	private List<Fondos> fondo;
	private int tam=935;
	
	public Fondo() {
		fondoparque= Recurso.getImagenRecurso("Recursos/parque2.png");
		fondo=new ArrayList<Fondos>();
		
		Fondos fondo1= new Fondos();
		fondo1.posX=0;
		fondo1.posY=0;
		fondo.add(fondo1);
		
		fondo1= new Fondos();
		fondo1.posX=tam;
		fondo1.posY=0;
		fondo.add(fondo1);
		
		fondo1= new Fondos();
		fondo1.posX=2*tam;
		fondo1.posY=0;
		fondo.add(fondo1);
		
		fondo1= new Fondos();
		fondo1.posX=3*tam;
		fondo1.posY=0;
		fondo.add(fondo1);
	}
	
	public void update() {
		for(Fondos fondos: fondo) {
			fondos.posX-=10;
			//fondos.posY++;
		}
		Fondos primerfondo= fondo.get(0);
		if(primerfondo.posX+fondoparque.getWidth()<0) {
			primerfondo.posX=fondo.get(fondo.size()-1).posX+tam;//fondo1.getWidth;
			fondo.remove(primerfondo);
			fondo.add(primerfondo);
		}
	}
	
	public void draw(Graphics g) {
		for(Fondos fondos : fondo) {
			g.drawImage(fondoparque, (int)fondos.posX, (int)fondos.posY, null);
		}
	}
	
	private class Fondos{
		float posX;
		float posY;
	}
}
