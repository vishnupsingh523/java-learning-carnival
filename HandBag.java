class Bag{
    protected int bagId;
    protected float price;
    public Bag(){
        this.bagId = 5001;
        this.price = 500.0f;
    }

    protected void displayDetails(){
        System.out.println("Bag Id:"+this.bagId+" Price:"+this.price);
    }
}


public class HandBag extends Bag{

    private int discount;
    HandBag(int discount, float price){
        this.bagId++;
        this.price = price;
        this.discount = discount;
    }
    public void calculateTotalPrice(){
        this.price = this.price - (this.price * (float)this.discount)/100;
    }

    public static void main(String[] args){
        Bag bObj = new Bag();
        bObj.displayDetails();
        HandBag hbObj = new HandBag(10,350);

        hbObj.calculateTotalPrice();
        hbObj.displayDetails();
    }
}