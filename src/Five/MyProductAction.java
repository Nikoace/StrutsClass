package Five;

import com.opensymphony.xwork2.Action;

public class MyProductAction implements Action {
    private MyProduct[] product;

    public MyProduct[] getProduct() {
        return product;
    }

    public void setProduct(MyProduct[] product) {
        this.product = product;
    }
    public MyProductAction(){
        product = new MyProduct[3];
    }
    public String execute() throws Exception {
        for (int i = 0; i<product.length;i++){
            System.out.println ( product[i].getName ()+"+"+product[i].getCount ()+"+"+product[i].getPrice () );
        }
        return Action.SUCCESS;
    }
}
