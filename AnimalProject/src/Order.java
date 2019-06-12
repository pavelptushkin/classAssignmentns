public class Order extends Class{
    private String orderName;

    public Order(){

    }

    public Order(String orderName){
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
