class Date{
    private String date;


    private Date(){
        this("01.01.00");
    }

    private Date(int jour,int mois,int année){
        this.date=date.concat(String.valueOf(jour));
        this.date=date.concat(".");
        this.date=date.concat(String.valueOf(mois));
        this.date=date.concat(".");
        this.date=date.concat(String.valueOf(année));
    }

    public String createdate(){
        // this.date=date.concat("01.01.00");
        // return this.date;
        return new Date();
    }

    private String create_date(int jour,int mois,int année){
        return new Date(jour, mois, année);
    }

    private void setdate(String date){
        this.date=date;
    }

}