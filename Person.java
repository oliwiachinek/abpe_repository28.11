public class Person {
    String name;
    String surname;
    String sex;
    int bornYear;
    String job;
    Company company;
    double salary;
    Address address;

    public Person(String name, String surname, String sex, int bornYear, String job, Company company, double salary, Address address) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.bornYear = bornYear;
        this.job = job;
        this.company = company;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ";" + surname + ";" + sex + ";" + bornYear + ";" + job + ";" + salary + ";" +
                address.toString() + ";" + company.toString();
    }
}
