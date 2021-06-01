package util;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class loader {
	public static Clip loadSound(String path) {
		try {
			Clip clip=AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(loader.class.getResource(path)));
			return clip;
		}catch(LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
		return null;
	}
}
