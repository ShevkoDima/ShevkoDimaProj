package Factory;

public class ProductPage implements Page {

    @Override
    public void openPage() {
        System.out.println("Opening 'Product' page : www.service/product");
    }
}
