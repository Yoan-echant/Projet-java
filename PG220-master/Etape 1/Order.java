class Order {
    private int number;
    private Date date; 
    private Prix price;

public Order createOrder(){
this.number=0;
this.date= create_date();
this.prix= createprice();
}
    private Order(){
        this.number=0;
        this.date= createdate();
        this.price= createprice();
    }

    private Order(Date date, int number,Prix price){
    this.number=number;
    this.date=date;
    this.price=price;
    }

    private Order createOrder(){
        return new Order();
    }
    
    private Order createOrder(Date date, int number,Prix price){
        return new Order(date,number,price);
    }
    
}