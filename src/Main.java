import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		Controller c = new Controller();
		
		System.out.print("入荷する商品のＩＤを入力してください。\n>");
		int inputId = Integer.parseInt(stdIn.next());
		System.out.print("入荷する商品の数量を入力してください。\n>");
		int inputQua = Integer.parseInt(stdIn.next());
		c.input(inputId, inputQua);
		int chk = c.searchGoods();
		if (chk != -99) {
			c.addGoods(chk);
		} else {
			
		}
	}

}
