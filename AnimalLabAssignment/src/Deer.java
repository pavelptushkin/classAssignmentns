public class Deer extends Animal {
    public Deer(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The deer is making deer noise");
    }
    @Override
    public void eat(){
        System.out.println("The deer is eating vegetation");
    }
    @Override
    public void moves(){
        System.out.println("The deer runs away");
    }
}
