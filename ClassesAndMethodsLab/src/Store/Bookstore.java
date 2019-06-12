package Store;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {
    Scanner scanner = new Scanner(System.in);
    String storeName;
    String address;
    String size;
    String isOpenToday;
    String closeTime;
    String hasBooks;
    Boolean openOnSundays;
    String operatingHours;
    private ArrayList<String> titles;


    public Bookstore(){

    }

    public Bookstore(String name){
        this.storeName = name;
        titles = new ArrayList<String>();
        loadTitles();
    }

    private void loadTitles()
    {
        try
        {
            Utils.loadStringsToArray(this.titles);
        }
        catch (IOException e)
        {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public String getNumberOfBooks(){
        return this.titles.size() + " Total Books in the store";
    }

    public void containsBook(){
        System.out.println("The book youre searching for is: ");
        if (this.titles.contains(scanner.nextLine()) == true) System.out.println("Yes we have a book that contains that book");
        else System.out.println("No we do not have a book that contains that word");
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

    public String getHasBooks() {

        hasBooks = "Has used and new books";
        return hasBooks;
    }

    public void setHasUsedBooks(String hasUsedBooks) {
        this.hasBooks = hasUsedBooks;
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
}
