package FacadePattern.case2.step1;

public class Computer {
    private boolean turnedON = false;

    public void turnOn() {
        turnedON = true;
        System.out.println("Computer를 켬");
    }

    public void turnOff() {
        turnedON = false;
        System.out.println("Computer를 끔");
    }

    public boolean isTurnedON() {
        return turnedON;
    }
}
