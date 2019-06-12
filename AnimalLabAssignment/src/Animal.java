public class Animal {
    protected String animalName;


    public Animal(String name){
        animalName = name;
    }

    public void getAnimalInfo() {
        System.out.println("Kingdom: Animal");
        System.out.println("Species: " + animalName);
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void speak(){
        System.out.println("Speaking.....");
    }

    public void eat(){
        System.out.println("Eating.....");
    }

    public void moves(){
        System.out.println("Moving....");
    }

}
