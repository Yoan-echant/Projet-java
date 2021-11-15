public class Supplier{
    private int id_supplier;

    private Supplier initSupplier(){
        return new Supplier();
    }

    private Supplier createSupplier(int id_supplier){
        return new Supplier(id_supplier);
    }

    private Supplier(){
        this(0);
    }

    private Supplier(int id_supplier){
       setid(id_supplier);
    }

    private void setid(int id_supplier){
        this.id_supplier = id_supplier;
    }

}