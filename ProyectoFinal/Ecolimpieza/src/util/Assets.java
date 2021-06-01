package util;

import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Assets {
	public static Clip spuntaje, sdead, sjump;
	public static BufferedImage[] btn_start;
	
	public static void init() {
		spuntaje=loader.loadSound("Recursos/coin.wav");
		sdead=loader.loadSound("Recursos/dead.wav");
		sjump=loader.loadSound("Recursos/jump.wav");
		btn_start[0]=Recurso.getImagenRecurso("Recursos/boton1.png");
		btn_start[1]=Recurso.getImagenRecurso("Recursos/botonverde.png");

	}
}
