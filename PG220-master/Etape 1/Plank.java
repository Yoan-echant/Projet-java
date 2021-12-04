public class Plank implements Validable{
    private int id_plank;
    private Size size;

    public Plank initPlank(){
        return new Plank();
    }

    public Plank createPlank(int id, int length, int width){
        return new Plank(id, length, width);
    }

    private Plank(){
        this.id_plank=0;
        this.size=getplanksize();
    }

    private Plank(int id, int length, int width){
        setid(id);
        setsize(size.CreateSize(length, width));
    }

    private void setid(int id){
        this.id_plank=id;
    }

    public int getid(Plank plank){
        return plank.id_plank;
    }

    private Size getplanksize(){
        return size.initSize();
    }

    private void setsize(Size size){
        this.size=size;
    }

    public boolean isvalide(){
        if (this.id_plank <0){
            return false;
        }
        return (this.size).(size.isvalid());
        
    }

    public int compare_size(Plank ord1, Plank ord2){
        Size size1=ord1.size;
        Size size2=ord2.size;
        int w1=size.getwidth(size1);
        int l1=size.getlength(size1);
        int w2=size.getwidth(size2);
        int l2=size.getlength(size2);
        if (l1==l2 && w1==w2){
            return 0;
        }
        else if (l1>=l2 && w1>=w2){
            return 1;
        }
        else{
            return -1;
        }
    }

    public Plank[] cut_plank(Plank order, Plank supplier){
        int w_o=size.getwidth(order.size);
        int l_or=size.getlength(order.size);
        int w_s=size.getwidth(supplier.size);
        int l_s=size.getlength(supplier.size);
        Plank pannel= new Plank(getid(order),l_o,w_o);
        Plank plank1=new Plank(getid(supplier),l_s-l_o,w_s-w_o);
        Plank plank2=new Plank(getid(supplier),l_o,w_s-w_o);
        Plank plank3=new Plank(getid(supplier),l_s-l_o,w_o);
        Plank[] tab_ret;
        tab_ret.add(pannel);
        if (plank1.isvalid()==true){
            tab_ret.add(plank1);
        }
        if (plank2.isvalid()==true){
            tab_ret.add(plank2);
        }
        if (plank3.isvalid()==true){
            tab_ret.add(plank3);
        }
        return tab_ret;
    }
}