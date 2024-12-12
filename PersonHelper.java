import java.util.ArrayList;
import java.util.List;

public class PersonHelper {

    public List<Person> convertListOfStringsToListOfPeople(List<String> list) {
        List<Person> people = new ArrayList<>();
        for (String data : list) {
            people.add(convertStringToPerson(data));
        }
        return people;
    }

    public Person convertStringToPerson(String data) {
        String[] parts = data.split(";");
        String name = parts[0];
        String surname = parts[1];
        String sex = parts[2];
        int bornYear = Integer.parseInt(parts[3]);
        String job = parts[4];
        double salary = Double.parseDouble(parts[5]);

        String[] addressParts = parts[6].split(",");
        Address address = new Address(
                addressParts[0],
                Integer.parseInt(addressParts[1]),
                Integer.parseInt(addressParts[2]),
                addressParts[3],
                addressParts[4],
                addressParts[5]
        );

        String[] companyParts = parts[7].split(",");
        Company company = new Company(companyParts[0], Integer.parseInt(companyParts[1]));

        return new Person(name, surname, sex, bornYear, job, company, salary, address);
    }
}
