package Design_Patterns.Prototype;

class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = " : very very important data";
        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return this.ip + " " + this.importantData;
    }

    @Override
    public NetworkConnection clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (NetworkConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Create object using new prototype");
        NetworkConnection connection = new NetworkConnection();
        connection.setIp("198.0.0.01");
        connection.loadVeryImportantData();
        System.out.println(connection);

        NetworkConnection connection2 = connection.clone();
        System.out.println(connection2);

        NetworkConnection connection3 = connection.clone();
        System.out.println(connection3);
    }
}

