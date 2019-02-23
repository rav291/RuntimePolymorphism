class Animal
{
    Animal()
    {
        System.out.println("Animal is created");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.println("Dog is created");
    }
}

public class Testsuper
{
    public static void main(String args[])
    {
        Dog y = new Dog();
    }
}


//Super() is used to call the super class method, in this case Animal.
//The revrse however is  npt true.