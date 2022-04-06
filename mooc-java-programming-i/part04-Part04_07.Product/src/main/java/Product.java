public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initalName, double initialPrice, int initialQuantity){
        this.name = initalName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProduct() {
        System.out.println(this.name+", "+"price "+this.price+", "+this.quantity+" pcs");
    }
}
