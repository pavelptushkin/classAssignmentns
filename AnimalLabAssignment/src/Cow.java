public class Cow extends Animal {
    public Cow(String name){
        super(name);
    }
    @Override
    public void speak(){
        System.out.println("The cow moos");
    }
    @Override
    public void eat(){
        System.out.println("The grass is eating grass");
    }
    @Override
    public void moves(){
        System.out.println("The cow walks slowly");
    }
}
