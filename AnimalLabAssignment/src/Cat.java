public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The cat meows");
    }
    @Override
    public void eat(){
        System.out.println("The cat is eating mice");
    }
    @Override
    public void moves(){
        System.out.println("The cat is running");
    }
}
