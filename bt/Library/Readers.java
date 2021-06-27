package Library;

public class Readers {
 private String readerCode;
 private String name;
 private String email;
 private String phoneNumber;
 private String address;
public Readers(String readerCode, String name, String email, String phoneNumber, String address){
    this.readerCode = readerCode;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
}
public String getreaderCode() {
    return readerCode;
}
public String getname() {
    return name;
}
public String getemail() {
    return email;
}
public String getphoneNumber() {
    return phoneNumber;
}
public String getaddress() {
    return address;
}
public void setreaderCode(String readerCode) {
    this.readerCode = readerCode;
}
public void setname(String name) {
    this.name = name;
}
public void setemail(String email) {
    this.email = email;
}
public void setphoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public void setaddress(String address) {
    this.address = address;
}
}
