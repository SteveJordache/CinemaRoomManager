
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here

        String tempReference = p1.name;
        int tempReferenceAge = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = tempReference;
        p2.age = tempReferenceAge;





    }
}

/*
class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Stefan";
        p1.age = 45;
        Person p2 = new Person();
        p2.name = "Gena";
        p2.age = 42;
        MakingChanges.changeIdentities(p1, p2);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}*/
