class ConstructorOver{
    // Fields to store product details
    private int prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    // Default constructor (No arguments)
    public Product() {
        this.prodId = 0;
        this.prodName = "Unknown";
        this.price = 0.0;
        this.quantityOnHand = 0;
        System.out.println("Default constructor called. Product with default values created.");
    }

    // Constructor with product ID and name only
    public Product(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = 0.0;
        this.quantityOnHand = 0;
        System.out.println("Constructor with product ID and name called.");
    }

    // Constructor with product ID, name, and price
    public Product(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0;
        System.out.println("Constructor with product ID, name, and price called.");
    }

    // Constructor with all fields (product ID, name, price, and quantity)
    public Product(int prodId, String prodName, double price, int quantityOnHand) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
        System.out.println("Constructor with all fields called.");
    }

    // Method to get the price after adding 12% tax
    public double getNetPrice() {
        return price + (price * 0.12);
    }

    // Method to add a specific quantity to the stock
    public void purchase(int quantity) {
        if (quantity > 0) {
            this.quantityOnHand += quantity;
            System.out.println("Purchased " + quantity + " units of " + prodName + ". Total quantity on hand: " + quantityOnHand);
        } else {
            System.out.println("Invalid quantity to purchase!");
        }
    }

    // Method to sell a specific quantity from the stock
    public void sell(int quantity) {
        if (quantity > 0 && quantity <= this.quantityOnHand) {
            this.quantityOnHand -= quantity;
            System.out.println("Sold " + quantity + " units of " + prodName + ". Total quantity remaining: " + quantityOnHand);
        } else {
            System.out.println("Insufficient stock or invalid quantity to sell!");
        }
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Price: " + price);
        System.out.println("Quantity on Hand: " + quantityOnHand);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Create a product using the default constructor
        Product product1 = new Product();
        product1.displayProductDetails();
        System.out.println();

        // Create a product using the constructor with product ID and name
        Product product2 = new Product(102, "Mobile Phone");
        product2.displayProductDetails();
        System.out.println();

        // Create a product using the constructor with product ID, name, and price
        Product product3 = new Product(103, "Tablet", 250.0);
        product3.displayProductDetails();
        System.out.println();

        // Create a product using the constructor with all fields
        Product product4 = new Product(104, "Smart Watch", 150.0, 30);
        product4.displayProductDetails();
    }
}
