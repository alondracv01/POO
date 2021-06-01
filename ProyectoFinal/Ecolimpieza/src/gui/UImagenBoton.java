package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class UImagenBoton extends PantallaInteractiva{

	private BufferedImage[] imagenes;
	private ClickListener clicker;

	public UImagenBoton(float x, float y, int ancho, int largo, BufferedImage[] imagenes, ClickListener clicker){
		super(x, y, ancho, largo);
		this.imagenes=imagenes;
		this.clicker=clicker;
	}

	@Override
	public void tick(){}

	@Override
	public void onClick(){
		clicker.onClick();
	}


	@Override
	public void render(Graphics g) {
		if(sobre_boton)
			g.drawImage(imagenes[1], (int)x, (int)y, ancho,largo, null);	
		else
			g.drawImage(imagenes[0], (int)x, (int)y, ancho,largo, null);	
	
	}
}
