package main.java.Oops_Interface;

public class Car {
    private MusicSystem ms;
    public void setMusicSystem(MusicSystem obj) {
        ms = obj;
    }
    void startACar() {
        System.out.println("Starting a car ...");
    }
    void increaseCarSpeed() {
        System.out.println("Speeding a car ...");
    }
    void applyBrakes() {
        System.out.println("applying Brakes to car ...");
    }

    void playASong() {
        if (ms == null) {
            System.out.println("No muzic system ....");
            return;
        }
        ms.play();
    }

    void pauseSong() {
        if (ms == null) {
            System.out.println("Pausing music system ....");
            return;
        }
        ms.pause();
    }

    void rewindingSong(int duration) {
        if (ms == null) {
            System.out.println("Rewinding song  ....");
            return;
        }
        ms.rewind(duration);
    }

    void forwardASong(int duration) {
        if (ms == null) {
            System.out.println("Forwarding a song  ....");
            return;
        }
        ms.forward(duration);
    }
}
