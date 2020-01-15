package StrategyPattern.case2.step3;

public class InforMix extends Database {


    public InforMix() {
        name = "Informix";
        rows = 40;
    }

    @Override
    public void connectDatabase() {
        System.out.println(name + " 에 접속했습니다...");
    }
}
