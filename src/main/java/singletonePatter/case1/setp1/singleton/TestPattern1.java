package singletonePatter.case1.setp1.singleton;

/*************************************
 * 싱글톤 패턴
 * - 객체가 너무 많아지면 컴퓨터 자원을 과도하게 사용하게 되고, 이는 프로그램 전체의 속도를 느리게 할 수 있다.
 * 개발자는 객체의 최대 개수를 제한할 필요가 있음.
 *
 * 싱글톤 패턴은 최대 N개로 객체 생성을 제한하는 패턴
 * -> 생성되는 객체의 최대 개수를 제한하는 데 있어 객체의 생성을 요청하는 쪽에서는 일일이 신경쓰지 않아도 되도록 만들어주는 것이다.
 *
 * EX) 데이터베이스 커넥션 풀 , 로그 라이터
 *      사운드 매니저 , 스코어 매니저 게이밍 프로그래밍에서 많이 사용 됨.
 *************************************/
public class TestPattern1 {
    public static void main(String[] args) {
        Database1 database1;

        database1 = Database1.getInstance("첫 번째 Database");
        System.out.println("this is the " + database1.getName() + " !!!");

        database1 = Database1.getInstance("두 번째 Database");
        System.out.println("this is the " + database1.getName() + " !!!");

        System.out.println("database use");
    }
}
