

public class Sp {
    private long id;
    private String name;
    private String description;
    private long price;
    private long quantity;
    private long amountSales;
    public Sp(int i, String name, String description, long price, long quantity, long amountSales){
        this.id = i;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.amountSales = amountSales;
    }
    public long getid() {
        return id;
    }
    public void setid(long id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    public long getprice() {
        return price;
    }
    public void setprice(long price) {
        this.price = price;
    }
    public long getquantity() {
        return quantity;
    }
    
    public void setquantity(long quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Sp [amountSales=" + amountSales + ", description=" + description + ", id=" + id + ", name=" + name
                + ", price=" + price + ", quantity=" + quantity + "]";
    }
    public long getamountSale() {
        return amountSales;
    }
    public void setamountSale(long amountSales) {
        this.amountSales = amountSales;
    }
}
