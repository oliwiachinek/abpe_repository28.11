import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    private static final String[] NAMES = {"John", "Emma", "Michael", "Olivia", "Liam", "Sophia"};
    private static final String[] SURNAMES = {"Smith", "Johnson", "Brown", "Taylor", "Anderson"};
    private static final String[] COMPANIES = {"TechCorp", "MediHealth", "EduWorld", "FinSys", "BioWare"};
    private static final String[] STREETS = {"Main St", "Broadway", "Elm St", "Maple Ave", "Oak St"};
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
    private static final String[] COUNTRIES = {"USA", "Canada", "UK", "Germany", "France"};
    private static final String[] JOBS = {"Engineer", "Teacher", "Doctor", "Lawyer", "Designer"};

    private static final Random RANDOM = new Random();

    public List<Person> generatePeopleList(int n) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(generatePerson());
        }
        return people;
    }

    public Person generatePerson() {
        String name = NAMES[RANDOM.nextInt(NAMES.length)];
        String surname = SURNAMES[RANDOM.nextInt(SURNAMES.length)];
        String sex = RANDOM.nextBoolean() ? "Male" : "Female";
        int bornYear = 1960 + RANDOM.nextInt(42); // Between 1960 and 2001
        String job = JOBS[RANDOM.nextInt(JOBS.length)];
        double salary = 30000 + RANDOM.nextDouble() * 70000; // Salary between 30k and 100k
        Company company = generateCompany();
        Address address = generateAddress();

        return new Person(name, surname, sex, bornYear, job, company, salary, address);
    }

    private Company generateCompany() {
        String companyName = COMPANIES[RANDOM.nextInt(COMPANIES.length)];
        int year = 1900 + RANDOM.nextInt(121); // Between 1900 and 2021
        return new Company(companyName, year);
    }

    private Address generateAddress() {
        String street = STREETS[RANDOM.nextInt(STREETS.length)];
        int flatNo = RANDOM.nextInt(100) + 1;
        int houseNo = RANDOM.nextInt(50) + 1;
        String postalCode = String.format("%05d", RANDOM.nextInt(100000)); // Random postal code
        String city = CITIES[RANDOM.nextInt(CITIES.length)];
        String country = COUNTRIES[RANDOM.nextInt(COUNTRIES.length)];
        return new Address(street, flatNo, houseNo, postalCode, city, country);
    }
}
