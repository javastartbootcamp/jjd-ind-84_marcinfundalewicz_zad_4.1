package pl.javastart.task;

public class Televisor {
    boolean televisorIsOn = false;

    boolean turnOn() {
        return televisorIsOn = true;
    }

    boolean turnOff() {
        return televisorIsOn = false;
    }

    void showStatus() {
        System.out.println(televisorIsOn);
    }
}
