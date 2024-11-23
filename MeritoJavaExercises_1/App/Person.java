package App;
class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setAddress(String city, String street){
        this.address = new Address(city, street);
    }

    public Address getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(){
            System.out.println("Zmieniono naziwsko z" + this.surname + " na " + surname);
            this.surname = surname;
        }

    public String getFullName(){
        return name + " " + surname;
    }
    }