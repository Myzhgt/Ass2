public class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDescription(){
        return coffee.getDescrition() +",Caramel";
    }
    @Override
    public double cost() {
        return coffee.cost()+1.5;
    }
}