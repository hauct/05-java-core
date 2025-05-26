package bai4;

public class Product {
    
    private String name;
    private Double price;
    private Double tax;

    public Product(){
    }

    public Product(String name, Double price, Double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void xuatThongTin(Product pr){
        System.out.println("Tên sản phẩm: " + pr.name + " - Giá: " + pr.price + " - Thuế: " + pr.tax);
    }

    public Product nhapThongTin(String name, double price, double tax){
        Product pr = new Product(name, price, tax);
        return pr;
    }

    public double getTaxPrice(Double price, Double tax) {
        return price * tax;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
