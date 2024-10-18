class Product{
    
    private int prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;


    public Product() {
        this.prodId = 0;
        this.prodName = "Unknown";
        this.price = 0.0;
        this.quantityOnHand = 0;
        System.out.println("Default constructor called. Product with default values created.");
    }

    public Product(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = 0.0;
        this.quantityOnHand = 0;
        System.out.println("Constructor with product ID and name called.");
    }

    public Product(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0;
        System.out.println("Constructor with product ID, name, and price called.");
    }
    public Product(int prodId, String prodName, double price, int quantityOnHand) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
        System.out.println("Constructor with all fields called.");
    }

    public double getNetPrice() {
        return price + (price * 0.12);
    }

    public void purchase(int quantity) {
        if (quantity > 0) {
            this.quantityOnHand += quantity;
            System.out.println("Purchased " + quantity + " units of " + prodName + ". Total quantity on hand: " + quantityOnHand);
        } else {
            System.out.println("Invalid quantity to purchase!");
        }
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= this.quantityOnHand) {
            this.quantityOnHand -= quantity;
            System.out.println("Sold " + quantity + " units of " + prodName + ". Total quantity remaining: " + quantityOnHand);
        } else {
            System.out.println("Insufficient stock or invalid quantity to sell!");
        }
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Price: " + price);
        System.out.println("Quantity on Hand: " + quantityOnHand);
    }
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.displayProductDetails();
        System.out.println();

        
        Product product2 = new Product(102, "Mobile Phone");
        product2.displayProductDetails();
        System.out.println();

        Product product3 = new Product(103, "Tablet", 250.0);
        product3.displayProductDetails();
        System.out.println();

        Product product4 = new Product(104, "Smart Watch", 150.0, 30);
        product4.displayProductDetails();
    }
}
