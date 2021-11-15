class SupplierOrder extends Order{
    private Supplier supplier;
    private Panel panel;


    private SupplierOrder(){
        this.supplier = supplier.initSupplier();
        this.panel= panel.initPanel();
        this.number = 0;
    }

    private SupplierOrder(Supplier supplier, Panel panel){
        this.supplier = supplier;
        this.panel = panel;
        
    }

    private SupplierOrder initSupplierOrder(){
        return new SupplierOrder();

    }

    private SupplierOrder createSupplierOrder(Supplier suppler){
        return new SupplierOrder(supplier);
    }
}