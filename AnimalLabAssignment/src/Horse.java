public class Horse extends Animal {
    public Horse(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The horse sneers");
    }
    @Override
    public void eat(){
        System.out.println("The horse is eating grass");
    }
    @Override
    public void moves(){
        System.out.println("The horse gallops");
    }
}
