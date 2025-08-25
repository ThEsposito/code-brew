package exercicios.geekforgeeks.projects.arrays;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AudioPlayer {
    private Clip clip;
    private boolean isPlaying = false;

    public AudioPlayer(String path) throws IOException {
        File soundFile = new File(path);
        try {
            if (soundFile.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundFile);
                this.clip = AudioSystem.getClip();
                this.clip.open(audioInput);
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException(e);
        }
    }

    public void playSound() {
        if(isPlaying) return;

        this.clip.start();
        isPlaying = true;
    }

    public void stopSound(){
        if(!isPlaying) return;
        clip.stop();
        isPlaying = false;
    }

    public void close(){
        clip.close();
    }
}