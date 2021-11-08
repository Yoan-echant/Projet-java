public class Size{
    private int length;
    private int width;

    public Size initSize(){
        return new Size();
    }

    public Size CreateSize(int length, int width){
        return new Size(length, width);
    }

    private Size(){
        this(0,0);
    }

    private Size(int length, int width){
        setlength(length);
        setwidth(width);
    }

    private void setlength(int l){
        this.length=l;
    }

    private void setwidth(int w){
        this.width=w;
    }

    public int getwidth(){
        return this.width;
    }

    public int getlength(){
        return this.length;
    }
}