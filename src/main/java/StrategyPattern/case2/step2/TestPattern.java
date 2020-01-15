package StrategyPattern.case2.step2;

public class TestPattern {
    public static void main(String[] args) {
        DatabaseUse myDB = new DatabaseUse();

        // 데이터베이스를 세팅한다.
        myDB.connect(DBTYPE.MySQL);
        myDB.select();

        // 사용하다가
        // 데이터베이스를 변경
        myDB.connect(DBTYPE.InforMix);
        myDB.select();

        // 계속 추가하게되면
        myDB.connect(DBTYPE.Oracle);
        myDB.select();
        // 계속 databaseUse 및 추가해야한다..
    }
}
