package example.manoj_pc.listviewwithclick;

public class UserInfo {
    String firstname;
    String age;
    String address;


    public UserInfo(){

    }


    public UserInfo(String firstname,String age,String address){
        this.firstname = firstname;
        this.age = age;
        this.address = address;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
