
public class Item {
    private ProductInfo productInfo;
    private float productCount;
    
    public Item(String itemId) {
        this.productInfo = ProductInfoFactory.getProductInfo(itemId);
        this.productCount = 0;
    }
    public String getDetails() {
        return "名称：" + productInfo.getName() 
                + ", 数量：" + productCount + productInfo.getUnit()
                + ", 单价：" + productInfo.getPrice() + "(元)" +
                ", 总计：" + getPayedPrice() + "(元)";
    }
    
    public String getPromotionDetail(){
        if (!productInfo.isPromotion()){
            return null;
        }
        double promotionCount = getPromotionPrice() / productInfo.getPrice();
        return "名称：" + productInfo.getName() 
                + ", 数量：" + promotionCount + productInfo.getUnit();
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
