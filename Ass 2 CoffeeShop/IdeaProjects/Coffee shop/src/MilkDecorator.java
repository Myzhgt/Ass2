public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription() {
        return coffee.getDescrition()+",Milk";
    }
    @Override
    public double cost() {
        return coffee.cost()+1.0;
    }
}
