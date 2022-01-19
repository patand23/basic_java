public class MainRunner
{
    public static void main(String[] args) {
        // create objects led and halogen
        Lamp dog_light = new Lamp();
        Lamp cat_light = new Lamp();

        // turn on the light by calling method turnOn()
        // turn off the light by calling method turnOff()
        System.out.print("Is the dog's light on? ");
        dog_light.turnOn();

        System.out.print("Is the cat's light on? ");
        cat_light.turnOn();
    }

}
