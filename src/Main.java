import java.io.IOException;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Controller c = new Controller();
		
//		int inputId = 0;
//		int inputQua = 0;
//		System.out.print("���ׂ��鏤�i�̂h�c����͂��Ă��������B\n>");
//		try {
//			inputId = Integer.parseInt(c.inputMess());
//			System.out.print("���ׂ��鏤�i�̐��ʂ���͂��Ă��������B\n>");
//			inputQua = Integer.parseInt(c.inputMess());
//		} catch (NumberFormatException e) {
//			// TODO �����������ꂽ catch �u���b�N
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO �����������ꂽ catch �u���b�N
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
