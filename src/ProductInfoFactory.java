
public class ProductInfoFactory {
    public static ProductInfo getProductInfo(String itemID) {
        if ("ITEM000005".equals(itemID)){
            return new ProductInfo("�ɿڿ���", 3.00, "ƿ", true);
        } else if ("ITEM000001".equals(itemID)){
            return new ProductInfo("��ë��", 1.00, "��", true);
        } else if ("ITEM000003".equals(itemID)){
            return new ProductInfo("ƻ��", 5.50, "��", false);
        } else{
            return null;
        }
    }
}
