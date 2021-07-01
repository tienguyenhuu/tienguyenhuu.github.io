package WebBanHang;


public class LineItem {
    private Product unitPrice;
    private Integer quantity;

    public LineItem(Product unitPrice, Integer quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return unitPrice;
    }
    public void setunitPrice(Product unitPrice){
        this.unitPrice = unitPrice;
    }
    public Integer getquantity() {
        return quantity;
    }
    public void setquantity(Integer quantity) {
        this.quantity = quantity;
    }
}
