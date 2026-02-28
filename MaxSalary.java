package Java_Programs;

import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int salary;

    Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class MaxSalary {
    public static void main(String[] args) {
        Person p1 = new Person("John", 10000);
        Person p2 = new Person("Doe", 20000);
        Person p3 = new Person("Basil", 15000);

        List<Person> personsList = List.of(p1, p2, p3);

        String result = personsList.stream().sorted(Comparator.comparing(Person::getSalary).reversed())
                .map(a -> a.name + ": " + a.salary)
                .findFirst().get();
        // .collect(Collectors.toList());

        System.out.println(result);

    }
}
