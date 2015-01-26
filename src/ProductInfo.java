
public class ProductInfo {
    private String name;
    private double price;
    private String unit;
    private boolean isPromotion;
    
    public ProductInfo(String name, double price, String unit, boolean isPromotion) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.isPromotion = isPromotion;
    }
    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPromotion() {
        return isPromotion;
    }
}
