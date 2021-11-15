class Order {
    public int number;
    public Date date; 
    public Prix price;

    public Order(){
        this.number=0;
        this.date= createdate();
        this.price= createprice();
    }

    public Order(Date date, int number,Prix price){
    this.number=number;
    this.date=date;
    this.price=price;
    }

    public Order createOrder(){
        return new Order();
    }
    
    public Order createOrder(Date date, int number,Prix price){
        return new Order(date,number,price);
    }
    
}