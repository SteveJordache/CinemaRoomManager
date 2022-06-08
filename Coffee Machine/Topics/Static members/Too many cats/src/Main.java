
class Cat {

    // write static and instance variables

    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        counter++;
        if (getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }

    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 10);
        Cat cat2 = new Cat("Pussy", 1);
        Cat cat3 = new Cat("Cleo", 2);
        Cat cat4 = new Cat("Pufu", 4);
        Cat cat5 = new Cat("Pandele", 1);
        Cat cat6 = new Cat("Negruta", 12);
        Cat cat7 = new Cat("Mitica", 15);
        System.out.println(Cat.getNumberOfCats());
    }
}*/
