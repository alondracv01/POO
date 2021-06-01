package gui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import InterfazdeUsuario.PantallaJuego;

public class UIManager {
	//PantallaJuego pant = new PantallaJuego();
	
	private Handler hand;
	//pantalla interactica = ui objects 
	private ArrayList<PantallaInteractiva> objects;
	
	public UIManager(Handler hand) {
		this.hand=hand;
		objects=new ArrayList<PantallaInteractiva>();
	}

	public Handler getHand() {
		return hand;
	}

	public void setHand(Handler hand) {
		this.hand = hand;
	}

	public ArrayList<PantallaInteractiva> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<PantallaInteractiva> objects) {
		this.objects = objects;
	}

	public void tick() {
		for(PantallaInteractiva o: objects)
			o.tick();
	}
	
	public void render(Graphics g) {
		for(PantallaInteractiva o: objects)
			o.render(g);
	}
	
	public void onMouseMove(MouseEvent e) {
		for(PantallaInteractiva o: objects)
			o.enMouseMove(e);
	}
	
	public void onMouseRealease(MouseEvent e) {
		for(PantallaInteractiva o: objects)
			o.enMouseRelease(e);
	}
	
	public void addObjeto(PantallaInteractiva o) {
		objects.add(o);
	}
	
	public void removeObjeto(PantallaInteractiva o) {
		objects.remove(o);
	}
	
}
