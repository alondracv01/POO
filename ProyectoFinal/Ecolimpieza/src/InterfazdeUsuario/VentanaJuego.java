package InterfazdeUsuario;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class VentanaJuego extends JFrame{
	
	private PantallaJuego pantallajuego;
	
	public VentanaJuego() {
		super("JavaEcolimpieza");
		setSize(800,800);
		setLocation(400,10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantallajuego=new PantallaJuego();
		add(pantallajuego);
		addKeyListener(pantallajuego);
		addMouseListener(pantallajuego.mouse);
		addMouseMotionListener(pantallajuego.mouse);
	}
	
	public void comenzarJuego() {
		pantallajuego.comenzarJuego();
	}
	
	public static void main(String args[]) {
		VentanaJuego vj= new VentanaJuego();
		vj.setVisible(true);
		vj.comenzarJuego();
	}
	
}
