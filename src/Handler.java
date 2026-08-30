public abstract class Handler {
    protected Handler next;
    public void setNext(Handler next) { this.next = next; }
    public abstract void handle(String request);
}

class AuthHandler extends Handler {
    public void handle(String request) {
        System.out.println("Auth проверка...");
        if (next != null) next.handle(request);
    }
}

class LogHandler extends Handler {
    public void handle(String request) {
        System.out.println("Логирование запроса: " + request);
    }
}
