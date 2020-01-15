package StrategyPattern.case2.step3;

public class Oracle extends Database {
    public Oracle() {
        name = "Oracle";
        rows = 10;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name + "에 접속하였스빈다.");
    }
}