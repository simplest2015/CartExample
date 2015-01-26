
public class Item {
    private ProductInfo productInfo;
    private float productCount;
    
    public Item(String itemId) {
        this.productInfo = ProductInfoFactory.getProductInfo(itemId);
        this.productCount = 0;
    }
    public String getDetails() {
        return "���ƣ�" + productInfo.getName() 
                + ", ������" + productCount + productInfo.getUnit()
                + ", ���ۣ�" + productInfo.getPrice() + "(Ԫ)" +
                ", �ܼƣ�" + getPayedPrice() + "(Ԫ)";
    }
    
    public String getPromotionDetail(){
        if (!productInfo.isPromotion()){
            return null;
        }
        double promotionCount = getPromotionPrice() / productInfo.getPrice();
        return "���ƣ�" + productInfo.getName() 
                + ", ������" + promotionCount + productInfo.getUnit();
    }
    
    public void increaseProductCount(float count) {
        productCount += count;
    }
    
    public double getToatalPrice() {
        return productCount * productInfo.getPrice();
    }
    
    public double getPromotionPrice() {
        if(productInfo.isPromotion() && productCount > 1){
            return productInfo.getPrice();
        }
        return 0;
    }
    
    public double getPayedPrice() {
        return getToatalPrice() - getPromotionPrice();
    }
}
