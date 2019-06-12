public class Bird extends Animal {

    public Bird(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("Bird Chirps");
    }
    @Override
    public void eat(){
        System.out.println("The bird is eating seeds");
    }
    @Override
    public void moves(){
        System.out.println("The bird is flying");
    }
}
