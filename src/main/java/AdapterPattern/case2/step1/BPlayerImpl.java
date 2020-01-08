package AdapterPattern.case2.step1;

public class BPlayerImpl implements BPlayer {

    @Override
    public void playFile(String fileName) {
        System.out.println("(B) " + fileName);
    }

    @Override
    public void stopFile() {

    }
}
