package WebBanHang;

public class Product {
    private String name; // Tên sản phẩm
    private Integer unitPrice; // Đơn giá
    private String manufacturer; // Nhà sản xuất
    private String madeIn; // Nơi sản xuất
    private String description; // giới thiệu

    public Product(String name, Integer unitPrice, String manufacturer, String madeIn, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.madeIn = madeIn;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Integer getunit() {
        return unitPrice;
    }

    public void setunitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getmanufacturer() {
        return manufacturer;
    }

    public void setmanufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getmadeIn() {
        return madeIn;
    }

    public void setmadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "name= " + name + ", manufacturer= " + manufacturer + ",Made In= " + madeIn + ",Description= "
                + description + ",Unit Price= " + unitPrice;
    }
}