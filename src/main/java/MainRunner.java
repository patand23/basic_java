public class MainRunner
{
    public static void main(String[] args) {
        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by
        // calling method turnOn()
        System.out.print("Is the led light on? ");
        led.turnOff();

        // turn off the light by
        // calling method turnOff()
        System.out.print("Is the halogen light on? ");
        halogen.turnOn();
    }

}
