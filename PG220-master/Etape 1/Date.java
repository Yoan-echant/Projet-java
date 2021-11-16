public class Date{
    public String date;

    public Date(){
        this.date = "00.00.00";
    }

    public Date(int jour,int mois,int année){
        this.date=date.concat(String.valueOf(jour));
        this.date=date.concat(".");
        this.date=date.concat(String.valueOf(mois));
        this.date=date.concat(".");
        this.date=date.concat(String.valueOf(année));
    }

    public Date createdate(){
        return new Date();
    }

    public Date create_date(int jour,int mois,int année){
        return new Date(jour, mois, année);
    }

    public void setdate(String date){
        this.date=date;
    }

}