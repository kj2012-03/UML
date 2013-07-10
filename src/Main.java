import java.io.IOException;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Controller c = new Controller();
		
		while (true) {
			int chk = c.searchGoods();
			
			if (chk == -99) {
				c.recordGoods();
			} else {
				c.addGoods(chk);
			}
			System.out.println("次の伝票を入力しますか？\n(y/n)>");
			try {
				String str = c.inputMess();
				if (str.equals("y")) {
					continue;
				} else {
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("システムを終了します。");
		
		
		
	}

}
