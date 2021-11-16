import java.text.SimpleDateFormat;
//import org.json.*;

public class Date implements Validable{
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

    public boolean isvalide(){
        String jour;
        String mois;
        String annee;
        jour=this.date.substring(0,2);
        mois=this.date.substring(3,5);
        annee=this.date.substring(6,8);
        int jourbis=Integer.parseInt(jour);
        int moisbis=Integer.parseInt(mois);
        int anneebis=Integer.parseInt(annee);
        if (anneebis >=21 ){
            if (moisbis==(1|3|5|7|8|10|12)){
                if (jourbis <32 && jourbis>=0){
                    return true;
                }
            }
            else if (moisbis==2){
                if((anneebis%4)==0){
                   if (jourbis <29 && jourbis>=0){
                    return true;
                    }
                    

                }
                else{
                    
                
                if (jourbis <30 && jourbis>=0){
                    return true;
                }
                }
            }
            else{
                if (jourbis<31 && jourbis>=0){
                    return true;
                }
            }
        }
        return false;

    }

}