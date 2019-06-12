public class Snake extends Animal {

    public Snake(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("The snake hisses");
    }
    @Override
    public void eat(){
        System.out.println("The snake is eating mice");
    }
    @Override
    public void moves(){
        System.out.println("The snake slithers");
    }
}
