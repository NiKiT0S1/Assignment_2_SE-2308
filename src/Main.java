import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Student Nikita = new Student("Nikita", "Bobylev", 3.0);
        Student Sanat = new Student("Sanat", "Mamyrbek", 2.90);
        Employee OOP = new Employee("Askar", "Khaimuldin", 2000000);
        Employee Mentor = new Employee("Merey", "Ibraim", 1);

        personList.add(Nikita);
        personList.add(Sanat);
        personList.add(OOP);
        personList.add(Mentor);

        Collections.sort(personList);
        printData(personList);
    }

    public static void printData(ArrayList<Person> people) {
        for(Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount());
        }
    }

}
