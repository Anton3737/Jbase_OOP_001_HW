package Address;

public class Address {

private int index;
private String country;
private String city;
private String street;
private int house;
private int apartment;

    public Address() {
    this.index = index;
    this.country = country;
    this.street = street;
    this.house = house;
    this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex(222);
        int index = address.getIndex();
        System.out.println("index " + index);

        address.setCountry("Ukraine");
        String country = address.getCountry();
        System.out.println("Country" + country);

        address.setCity("Kiev");
        String City = address.getCity();
        System.out.println("City" + City);

        address.setStreet("Shevchenka");
        String street = address.getStreet();
        System.out.println("Street" + street);

        address.setHouse(101);
        int House = address.getHouse();
        System.out.println("House" + House);

        address.setApartment(99);
        int Apartments = address.getApartment();
        System.out.println("Apartments " + Apartments);

    }
}


