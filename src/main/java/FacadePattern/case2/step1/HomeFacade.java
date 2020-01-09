package FacadePattern.case2.step1;

public class HomeFacade {
    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }

    public void homeIn() {
        System.out.println("집에 오면 Computer를 키고 , Radio를 끄고, Light 키기");
        if (!computer.isTurnedON()) {
            computer.turnOn();
        }
        if (!radio.isTurnedON()) {
            radio.turnOff();
        }
        if (!light.isTurnedON()) {
            light.turnOn();
        }
    }

    public void homeOut() {
        System.out.println("집에 오면 Computer를 끄고 , Radio를 키고, Light 끄기");
        if (computer.isTurnedON()) {
            computer.turnOff();
        }
        if (radio.isTurnedON()) {
            radio.turnOn();
        }
        if (light.isTurnedON()) {
            light.turnOff();
        }
    }
}
