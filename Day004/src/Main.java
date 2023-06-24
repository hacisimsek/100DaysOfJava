import javafx.beans.binding.ObjectExpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<Person> beatles = new ArrayList<>();
        beatles.add(new Person("1","John", "Lennon", LocalDate.of(1940, 10, 9)));
        beatles.add(new Person("2","Paul", "McCartney", LocalDate.of(1942, 6, 18)));
        beatles.add(new Person("3","George", "Harrison", LocalDate.of(1943, 2, 25)));
        beatles.add(new Person("4","Ringo", "Starr", LocalDate.of(1940, 7, 7)));
        System.out.println(beatles);
        removeItemUsingEquals(beatles);
        System.out.println(beatles);
        removeItemUsingAnSpecificFilter(beatles);
        System.out.println(beatles);
    }

    public static void removeItemUsingEquals(List<Person> beatles) {
        Person john = new Person("1","John", "Lennon", LocalDate.of(1940, 10, 9));
        beatles.remove(john);
    }

    public static void removeItemUsingAnSpecificFilter(List<Person> beatles) {
        beatles.removeIf(person -> person.getFirstName().equals("Paul"));
    }

    static class Person {
        private final String id;
        private final String firstName;
        private final String lastName;
        private final LocalDate birthDate;

        Person(String id, String firstName, String lastName, LocalDate birthDate) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
        }

        public String getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        @Override
        public boolean equals(Object o){
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return Objects.equals(id, person.id) &&
                    Objects.equals(firstName, person.firstName) &&
                    Objects.equals(lastName, person.lastName) &&
                    Objects.equals(birthDate, person.birthDate);
        }

        @Override
        public int hashCode(){
            return Objects.hash(id, firstName, lastName, birthDate);
        }

        @Override
        public String toString(){
            return "Person{" + "name=" + firstName + ", 'lastName='" + lastName + '\'' + ", 'birthDate=" + birthDate + '}';
        }
    }

}