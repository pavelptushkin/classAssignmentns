package Store;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class SandwichShop {
    Scanner scanner = new Scanner(System.in);
    String storeName;
    String address;
    String size;
    String isOpenToday;
    String closeTime;
    String hasSoup;
    Boolean openOnSundays;
    String operatingHours;
    String wifi;
    private ArrayList<String> titles;


    public SandwichShop(){

    }

    public SandwichShop(String name){
        this.storeName = name;
        titles = new ArrayList<String>();
        loadTitles();
    }

    private void loadTitles()
    {
        try
        {
            loadStringsToArray(this.titles);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public static void loadStringsToArray(ArrayList<String> arrList) throws IOException
    {
        Path path = Paths.get("Sandwiches.txt");
        arrList.clear();

        // The stream file will also be closed here
        try (Stream<String> lines = Files.lines(path))
        {
            Object[] arr = lines.toArray();

            for(Object t: arr)
            {
                arrList.add(t.toString());
            }
        }
    }

    public String getNumberOfSandwiches(){
        return this.titles.size() + " Total Books in the store";
    }

    public void containsSandwich(){
        System.out.println("The word youre searching for is: ");
        if (this.titles.contains(scanner.nextLine()) == true) System.out.println("Yes we have that sandwich");
        else System.out.println("No we do not have that sandwich");
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return "Address: " + address;
    }

    public void askAddress(){
        System.out.println("What is the address of the store");
        this.address = scanner.nextLine();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return "Size: " + size;
    }

    public void setSize() {
        System.out.println("How big is the store?");
        this.size = scanner.nextLine();
    }

    public String getIsOpenToday() {
        return "The store is always open";
    }

    public void setIsOpenToday(String isOpenToday) {
        this.isOpenToday = isOpenToday;
    }

    public String getCloseTime() {
        return "The store is always open";
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getHasSoup() {

        hasSoup = "The shop used does have soup";
        return hasSoup;
    }

    public Boolean getOpenOnSundays() {
        return openOnSundays;
    }

    public void setOpenOnSundays(Boolean openOnSundays) {
        this.openOnSundays = openOnSundays;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public void getWifi() {
        System.out.println("Yes we do have wifi");
    }
}
