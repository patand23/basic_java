public abstract class Animal {

    private int age;
    private String name;

    // methods shared between among animals
    public void sleep() {
        System.out.println(" sleeps.");
    }

    public void eat() {
        System.out.println(" eats ");
    }

    // specialized methods that we don't know how to
    // implement, or doesn't make sense to define here
    // since it is not common for all animals
    public abstract void makeSound();
}

