public interface Database {
    void connect();
}

class RealDatabase implements Database {
    public RealDatabase() { System.out.println("Тяжелая загрузка БД..."); }
    public void connect() { System.out.println("Подключено к БД."); }
}

class ProxyDatabase implements Database {
    private RealDatabase realDatabase;
    public void connect() {
        if (realDatabase == null) realDatabase = new RealDatabase();
        System.out.println("Proxy: Лог времени...");
        realDatabase.connect();
    }
}
