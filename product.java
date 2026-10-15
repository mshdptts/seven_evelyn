public class product {
    

private int id;
private String name;
private double price;
private int quantity;
private boolean isAvailable;





//product class constructor
public product(int id, String name, double price, int quantity, boolean isAvailable) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.isAvailable = isAvailable;
}

//getter methods for class variables

public int getId() {
    return id;}

    public String getName() {
        return name;   }

        public double getPrice() {
            return price;   }

            public int getQuantity() {
                return quantity;   }

                public boolean isAvailable() {
                    return isAvailable;   }













}
