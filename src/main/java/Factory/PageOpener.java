package Factory;

public class PageOpener {
    public static void main(String[] args) {
        PageFactory pageFactory = openPageByItsName("produsdt");
        Page page = pageFactory.createPage();
        page.openPage();
    }

    static PageFactory openPageByItsName(String pageName){
        if (pageName.equalsIgnoreCase("purchaseOrder")){
            return new PurchaseOrderFactory();
        }else if (pageName.equalsIgnoreCase("product")){
            return new ProductPageFactory();
        }else{
            throw new RuntimeException(pageName + " doesn't exist");
        }
    }
}
