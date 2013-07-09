import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class View {

	private ArrayList<String> goodsInfo;
	private ArrayList<String> makerInfo;

	private int inputID;
	private int inputQuantity;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void firstDisp() {
		try {
			while(true){
				System.out.println("商品IDを入力してください");
				String str = br.readLine();
				if(checkNumber(str)){
					inputID = Integer.parseInt(str);
					break;
				}else{
					System.out.println("入力が正しくないです");
					System.out.println("数値を入力してください");
					System.out.println();
				}
			}

			while(true){
				System.out.println("入荷する数量を入力してください");
				String str = br.readLine();
				if(checkNumber(str)){
					inputQuantity = Integer.parseInt(str);
					break;
				}else{
					System.out.println("入力が正しくないです");
					System.out.println("数値を入力してください");
					System.out.println();
				}
			}

		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	public ArrayList<String> goodsDisp() {
		String[] goods = new String[5];
		try {
			//ID
			goods[0] = String.valueOf(this.inputID);

			System.out.println("商品名を入力してください");
			goods[1] = br.readLine();

			while(true){
				System.out.println("値段を入力してください");
				goods[2] = br.readLine();
				if(checkNumber(goods[2])){
					break;
				}else{
					System.out.println("入力が正しくないです");
					System.out.println("数値を入力してください");
				}
			}

			//数量
			goods[3] = String.valueOf(this.inputQuantity);

			while(true){
				System.out.println("メーカーコードを入力してください");
				goods[4] = br.readLine();
				if(checkNumber(goods[4])){
					break;
				}else{
					System.out.println("入力が正しくないです");
					System.out.println("数値を入力してください");
				}
			}

			//項目名
			String[] col  = {"商品ID", "商品名", "値段", "数量", "メーカーコード"};

			System.out.println("----------入力情報-----------");
			for(int i = 0; i < 5; i++){
				System.out.printf("%5s:%-5s",col[i],goods[i]);
			}


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return goodsInfo;
	}

	public ArrayList<String> makerDisp() {
		return makerInfo;
	}

	public int getInputID() {
		return inputID;
	}

	public int getInputQuantity() {
		return inputQuantity;
	}

	public boolean checkNumber(String str){
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}