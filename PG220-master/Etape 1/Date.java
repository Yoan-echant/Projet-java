public class Date {
protected String date;

public String create_date(){
this.date=date.concat("01.01.00");
return this.date;
}

public String create_date(int jour,int mois,int année){
this.date=date.concat(String.valueOf(jour));
this.date=date.concat(".");
this.date=date.concat(String.valueOf(mois));
this.date=date.concat(".");
this.date=date.concat(String.valueOf(année));

return this.date;
}

public String getdate(){
return date;
}
public void setdate(String date){
this.date=date;

}

}