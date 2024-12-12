public class Address {
    String street;
    int flatNo;
    int houseNo;
    String postalCode;
    String city;
    String country;

    public Address(String street, int flatNo, int houseNo, String postalCode, String city, String country) {
        this.street = street;
        this.flatNo = flatNo;
        this.houseNo = houseNo;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return street + "," + flatNo + "," + houseNo + "," + postalCode + "," + city + "," + country;
    }
}
