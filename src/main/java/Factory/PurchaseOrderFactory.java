package Factory;

public class PurchaseOrderFactory implements PageFactory {
    @Override
    public Page createPage() {
        return new PurchaseOrderPage();
    }
}
