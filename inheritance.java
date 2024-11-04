class Animal{
    String name;
    void eat(){
        System.out.println("I am an Animal");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        super.eat();
        System.out.println("I am a dog");
    }
    void display(){
        System.out.println("My name is "+name);
    }
}
class inheritance{
    public static void main(String[] args) {
        Dog Labrador = new Dog();
        Labrador.name="Rohu";
        Labrador.eat();
        Labrador.display();
    }
}
