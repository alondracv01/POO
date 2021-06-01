package util;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sonido {
	private Clip clip;
	private FloatControl volumen;
	
	public Sonido(Clip clip) {
		this.clip=clip;
		volumen=(FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
	}
	
	public void play() {
		/*if(clip==null) return;
		stop();*/
		clip.setFramePosition(0);
		clip.start();
	}
	
	public void playwF(int frame) {
		clip.setFramePosition(frame);
		clip.start();
	}
	
	/*public void close() {
		stop();
		clip.close();
	}*/
	
	public void loop() {
		clip.setFramePosition(0);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		clip.stop();
		//if(clip.isRunning()) clip.stop();
	}
	
	public void changeVolume(float value) {
		volumen.setValue(value);
	}

}
