public class Product {
    private String id;
    private String name;
    private String describe;
    private long price;
    private long amount;
    private long sellNumber;
    private String manufacturer;
    private Catergory catergory;
    public Product (String id, String name, String describe, long price, long amount,long sellNumber, String manufacturer, Catergory catergory){
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.amount = amount;
        this.sellNumber = sellNumber;
        this.manufacturer = manufacturer;
        this.catergory = catergory;
    }
    public String getid() {
        return id;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getdescribe() {
        return describe;
    }
    public void setdescribe(String describe){
        this.describe = describe;
    }
    public long getprice() {
        return price;
    }
    public void setprice(long price){
        this.price = price;
    }
    public long getamount() {
        return amount;
    }
    public void setamount(long amount){
        this.amount = amount;
    }
    public long getsellNumber() {
        return sellNumber;
    }
    public void setsellNumber(long sellNumber){
        this.sellNumber = sellNumber;
    }
    public String getmanufacturer() {
        return manufacturer;
    }
    public void setmanufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public Catergory getcatergory() {
        return catergory;
    }
    public void setcatergory(Catergory catergory){
        this.catergory = catergory;
    }
    @Override
    public String toString() {
        return "-Product [Số lượng=" + amount + ", Danh mục=" + catergory + ", Mô tả=" + describe + ", Mã sản phẩm=" + id
                + ", Nhà sản xuất=" + manufacturer + ", Tên=" + name + ", Giá bán=" + price + ", Số lượng bán="
                + sellNumber + "]";
    }
    
    
    
}
