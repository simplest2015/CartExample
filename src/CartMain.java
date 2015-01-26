
public class CartMain {

    public static void main(String[] args) {
        String input = "['ITEM000001',\n"
                        + "'ITEM000001',\n"
                        + "'ITEM000001',\n"
                        + "'ITEM000001',\n"
                        + "'ITEM000001',\n"
                        + "'ITEM000003-2',\n"
                        + "'ITEM000005',\n"
                        + "'ITEM000005',\n"
                        + "'ITEM000005',\n"
                        + "]";
        System.out.println(input);
        Cart cart = new Cart(input);
        cart.printInventory();
    }
}
