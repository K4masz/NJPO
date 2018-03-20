package Utils;

public class Config {
    private static Config ourInstance = new Config();

    public static final int MAX_UNITS_PER_BOARD = 5;

    public static Config getInstance() {
        if(ourInstance == null) {
            return ourInstance = new Config();
        }
        else
            return ourInstance;
    }

    private Config() {
    }
}
