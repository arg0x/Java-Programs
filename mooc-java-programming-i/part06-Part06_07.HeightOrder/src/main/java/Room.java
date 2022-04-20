import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {

        if (this.persons.isEmpty()) {
            return null;
        } else {
            Person shortestPerson = this.persons.get(0);
            for (Person person : persons) {
                if (shortestPerson.getHeight() > person.getHeight()) {
                    shortestPerson = person;
                }
            }

            return shortestPerson;
        }

    }

    public Person take() {
        Person takePerson;
        if (this.persons.isEmpty()) {
            return null;
        } else {

            takePerson = this.shortest();
            this.persons.remove(takePerson);
            return takePerson;
        }
    }
}
