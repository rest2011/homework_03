public class Main {
    public static void main(String[] args) {
        // 1. Билдер
        Computer comp = new Computer.Builder().setProcessor("i7").setRam(16).build();
        System.out.println(comp);

        // 2. Стратегия
        Order order = new Order();
        order.setPaymentStrategy(new CreditCardPayment());
        order.processOrder(1000);

        // 3. Цепочка
        Handler auth = new AuthHandler();
        auth.setNext(new LogHandler());
        auth.handle("Запрос");

        // 4. Прокси
        Database db = new ProxyDatabase();
        db.connect();

        // 5. Декоратор
        Coffee coffee = new SyrupDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(coffee.getDescription() + " = " + coffee.getCost());

        // 6. Адаптер
        UsbTypeC adapter = new CardReaderAdapter(new OldLegacySdCard());
        adapter.readData();
    }
}
