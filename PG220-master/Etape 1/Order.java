class Order {
    public int number;
    private Date date; 
    private Price price;

    public Order(){
        this.number=0;
        this.date= date.createdate();
        this.price= price.createprice();
    }

    public Order(Date date, int number, Price price){
        this.number=number;
        this.date=date;
        this.price=price;
    }

    public Order createOrder(){
        return new Order();
    }
    
    public Order createOrder(Date date, int number,Price price){
        return new Order(date,number,price);
    }

    public void setnumber(int nb){
        this.number=nb;
    }
    
}