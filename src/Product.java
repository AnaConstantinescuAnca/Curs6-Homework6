public class Product {
    private String name;
    private double price;
    private int quantity = 0;
    private String category;


    public Product(String name, double price, int quantity, String category) {
        this.name= name;
        this.price=price;
        this.quantity=quantity;
        this.category=category;
    }


    public String getName() {
        return this.name = name;
    }

    public double getPrice() {
        return this.price = price;
    }

    public int getQuantity() {
        return this.quantity = quantity;
    }

    public String getCategory() {
        return this.category = category;
    }

  /* public void setCategory(String param){
        category=param;
    }*/
    //hasStock : will return true if the quantity is not 0
    public boolean hasStock() {
        if (quantity != 0) {
            return true;
        } else {
            return false;
        }
    }

    //isCategory(String category) : return true if the category is equal to the parameter
    public boolean isCategory( String paramCategory){
        if (this.category==paramCategory){
            return true;
        }else{
            return false;
        }
    }
   /* public void setCategory(String category){
        this.category = category;
    }*/
}
