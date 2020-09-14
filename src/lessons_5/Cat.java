package lessons_5;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    @SuppressWarnings("static-access")
	public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        myAnimal.testInstanceMethod();
        myAnimal.testClassMethod();
        myCat.testInstanceMethod();
        myCat.testClassMethod();
    }
}
