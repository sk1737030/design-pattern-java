package FacadePattern.case2.step1;

public class Radio {
    private boolean turnedON = false;

    public void turnOn() {
        turnedON = true;
        System.out.println("라디로를 켬");
    }

    public void turnOff() {
        turnedON = false;
        System.out.println("라디로를 끔");
    }

    public boolean isTurnedON() {
        return turnedON;
    }
}
