package StrategyPattern.case2.step2;

enum DBTYPE {MySQL, InforMix, Oracle}

/**
 * 강한 결합..
 */
public class DatabaseUse {

    private Database db;

    public void connect(DBTYPE dbtype) {
        switch (dbtype) {
            case MySQL:
                db = new MySQL();
                break;
            case InforMix:
                db = new InforMix();
                break;
            case Oracle:
                db = new Oracle();
                break;

        }

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
