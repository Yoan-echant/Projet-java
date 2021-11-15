public class Order {
public int number;
public Date date; 
public Prix prix;

public Order createOrder(){
this.number=0;
this.date=new create_date();
this.prix=new createprice();
}

public Order createclient(Date date, int number,Prix prix){
this.number=number;
this.date=date;
this.prix=prix;
}

    
}