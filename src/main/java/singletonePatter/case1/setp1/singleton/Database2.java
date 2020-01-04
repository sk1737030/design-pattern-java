package singletonePatter.case1.setp1.singleton;

public class Database2 {
    private String name;
    private static Database2 singleton;

    private Database2(String name) {
        /*super();
        this.name = name;
        */
        try {
            Thread.sleep(100);
            this.name=name;
        }catch (Exception e){

        }
    }

    public static Database2 getInstance(String name) {
        if (singleton == null) {
            singleton = new Database2(name);
        }
        return singleton;
    }
    public String getName() {
        return name;
    }

}
