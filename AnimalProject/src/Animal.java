public class Animal {
    protected String speciesName;
    protected String genusName;
    protected String familyName;
    protected String orderName;
    protected String className;
    protected String phylumName;
    protected String kingdomName;
    protected String diet;

    public Animal(){

    }

    public Animal(String speciesName, String genusName, String familyName, String orderName, String className, String phylumName, String kingdomName) {
        this.speciesName = speciesName;
        this.genusName = genusName;
        this.familyName = familyName;
        this.orderName = orderName;
        this.className = className;
        this.phylumName = phylumName;
        this.kingdomName = kingdomName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getGenusName() {
        return genusName;
    }

    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPhylumName() {
        return phylumName;
    }

    public void setPhylumName(String phylumName) {
        this.phylumName = phylumName;
    }

    public String getKingdomName() {
        return kingdomName;
    }

    public void setKingdomName(String kingdomName) {
        this.kingdomName = kingdomName;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
