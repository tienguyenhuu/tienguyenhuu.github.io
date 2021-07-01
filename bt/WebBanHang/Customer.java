package WebBanHang;

public class Customer {
    private Long idCustomer;
    private String name;
    private String address;
    private String phone;
    private String email;
    public Customer(Long idCustomer, String name, String address, String phone, String email){
       this.idCustomer =idCustomer; 
       this.name = name;
       this.address = address;
       this.phone = phone;
       this.email = email;
    }
    public Long getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(Long idCustomer){
        this.idCustomer= idCustomer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getemail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
