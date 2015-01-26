
public class ProductInfoFactory {
    public static ProductInfo getProductInfo(String itemID) {
        if ("ITEM000005".equals(itemID)){
            return new ProductInfo("可口可乐", 3.00, "瓶", true);
        } else if ("ITEM000001".equals(itemID)){
            return new ProductInfo("羽毛球", 1.00, "个", true);
        } else if ("ITEM000003".equals(itemID)){
            return new ProductInfo("苹果", 5.50, "斤", false);
        } else{
            return null;
        }
    }
}
