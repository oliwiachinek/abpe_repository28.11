import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataGenerator dataGenerator = new DataGenerator();
        FileHelper fileHelper = new FileHelper();
        PersonHelper personHelper = new PersonHelper();

        // Generate people and save to file
        List<Person> people = dataGenerator.generatePeopleList(10);
        fileHelper.saveListToFile(people, "people.txt");

        // Read people from file and convert back to objects
        List<String> lines = fileHelper.readFromFile("people.txt");
        List<Person> loadedPeople = personHelper.convertListOfStringsToListOfPeople(lines);

        // Display loaded people
        for (Person person : loadedPeople) {
            System.out.println(person);
        }
    }
}
