
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		for (int i = 0; i <= 3; i++) {
			
		
		String animal = JOptionPane.showInputDialog(" which animal do you want a cat, llama,or a duck ( if you dont know write party animal???");
		if (animal.equals("llama")) {
			playLlama();
		} else if (animal.equals("cat")) {
			playCat();
			/* 2. Make it so that the user can keep entering new animals. */
		}
		else if (animal.equals("duck")){
		playQuack();
	}
	else if (animal.equals("party animal")){
		playMoo();
		playQuack();
		playWoof();
		playLlama();
		playCat();
	}

}
	}

		/* 2. Make it so that the user can keep entering new animals. */
	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	void playCat(){
		playNoise(meowFile);
	}
	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


