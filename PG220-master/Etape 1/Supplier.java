public class Supplier{
    private int id_supplier;

    public Supplier initSupplier(){
        return new Supplier();
    }

    public Supplier createSupplier(int id_supplier){
        return new Supplier(id_supplier);
    }

    public Supplier(){
        this(0);
    }

    public Supplier(int id_supplier){
       setid(id_supplier);
    }

    public void setid(int id_supplier){
        this.id_supplier = id_supplier;
    }
}