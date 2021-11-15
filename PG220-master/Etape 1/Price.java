class Price {
    private int price; 

    public Price(){
        this(0);
    }

    public Price(int price){
        this.price = price;
    }

    public Price createprice(){
        return new Price();
    }
    public Price createprice(int p){
        return new Price(p);

    }
}