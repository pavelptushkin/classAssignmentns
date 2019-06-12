public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Dog is barking");
    }
    @Override
    public void eat(){
        System.out.println("The dog is chewing on a bone");
    }
    @Override
    public void moves(){
        System.out.println("The dog is running");
    }
}
