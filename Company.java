public class Company {
    String name;
    int year;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + "," + year;
    }
}
