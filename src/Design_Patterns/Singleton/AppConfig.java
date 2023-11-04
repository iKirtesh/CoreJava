package Design_Patterns.Singleton;

public class AppConfig {
    private AppConfig() {
        System.out.println("Instance Created");
    }

    private static AppConfig obj = null;

    public static AppConfig getInstance() {
        if (obj == null) {
            obj = new AppConfig();
        }
        return obj;
    }
}
