public class Hawk extends Animal {
    public Hawk(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The hawk screetches");
    }
    @Override
    public void eat(){
        System.out.println("The hawk is eating small animals");
    }
    @Override
    public void moves(){
        System.out.println("The hawk flies");
    }
}
