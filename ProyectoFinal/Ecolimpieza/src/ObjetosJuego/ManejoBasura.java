package ObjetosJuego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import InterfazdeUsuario.PantallaJuego;
import util.Recurso;

public class ManejoBasura {
	private List<Beneficio> beneficios;
	private Random random;
	private BufferedImage imagen, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9;
	private Personaje principal;
	private PantallaJuego pantallaJuego;

	public ManejoBasura(Personaje principal, PantallaJuego pantallaJuego) {
		this.pantallaJuego = pantallaJuego;
		this.principal = principal;
		beneficios=new ArrayList<Beneficio>();
		imagen=Recurso.getImagenRecurso("Recursos/basura1.png");
		imagen2=Recurso.getImagenRecurso("Recursos/basura2.png");
		imagen3=Recurso.getImagenRecurso("Recursos/basura3.png");
		imagen4=Recurso.getImagenRecurso("Recursos/basura4.png");
		imagen5=Recurso.getImagenRecurso("Recursos/basura5.png");
		imagen6=Recurso.getImagenRecurso("Recursos/basura6.png");
		imagen7=Recurso.getImagenRecurso("Recursos/basura7.png");
		imagen8=Recurso.getImagenRecurso("Recursos/basura8.png");
		imagen9=Recurso.getImagenRecurso("Recursos/basura9.png");
		random=new Random();
		beneficios.add(getRandomBasura());
		random=new Random();
	}
	
	public void update() {
		for(Beneficio e: beneficios) {
			e.update();
			if(e.toco()) {
				pantallaJuego.aumentarPuntaje(100);
			}
		}
		Beneficio primerBeneficio=beneficios.get(0);
		if(primerBeneficio.fueradelaPantalla()) {
			beneficios.remove(primerBeneficio);
			beneficios.add(getRandomBasura());
		}
	}
	
	public void dibujar(Graphics g) {
		for(Beneficio e: beneficios) {
			e.dibujar(g);
		}
	}
	
	private Basura getRandomBasura() {
		random = new Random();
		Basura basu=new Basura(principal);
		basu.setX(2200);
		switch(random.nextInt(10)) {
			case 1:
				basu.setImagen(imagen);
				break;
			case 2:
				basu.setImagen(imagen2);
				break;
			case 3:
				basu.setImagen(imagen3);
				break;
			case 4:
				basu.setImagen(imagen4);
				break;
			case 5:
				basu.setImagen(imagen5);
				break;
			case 6:
				basu.setImagen(imagen6);
				break;
			case 7:
				basu.setImagen(imagen7);
				break;
			case 8:
				basu.setImagen(imagen8);
				break;
			case 9:
				basu.setImagen(imagen9);
				break;
		}
		return basu;
	}
}
