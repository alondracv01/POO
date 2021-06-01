package gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.plaf.nimbus.State;

import util.Assets;

//user interface
public class Menu extends JFrame implements Runnable{
	private UIManager uimanager;
	private Canvas canvas;
	
	
	public Menu(Handler hand){
		super();
		uimanager=new UIManager(hand);
		hand.getMouseManager().setUIManager(uimanager);
		
		uimanager.addObjeto(new UImagenBoton(200,200,128,64,Assets.btn_start,new ClickListener() {
			@Override
			public void onClick() {
				hand.getMouseManager().setUIManager(null);
				//state.setState(hand.getGame().gameState());
			}
		}));
	}

	public void tick(){
		uimanager.tick();
	}

	public void render(Graphics g){
		uimanager.render(g);
	}

	//@Override
	protected boolean isInState(JComponent c) {
		return false;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
