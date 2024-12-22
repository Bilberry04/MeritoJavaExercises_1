package App;
class Address {
    private String city;
    private String street;

    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }

    public String getCity(){
        return city;
    }

    public void setCity(){
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(){
        this.street = street;
    }
}