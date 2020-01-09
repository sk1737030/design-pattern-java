package FacadePattern.case2.step1;

public class Light {
    private boolean turnedON = false;

    public void turnOn() {
        turnedON = true;
        System.out.println("Light를 켬");
    }

    public void turnOff() {
        turnedON = false;
        System.out.println("Light를 끔");
    }

    public boolean isTurnedON() {
        return turnedON;
    }
}
