package util;

import java.util.List;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

public class Animacion {
	private List<BufferedImage> frames;
	private int indiceFrame = 0;
	private int tiempoDelta;
	private long tiempoPrevio;
	
	public Animacion(int tiempoDelta) {
		this.tiempoDelta = tiempoDelta;
		frames = new ArrayList<BufferedImage>();
	}
	
	public void update() {
		if(System.currentTimeMillis() - tiempoPrevio > tiempoDelta) {
			indiceFrame ++;
			if(indiceFrame >= frames.size()) {
				indiceFrame = 0;
			}
			tiempoPrevio = System.currentTimeMillis();
		}
	}
	
	public void addFrame(BufferedImage frame) {
		frames.add(frame);
	}
	
	public BufferedImage getFrame() {
		if(frames.size() > 0) {
			return frames.get(indiceFrame);
		}
		return null;
	}
}
