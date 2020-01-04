package FlyweightPattern.case1.step2;

/**
 * 얕은 복사도 플라잉 패턴의 예이다 객체를 공유하니
 * 자원의 낭비를 줄여주게 된다.
 */
public class TestPattern {
    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.xpos = 10;
        md1.ypos = 11;
        md1.name = "홍길동";

        MyData md2 = new MyData();
        md2 = md1; // 객체를 공유함 md1 얕은 복사

        MyData md3 = new MyData();
        md3.xpos = 20;
        md3.ypos = 21;
        md3.name = "손오공";

        md2.name = "전우치";
        md2.xpos = 5;
    }


}

class MyData {
    int xpos;
    int ypos;
    String name;
}
