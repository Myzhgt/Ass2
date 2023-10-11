public class CoffeeShop {
    public static void main(String[] args){
        Coffee coffee =new Latte();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Order:" + coffee.getDescrition());
        System.out.println("Cost:$" + coffee.cost());
    }
}