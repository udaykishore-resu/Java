
import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;
    private String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
    }
    
}

class PersonNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2){
        return p1.getName().compareTo(p2.getName());
    }
}

class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2){
        return Integer.compare(p1.getAge(),p2.getAge());
    }
}

public class ComparatorInterface{
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Nani",33, "Atlanta"),
            new Person("Vanshu", 06, "Cleveland"),
            new Person("Anshu", 30, "Hyderabad")
        };

        Arrays.sort(persons, new PersonNameComparator());
        for(Person p : persons){
            System.out.println(p);
        }

        Arrays.sort(persons,new PersonAgeComparator());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}