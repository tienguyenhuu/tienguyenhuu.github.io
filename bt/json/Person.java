package json;
public class Person{
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String country;
public Person(Long id, String firstName, String lastName, String gender,String dateOfBirth, String country){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
    this.country = country;
}
public Long getid(){
    return id;
}
public String getfirstName(){
    return firstName;
}
public String getlastName(){
    return lastName;
}
public String getgender(){
    return gender;
}
public String getdateOfBirth(){
    return dateOfBirth;
}
public String getcountry(){
    return country;
}
public void setid(Long id){
    this.id = id;
}
public void setfirstname(String firstName){
    this.firstName = firstName;
}
public void setlastname(String lastName){
    this.lastName = lastName;
}
public void setgender(String gender){
    this.gender = gender;
}
public void setdateOfBirth(String dateOfBirth){
    this.dateOfBirth = dateOfBirth;
}
public void setcountry(String country){
    this.country = country;
}
}