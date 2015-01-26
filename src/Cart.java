import java.util.HashMap;


public class Cart {
	private HashMap<String, Item> items = new HashMap<String, Item>();
	
	public Cart(String input) {
		if (!isValidInput(input)) {
			return;
		}
		String result = filterInput(input);
		initItems(result);
	}

	private String filterInput(String input) {
		String result =input.replace("[", "")
				.replace("]", "")
				.replace("'", "")
				.replace("\n", "");
		return result;
	}

	private void initItems(String input) {
		String[] itemIds = input.split(",");
		for (String itemId : itemIds) {
			String currentItemId = itemId;
			int increaseProductCount = 1;
			if (itemId.indexOf('-') > -1) {
				currentItemId = itemId.substring(0, itemId.indexOf('-'));
				increaseProductCount = Integer.parseInt(itemId.substring(itemId.indexOf('-') + 1, itemId.length())) ;
			}
			if (!items.containsKey(currentItemId)) {
				Item item = new Item(currentItemId);
				item.increaseProductCount(increaseProductCount);
				items.put(currentItemId, item);
			} else{
				items.get(currentItemId).increaseProductCount(increaseProductCount);
			}
		}
	}
	
	private boolean isValidInput(String input) {
		if (input == null || input.isEmpty()
				|| !input.startsWith("[")
				|| !input.endsWith("]")) {
			return false;
		} else{
			return true;
		}
	}

	public void printInventory(){
		printTitle();
		printProductDetails();
		printLine();
		printPromotionDetail();
		printLine();
		printSummary();
		printEnd();
	}
	
	private void printTitle() {
		System.out.println("***<ûǮ׬�̵�>�����嵥***");
	}
	
	private void printProductDetails() {
		for (Item item : items.values()){
			System.out.println(item.getDetails());
		}
	}
	
	private void printLine() {
		System.out.println("------------------");
	}
	
	private void printPromotionDetail() {
		System.out.println("����������Ʒ:");
		for (Item item : items.values()){
			if (item.getPromotionDetail() != null){
				System.out.println(item.getPromotionDetail());
			}
		}
	}

	private void printSummary() {
		double payedPrice = 0;
		double savingPrice = 0;
		for (Item item : items.values()){
			payedPrice += item.getPayedPrice();
			savingPrice += item.getPromotionPrice();
		}
		System.out.println("�ܽ�: " + payedPrice + "(Ԫ)");
		System.out.println("��ʡ: " + savingPrice + "(Ԫ)");
	}

	private void printEnd() {
		System.out.println("***********************");
	}








	
}
