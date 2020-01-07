package ObserverPattern.case2.step1;

import java.util.Observable;


public class MyClassA implements Observer {

    Observable observable; // 등록될 Observable
    private boolean bPlay; // 실행 여부


    @Override
    public void update(boolean play) {
        this.bPlay = play;
        myActControl();
    }

    private void myActControl() {
        if (bPlay) {
            System.out.println("MyClasssA  : 동작을 시작합니다.");
        } else {
            System.out.println("MyClasssA  : 동작을 중지합니다.");
        }
    }


}
