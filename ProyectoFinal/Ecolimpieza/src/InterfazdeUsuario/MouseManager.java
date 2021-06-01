package InterfazdeUsuario;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import gui.UIManager;

public class MouseManager implements MouseListener, MouseMotionListener{
	
	private boolean izq_pressed, der_pressed;
	private int mouseX, mouseY;
	private UIManager uimanager;
	
	public MouseManager() {
		
	}

	public void setUIManager(UIManager uimanager) {
		this.uimanager=uimanager;
	}
	
	public boolean izquierdoPresionado() {
		return izq_pressed;
	}
	
	public boolean derechoPresionado() {
		return der_pressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1)//button1=boton de la izq
			izq_pressed=true;
		else if(e.getButton()==MouseEvent.BUTTON3)//button3=boton de la derecha
			der_pressed=true;
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1)//button1=boton de la izq
			izq_pressed=false;
		else if(e.getButton()==MouseEvent.BUTTON3)//button3=boton de la derecha
			der_pressed=false;	
		
		if(uimanager!=null)
			uimanager.onMouseRealease(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		
		if(uimanager!=null)
			uimanager.onMouseMove(e);
	}
}
