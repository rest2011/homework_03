public interface Coffee {
    String getDescription();
    double getCost();
}

class SimpleCoffee implements Coffee {
    public String getDescription() { return "Кофе"; }
    public double getCost() { return 100.0; }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) { this.decoratedCoffee = coffee; }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return decoratedCoffee.getDescription() + ", молоко"; }
    public double getCost() { return decoratedCoffee.getCost() + 30.0; }
}

class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(Coffee coffee) { super(coffee); }
    public String getDescription() { return decoratedCoffee.getDescription() + ", сироп"; }
    public double getCost() { return decoratedCoffee.getCost() + 20.0; }
}
