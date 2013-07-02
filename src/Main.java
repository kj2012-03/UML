import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		Controller c = new Controller();
		
		System.out.print("“ü‰×‚·‚é¤•i‚Ì‚h‚c‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n>");
		int inputId = Integer.parseInt(stdIn.next());
		System.out.print("“ü‰×‚·‚é¤•i‚Ì”—Ê‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B\n>");
		int inputQua = Integer.parseInt(stdIn.next());
		c.input(inputId, inputQua);
		int chk = c.searchGoods();
		if (chk != -99) {
			c.addGoods(chk);
		} else {
			
		}
	}

}
