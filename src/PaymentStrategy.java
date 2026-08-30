public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) { System.out.println("Оплата картой: " + amount); }
}

class SbpPayment implements PaymentStrategy {
    public void pay(int amount) { System.out.println("Оплата через СБП: " + amount); }
}

class Order {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy strategy) { this.paymentStrategy = strategy; }
    public void processOrder(int total) { paymentStrategy.pay(total); }
}
