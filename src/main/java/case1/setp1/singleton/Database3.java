package case1.setp1.singleton;
/***************
 * 2에서의 스레드의 취약점을 보안하기위해서 synchronized를 추가.
 * 문제는 synchronized 비용이 비싸다 스레드가 찍기위해서 대기하기때문에..
 **************/
public class Database3 {
    private String name;
    private static Database3 singleton;

    private Database3(String name) {
        /*super();
        this.name = name;
        */
        try {
            Thread.sleep(100);
            this.name=name;
        }catch (Exception e){

        }
    }

    public synchronized static Database3 getInstance(String name) {
        if (singleton == null) {
            singleton = new Database3(name);
        }
        return singleton;
    }
    public String getName() {
        return name;
    }

}
