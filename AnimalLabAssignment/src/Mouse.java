public class Mouse extends Animal {
    public Mouse(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The mouse squeaks");
    }
    @Override
    public void eat(){
        System.out.println("The mouse is eating cheese");
    }
    @Override
    public void moves(){
        System.out.println("The mouse is moving around fast");
    }
}
