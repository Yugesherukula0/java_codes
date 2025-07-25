class Animal{

}
class Dog extends Animal{

}
class Monkey extends Animal{

}

public class instanceofDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Monkey m = new Monkey();
        Integer i=10;
        String s1="yugesh";
        System.out.println(a instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Dog);
        System.out.println(a instanceof Dog);
        System.out.println(i instanceof Integer);
        System.out.println(i instanceof Object);
        System.out.println(i instanceof Number);
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
        System.out.println(s1 instanceof Object);

    }
    
}
