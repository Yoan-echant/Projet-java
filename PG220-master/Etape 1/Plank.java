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
        return true;
    }
}