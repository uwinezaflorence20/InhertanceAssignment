//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  //Starting with the bird
        Bird bird = new Bird();
        bird.makeSound();
        bird.fly();
  //Dog

        Dog dog = new Dog();
        dog.makeSound();
  //cat
        Cat cat = new Cat();
        cat.makeSound();

    }
}