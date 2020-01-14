package BridgePattern.case1.step3;

public class RobotModel1 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("type2 : power on");
    }

    // 추가기능
    @Override
    public void doCook() {
        System.out.println("요리를 합니다.");
    }

    @Override
    public void powerOff() {

        System.out.println("type2 : power off");
    }
}
