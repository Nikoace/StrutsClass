package Five;

import com.opensymphony.xwork2.Action;

public class MyProductAction implements Action {
    private MyProduct product;

    public MyProduct getProduct() {
        return product;
    }

    public void setProduct(MyProduct product) {
        this.product = product;
    }

    public String execute() throws Exception {
        System.out.println ( product.getName () );
        System.out.println ( product.getPrice () );
        System.out.println ( product.getCount () );
        return Action.SUCCESS;
    }
}
