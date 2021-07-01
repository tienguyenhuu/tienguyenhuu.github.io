package WebBanHang;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Long id;
    private Customer customer;
    private LocalDateTime dateOrder;
    private List<LineItem> items;

    public Order(Long id, Customer customer, LocalDateTime dateOrder, List<LineItem> items) {
        this.id = id;
        this.customer = customer;
        this.dateOrder = dateOrder;
        this.items = items;
    }
    public Long getid() {
        return id;
    }
    public void setid(Long id) {
    this.id = id;
    }
    public Customer getcustomer() {
        return customer;
    }
    public void setcustomer(Customer customer){
        this.customer = customer;
    }
    public LocalDateTime getdateOrder() {
        return dateOrder;
    }
    public void setdateOrder(LocalDateTime dateOrder){
        this.dateOrder = dateOrder;
    }
    public List<LineItem> getitems() {
        return items;
    }
    public void setitems(List<LineItem> items){
        this.items = items;
    }
    // @Override
    // public String toString() {
    //     return "ID= " + id + ",custommer= " + customer + ",Date Odre= " + dateOrder + ",Items= " + items;
    // }
}

