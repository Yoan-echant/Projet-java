class Price {
    private int price; 

    private Price(){
        this(0);
    }

    private Price(int price){
        this.price = price;
    }

    public Price createprice(){
        return new Price();
    }
    public Price createprice(int p){
        return new Price(p);

    }

    private int getprice(){
        return price;
    }

}