package sample;

public class FriendBook {

    public String name;
    private String phoneNumber;
    private String email;
    private String address;

    FriendBook(String n, String p, String e, String a) {

        name = n;
        phoneNumber = p;
        email = e;
        address = a;

    }

    //Getters and Setters
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String toString() { return name; }

    public void setName(String n) { name = n; }
    public void setPhoneNumber(String p) { phoneNumber = p; }
    public void setEmail(String e) { email = e; }
    public void setAddress(String a) { address = a; }

}
