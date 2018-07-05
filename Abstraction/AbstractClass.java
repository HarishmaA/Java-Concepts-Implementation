package Abstraction;

abstract class Animals
{
    // They all love to eat. So let's implement them for everybody
    void eat()
    {
        System.out.println("Eating...");
    }
    // The make different sounds. They will provide their own implementation.
    abstract void sound();
}
 
class Dog extends Animals
{
    void sound()
    {
        System.out.println("Woof Woof");
    }
}
 
class Cat extends Animals
{
    void sound()
    {
        System.out.println("Meow Meow");
    }
}
