public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian"); //immutable
        Person person2 = person;
        person2 = new Person("John", "American");

    }
}
