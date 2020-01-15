package StrategyPattern.case1.step2;

/**
 * A한테 기능을 구현하지 않고 B에게 구현을 미룸..
 */
public class TestPattern {
    public static void main(String[] args) {
        /*AObj aObj = new AObj();
        // A의 기능을 호출
        aObj.someFunc();*/

        // Bimplement 테스트
        BInterface bInterface = new BImplement();
        bInterface.funcA();

        AObj obj = new AObj();
        obj.someFunc();
    }
}
