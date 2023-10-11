public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescrition()+",Sugar";
    }
    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }
}
