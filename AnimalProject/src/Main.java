public class Main extends Animal {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.setSpeciesName("Tiger");
//        System.out.println(animal1.getSpeciesName());
//        animal1.setGenusName("Pantera");
//        System.out.println(animal1.getGenusName());

        Species tiger = new Species("tiger");
        System.out.println(tiger.getSpeciesName());
        tiger.setGenusName("pantera");
        System.out.println(tiger.getGenusName());
    }
}
