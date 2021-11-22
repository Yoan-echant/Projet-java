class Price implements Validable{
    private Double price; 


    public Price(){
        this.price = new Double(0);
    }

    public Price(Double price){
        this.price = price;
    }

    public Price createprice(){
        return new Price();
    }
    public Price createprice(Double p){
        return new Price(p);

    }

    public boolean isvalide(){
        boolean b=this.price instanceof  Double;
        if( b == false) {
            return false;
        }
        if(this.price*100 - Math.floor(this.price * 100) !=0 ){
           return false; 
        }   

        return true;
    }
}