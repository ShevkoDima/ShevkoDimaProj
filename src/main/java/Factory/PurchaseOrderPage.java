package Factory;

public class PurchaseOrderPage implements Page {
    @Override
    public void openPage() {
        System.out.println("Opening 'Purchase Order' page : www.service/purchaseOrder");
    }
}
