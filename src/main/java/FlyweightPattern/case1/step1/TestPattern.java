package FlyweightPattern.case1.step1;

/*********
 * 플라이 웨이트 패턴
 */
public class TestPattern {
    public static void main(String[] args) {
        String str1 = new String("홍길동"); // 다른 메모리사용
        String str2 = new String("홍길a"); // 다른 메모리사용
        String str3 = ("홍길동"); // 같은 메모리를 사용
        String str4 = ("홍길동"); // 같은 메모리를 사용

        System.out.println("FlyWeight Pattern");
    }
}
