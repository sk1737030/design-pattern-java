package singletonePatter.case1.setp1.singleton;
/***************
 * 3에서의 syncronized를 보안하기위해
 **************/
public class Database4 {
    private String name;
    private static Database4 singleton = new Database4("products");

    private Database4(String name) {
        /*super();
        this.name = name;
        */
        try {
            Thread.sleep(100);
            this.name=name;
        }catch (Exception e){

        }
    }

    public static Database4 getInstance(String name) {
        return singleton;
    }
    public String getName() {
        return name;
    }

}
