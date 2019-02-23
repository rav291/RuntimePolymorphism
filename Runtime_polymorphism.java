class bike
{
    void run()
    {
        System.out.println("Unimaginable speed, beware");
    }
}
class splendor extends bike
{
    void run()
    {
        System.out.println("Auto speed-check, so no worry felas");
    }
}



public class Runtime_polymorphism
{
    public static void main(String args[])
    {
        splendor b1= new splendor();
        b1.run();
        bike b2 = new bike();
        b2.run();
        bike b3 = new splendor(); // NOTE: UP CASTING
        b3.run();


    }
}
//NOTES:

//Runtime polymorphism or dynamic dispatch method is the process in which
//the call to an overriden method is resolved at the runtime instead of the compile time.