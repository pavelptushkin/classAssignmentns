import Store.Bookstore;
import Store.SandwichShop;

public class Main {
    public static void main(String[] args) {
        Bookstore store1 = new Bookstore("Macys");
        store1.askAddress();
        store1.setSize();
        System.out.println(store1.getAddress());
        System.out.println(store1.getIsOpenToday());
        System.out.println(store1.getCloseTime());
        System.out.println(store1.getSize());
        System.out.println(store1.getHasBooks());
        System.out.println(store1.getNumberOfBooks());
        store1.containsBook();
        SandwichShop shop1 = new SandwichShop("wichwich");
        shop1.askAddress();
        shop1.setSize();
        shop1.containsSandwich();
        shop1.getWifi();
    }
}
