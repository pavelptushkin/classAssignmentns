public class Wolf extends Animal {
    public Wolf(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The wolf howls");
    }
    @Override
    public void eat(){
        System.out.println("The wolf is eating deer");
    }
    @Override
    public void moves(){
        System.out.println("The wolf moves in a pack");
    }
}
