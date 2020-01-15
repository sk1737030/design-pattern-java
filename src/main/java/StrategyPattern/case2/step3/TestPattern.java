package StrategyPattern.case2.step3;

public class TestPattern {
    
    public static void main(String[] args) {
        // 데이터베이스를 선택해서 사용
        DatabaseUse myDB = new DatabaseUse();
        myDB.connect();

        // A(databaseUse) 에게 같은 일을 시켰지만 동작은 B(mysql)이 한다.
        myDB.setDatabase(new MySQL());
        myDB.connect();
        myDB.select();

        // A(databaseUse) 에게 같은 일을 시켰지만 동작은 B(oracle)이 한다.
        myDB.setDatabase(new Oracle());
        myDB.connect();
        myDB.select();

        /// [추가 요청 사항]
        // inforMix 클래스 추가와 다음 코드 추가만으로
        // 기존에 databaseUse에 코드 수정없이 접속및 기능을 사용할 수 있따.
        myDB.setDatabase(new InforMix());
        myDB.connect();
        myDB.select();
    }
}
