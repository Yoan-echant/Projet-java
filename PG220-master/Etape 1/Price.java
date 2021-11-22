class Price implements Validable{
    private double price; 

    public Price(){
        this(0);
    }

    public Price(double price){
        this.price = price;
    }

    public Price createprice(){
        return new Price();
    }
    public Price createprice(double p){
        return new Price(p);

    }

    public boolean isvalidable(){
        boolean b = this.price instanceof double;
        if( b == false) {
            return false;
        }
        if(this.price*100 - Math.floor(this.price * 100) !=0 ){
           return false; 
        }

        return true;
    }
}