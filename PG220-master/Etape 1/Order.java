class Order implements Validable{
    public int number;
    private Date date; 
    private Price price;
    private int type;
    private ClientOrder clientorder;  // Pour l'instant clientOrder sera aussi SupplierOrder, penser a renommer plus tard (type=0:client sinon fournisseur)

    public Order(){
        this.number=0;
        this.date= date.createdate();
        this.price= price.createprice();
        this.type = 0;  // 0 On est un client, sinon un fournisseur
    }

    public Order(Date date, int number,int type, Price price,int id, int product_number,int length, int width){
    this.number=number;
    this.date=date;
    this.price=price;
    this.type=type;
    this.clientorder=clientorder.createClientOrder(id, product_number, length, width);
    }

    public Order createOrder(){
        return new Order();
    }
    
    public Order createOrder(Date date, int number,int type, Price price,int id, int product_number,int id_panel,int length, int width){
        return new Order(date, number, type, price,id, product_number, length, width);
    }

    public void setnumber(int nb){
        this.number=nb;
    }
    
    public boolean isvalide(){
        if (number >0){
            return true;
        }
        return false;
    }
}