package singletonePatter.case1.setp1;

import java.util.Date;

/*
*  2020-01-03
*  Di를 사용해야하는 이유..
* */


public class UnderstandDI {
    public static void main(String[] args) {
        // 날짜를 구하기 위해서는 Date 클래스에 의존해야 한다.
        Date date = new Date();
        System.out.println(date);
    }

    public static void getDate(Date d) {
        Date date = d;
        System.out.println(date);
    }

    public static void memberUse1() {
        // 강한 결합 : 직접 생성
        Member m1 = new Member();
    }

    public static void memberUse2(Member m) {
        // 약한 결합 : 생성 된 것을 주입 받음 - 의존 주입
        Member m2 = m;
    }
}

// Member를 사용한다 --> case1.setp1.Member 기능에 의존한다. 라는 의미
class Member {
    String name;
    String nickname;

    public Member() {}
//    private case1.setp1.Member() {} 강한 결합시에 에러 발생한다. 약한결합은 내가 만들건지 안만들건지 상관없지만 강한 결합시에는 발생..

}
