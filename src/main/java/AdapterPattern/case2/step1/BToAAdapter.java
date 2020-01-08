package AdapterPattern.case2.step1;

/**
 * class adapter implementation
 * extends 와 implements를 동시에 사용해 다중 상속을 흉내내었다.
 * b --> a
 */
public class BToAAdapter extends BPlayerImpl implements APlayer {

    @Override
    public void play(String fileName) {
        System.out.println("Using Adapter : ");
        playFile(fileName);
    }

    @Override
    public void stop() {
    }
}

/**
 * 기존 코드에서 수정해야 할 노력과 분량을 어댑터 클래스 생성에 사용
 * 기존에 잘 사용되던 클래이스이므로
 * 버그가 발생하면 어댑터 클래스만 집중적으로 살펴보면 된다.
 */
