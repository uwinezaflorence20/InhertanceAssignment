public class Animal {
    public void makeSound(){
        System.out.println("Generic animal sound");
    }
}

//Dog class
    class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println(" The Dog says: Woof!!");
        }
    }
//cat class

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println(" The Cat says: Meow!!");
    }
}


// a class bird extends Animal class
class Bird extends Animal{

//overriding makesound in bird

    @Override
    public void makeSound(){
        System.out.println(" The Bird says :Chirp!");
    }
//Fly method
    public void fly(){
        System.out.println(" The Bird does : flying!");
    }
}
