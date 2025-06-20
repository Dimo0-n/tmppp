package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Mikel", "Arteta")
                .age(42)
                .address("1 North London")
                .phoneNumber("111-1234")
                .build();

        System.out.println(person);
    }
}
