package Year_2020_1_19_java复习$$$$._005Set;

import java.util.Objects;

public class Person implements Comparable<Person>{
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAge());
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
