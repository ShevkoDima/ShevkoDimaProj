package Factory;

public class ProductPageFactory implements PageFactory {
    @Override
    public Page createPage() {
        return new ProductPage();
    }
}
