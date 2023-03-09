import java.util.Comparator;

public class FirstComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getName().compareTo(secondPerson.getName());
    }
}
