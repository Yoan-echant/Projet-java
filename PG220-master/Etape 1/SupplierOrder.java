class SupplierOrder extends Order{
    private Supplier supplier;
    private Panel panel;


    private SupplierOrder(){
        this.supplier=supplier.initSupplier();
    }

    private SupplierOrder(Supplier supplier, int panel_number,int id_panel){
        setsupplier(supplier);
        this.panel= panel_number;
        


    private SupplierOrder initSupplierOrder(){
        return new SupplierOrder();

    }

    private SupplierOrder createSupplierOrder(Supplier suppler){
        return new SupplierOrder(supplier);
    }

    private void setsupplier(Supplier supplier){
        this.supplier = supplier;
    }

}