import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class View {


	private int inputID;
	private int inputQuantity;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	View(){
	}
	//商品ID、数量を入力
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

	//商品入力
	public ArrayList<String> goodsDisp() {
		ArrayList<String> goodsInfo = new ArrayList<String>();
		String[] goods = new String[5];
		while(true){
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

				System.out.println("[入力情報]");
				for(int i = 0; i < col.length; i++){
					System.out.printf("%5s:%-5s",col[i],goods[i]);
				}

				System.out.println();
				System.out.println("これでよろしいなら[y]を入力してください");
				System.out.println("[y]以外なら再入力します");
				String ans = br.readLine();

				if(ans.equals("y")){
					for(String str : goods){
						goodsInfo.add(str);
					}
					break;
				}else{
					System.out.println("再入力します");
				}

			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		return goodsInfo;
	}

	//メーカー入力
	public ArrayList<String> makerDisp() {
		ArrayList<String> makerInfo = new ArrayList<String>();
		String[] maker = new String[4];
		while(true){
			try {
				while(true){
					System.out.println("メーカーコードを入力してください");
					maker[0] = br.readLine();
					if(checkNumber(maker[0])){
						break;
					}else{
						System.out.println("入力が正しくないです");
						System.out.println("数値を入力してください");
					}
				}

				System.out.println("メーカー名を入力してください");
				maker[1] = br.readLine();

				while(true){
					System.out.println("連絡先を入力してください");
					maker[2] = br.readLine();
					if(checkNumber(maker[2])){
						break;
					}else{
						System.out.println("入力が正しくないです");
						System.out.println("数値を入力してください");
					}
				}

				System.out.println("住所を入力してください");
				maker[3] = br.readLine();

				//項目名
				String[] col  = {"メーカーID", "メーカー名", "連絡先", "住所"};

				System.out.println("[入力情報]");
				for(int i = 0; i < col.length; i++){
					System.out.printf("%5s:%-5s",col[i],maker[i]);
				}

				System.out.println();
				System.out.println("これでよろしいなら[y]を入力してください");
				System.out.println("[y]以外なら再入力します");
				String ans = br.readLine();

				if(ans.equals("y")){
					for(String str : maker){
						makerInfo.add(str);
					}
					break;
				}else{
					System.out.println("再入力します");
				}

			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
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