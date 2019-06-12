public class Family extends Order {
    private String familyName;

    public Family(){

    }

    public Family(String familyName){
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
