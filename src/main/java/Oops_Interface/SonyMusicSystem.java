package main.java.Oops_Interface;

public class SonyMusicSystem implements MusicSystem {
    public void play() {
        System.out.println("Sony Logic of playing Song...");
    }
    public void pause() {
        System.out.println("Sony Logic of pausing Song...");
    }

    @Override
    public void forward(int duration) {
        System.out.println("Sony Logic of forward playing Song...");

    }

    @Override
    public void rewind(int duration) {
        System.out.println("Sony Logic of rewind playing Song...");

    }

    @Override
    public void setVolume(int level) {
        System.out.println("Sony Logic of setting vol playing Song...");

    }
}
