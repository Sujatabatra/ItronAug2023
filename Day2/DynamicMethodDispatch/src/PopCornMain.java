
class PopCorn{
    public void pop(){
        System.out.println("PopCorn Poping");
    }
}

class ButterPopCorn extends PopCorn{

    private int butterQuantity;

    public void setButterQuantity(int butterQuantity) {
        this.butterQuantity = butterQuantity;
    }

    @Override
    public void pop(){
        System.out.println("Butterly PopCorn Poping with butter quantity "+butterQuantity+" ounces");
    }
}

class CaramelPopCorn extends PopCorn{
    @Override
    public void pop(){
        System.out.println("Yummilicious Caramel PopCorn Poping");
    }
}
public class PopCornMain {
    public static void main(String args[]){
        //Base Class Reference Variable
        PopCorn popcorn;

        popcorn=new PopCorn();
        popcorn.pop();

        popcorn=new ButterPopCorn();
//        popcorn.setQuantity(2);
        popcorn.pop();

        popcorn=new CaramelPopCorn();
        popcorn.pop();

    }
}
