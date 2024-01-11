package pl.javastart.task;

public class Televisor {
    boolean televisorIsOn = false;

    void turnOn() {
        televisorIsOn = true;
    }

    void turnOff() {
        televisorIsOn = false;
    }

    void showStatus() {
        System.out.println(televisorIsOn);
    }
}
