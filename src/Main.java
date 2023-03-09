import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> treeSet=new TreeSet<> (new FirstComparator());
        TreeSet<Person> treeSet2=new TreeSet<> (new SecondComparator());
        Person firstPerson=new Person("zarbu",55);
        Person secondPerson=new Person("Stefanescu", 34);

        treeSet.add(firstPerson);
        treeSet.add(secondPerson);

        treeSet2.add(firstPerson);
        treeSet2.add(secondPerson);


        System.out.println("First comparator");
        for( Person p: treeSet){
            System.out.println(p);
        }
        System.out.println("Second comparator");
        for(Person p1: treeSet2){
            System.out.println(p1);
        }


        List<Adress> adressList=new ArrayList<Adress>();
        Adress a1=new Adress("Nicolae Iorga", 41);
        Adress a2=new Adress("Berzei", 4);
        Adress a3=new Adress("Independetei", 67);
        Adress a4=new Adress("13 Decembrie", 234);
        Adress a5=new Adress("Primaverii", 3);

        adressList.add(a1);
        adressList.add(a2);
        adressList.add(a3);
        adressList.add(a4);
        adressList.add(a5);


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for(Adress ad:adressList)
            {
                System.out.println(ad);
            }



        Hobby fishing=new Hobby("fishing",2,adressList);



    }
}
