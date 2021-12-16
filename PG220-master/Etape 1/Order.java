class Order implements Validable{
    private int number;
    private Date date; 
    private Price price;
    private int type;

    public Order(){
        Date date = new Date();
        Price price = new Price();
        this.number=0;
        this.date= date.createdate();
        this.price= price.createprice();
        this.type = 0;  // 0 On est un client, sinon un fournisseur
    }

    public Order(Date date, int number,int type, Price price){
    this.number=number;
    this.date=date;
    this.price=price;
    this.type=type;
    }

    public Order createOrder(){
        return new Order();
    }
    
    public Order createOrder(Date date, int number,int type, Price price){
        return new Order(date, number, type, price);
    }

    public void setnumber(int nb){
        this.number=nb;
    }

    public void setdate(String date_order){
        date.setdate(date_order);
    }

    public void settype(int typ){
        this.type=typ;
    }

    public void setprice(Double p){
        price.setprice(p);
    }
  
    
    public boolean isvalide(){
        if (number >0){
            return true;
        }
        return false;
    }

    public int getnumber(Order order){
        return order.number;
    }
    public int getntype(Order order){
        return order.type;
    }

}