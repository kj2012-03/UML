import java.io.IOException;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Controller c = new Controller();
		
//		int inputId = 0;
//		int inputQua = 0;
//		System.out.print("入荷する商品のＩＤを入力してください。\n>");
//		try {
//			inputId = Integer.parseInt(c.inputMess());
//			System.out.print("入荷する商品の数量を入力してください。\n>");
//			inputQua = Integer.parseInt(c.inputMess());
//		} catch (NumberFormatException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			e.printStackTrace();
//		}
//		c.input(inputId, inputQua);
		int chk = c.searchGoods();
		if (chk != -99) {
			c.addGoods(chk);
		} else {
			
		}
	}

}
