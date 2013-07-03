import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Controller {

	private ArrayList<String> goodsInfo;
	private ArrayList<String> makerInfo;
	
	private int inputID;
	private int inputQuantity;
	
	private int goodsID;
	private String goodsName;
	private int price;
	private int quantity;
	private int makerCode;
	
	private String makerName;
	private String tel;
	private String address;
	
	private Goods newGoods;
	private Maker newMaker;
	private ArrayList<Goods> goods;
	private ArrayList<Maker> maker;
	
	
	/**
	 * 未登録の商品を登録する。
	 * @return 商品のコレクション
	 */
	public void recordGoods() {
		String[] item = {"商品ＩＤ", "商品名", "価格", "入荷量", "メーカーコード"};
		System.out.print("商品ＩＤ\n>" + inputID);
		goodsInfo.add(Integer.toString(inputID));
		try {
			for (int i = 1; i < item.length; i++) {
				System.out.print(item[i] + "\n>");
				goodsInfo.add(inputMess());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		newGoods = new Goods(goodsInfo);
		makerCode = newGoods.getMakerCode();
		searchMaker();
		newGoods.displayGoods();
		goods.add(newGoods);
	}
	
	/**
	 * 入荷商品の商品ＩＤと数量を入力する。
	 * @param goodsID 商品コード
	 * @param quantity 入荷数量
	 */
//	public void input(int goodsID, int quantity) {
//		this.inputID = goodsID;
//		this.inputQuantity = quantity;
//	}
	
	/**
	 * 未登録のメーカーを登録する。
	 * @return メーカーのコレクション
	 */
	public void recordMaker() {
		String[] item = {"メーカーコード", "メーカー名", "連絡先", "住所"};
		System.out.print("メーカーコード\n>" + makerCode);
		makerInfo.add(Integer.toString(makerCode));
		try {
			for (int i = 1; i < item.length; i++) {
				System.out.print(item[i] + "\n>");
				makerInfo.add(inputMess());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		newMaker = new Maker(makerInfo);
		maker.add(newMaker);
	}
	
	/**
	 * 入荷された商品のＩＤが登録されているか検索する。
	 * @return 検索された商品ＩＤのリストの添え字
	 */
	public int searchGoods() {
		int chk = -99;
		for (int i = 0; i < goods.size(); i++) {
			if (inputID == goods.get(i).getGoodsID()) {
				chk = i;				
			}
		}
		return chk;
	}
	
	/**
	 * 登録済みの商品に入荷した数量を加算する。
	 * @param num 入荷した商品の格納されているリストの添え字
	 */
	public void addGoods(int num) {
		int stock = goods.get(num).getQuantity();
		stock += inputQuantity;
		goods.get(num).setQuantity(stock);
	}
	
	/**
	 * 文字列を入力する。
	 * @return 入力された文字列1行
	 * @throws IOException
	 */
	public String inputMess() throws IOException {
		String s = null;
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			s = input.readLine();
		} catch (IOException e) {
			throw e;
		}
		return s;
	}
	
	/**
	 * 入力されたメーカーのコードが登録されているか検索する。
	 * @return メーカーコード
	 */
	public int searchMaker() {
		for (int i = 0; i < maker.size(); i++) {
			if (makerCode == maker.get(i).getMakerCode()) {
				return makerCode;
			}
		}
		recordMaker();
		return makerCode;
	}
}
