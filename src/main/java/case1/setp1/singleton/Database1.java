package case1.setp1.singleton;

public class Database1 {
    private String name;
    private static Database1 singleton;

    public Database1(String name) {
        super();
        this.name = name;

    }

    public static Database1 getInstance(String name) {
        if (singleton == null) {
            singleton = new Database1(name);
        }
        return singleton;
    }
    public String getName() {
        return name;
    }

}
