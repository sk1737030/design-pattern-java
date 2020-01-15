package StrategyPattern.case2.step3;

/**
 * 결합을 낮춰주고 db를 di식으로 받음..
 */
public class DatabaseUse {

    // 접근점
    private Database db;

    public void setDatabase(Database db) {
        this.db = db;
    }

    public void connect() {
        if (db == null) {
            System.out.println(" 데이터베이스를 먼저 선택하세요.");
        } else {
            db.connectDatabase();
        }
    }

    public void select() {
        db.selectData();
    }

}
