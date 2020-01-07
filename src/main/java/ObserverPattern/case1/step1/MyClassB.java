package ObserverPattern.case1.step1;

import java.util.Observable;
import java.util.Observer;

public class MyClassB implements Observer {

    Observable observable; // 등록될 Observable
    private boolean bPlay; // 실행 여부

    public MyClassB(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this); // 옵저버에 현재 클래스 등록.
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof PlayController) {
            PlayController myControl = (PlayController) o;
            this.bPlay = myControl.getFlag();
            myActControl();
        }
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClasssB  : 동작을 시작합니다.");
        } else {
            System.out.println("MyClasssB  : 동작을 중지합니다.");
        }
    }
}
