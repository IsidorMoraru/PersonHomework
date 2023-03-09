import java.util.Comparator;

public class SecondComparator implements Comparator<Person> {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
         {
            if (firstPerson.getAge() > secondPerson.getAge()) {
                return -1;
            }
            else if (firstPerson.getAge() < secondPerson.getAge()) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
