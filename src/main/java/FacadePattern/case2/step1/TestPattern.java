package FacadePattern.case2.step1;

public class TestPattern {
    public static void main(String[] args) {
        // 파사드 패턴을 적용하기 전
        Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

        light.turnOn();
        radio.turnOff();
        computer.turnOn();
        // 파사드 패턴을 적용 후

        HomeFacade homeFacade = new HomeFacade(computer, light, radio);
        homeFacade.homeIn();
        homeFacade.homeOut();
    }
}
