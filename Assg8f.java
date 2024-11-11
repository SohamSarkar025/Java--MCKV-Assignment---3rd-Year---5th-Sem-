
interface Animal{
    void eat();
}
interface Mamamal{
    void bark();
}
interface domestic{
    void play();
}

class Dog implements Animal,Mamamal,domestic{
    
    public void eat(){
        System.out.println("Dog is eating....");
    }
    public void bark(){
        System.out.println("The dog is barking....");
    }
    public void play(){
        System.out.println("The dog is playing....");
    }
}


public class Assg8f {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
        dog.bark();
    }
}
