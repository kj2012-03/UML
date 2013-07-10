

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Controller c = new Controller();
		int chk = c.searchGoods();
		
		if (chk == -99) {
			c.recordGoods();
		} else {
			c.addGoods(chk);
		}
		
		
		
	}

}
