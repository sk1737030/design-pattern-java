package FlyweightPattern.case2;

public class TestPattern {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getSubject("a");
        flyweightFactory.getSubject("b");
        flyweightFactory.getSubject("c");
        flyweightFactory.getSubject("a");
        flyweightFactory.getSubject("d");
        flyweightFactory.getSubject("b");
        flyweightFactory.getSubject("a");
    }
}
