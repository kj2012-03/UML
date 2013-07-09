import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Controller {

	private View v;
	
	private int makerCode;
	
	private ArrayList<Goods> goods;
	private ArrayList<Maker> maker;
	
	Controller() {
		v = new View();
	}
	
	/**
	 * 入荷された商品のＩＤが登録されているか検索する。
	 * @return 検索された商品ＩＤのリストの添え字
	 */
	public int searchGoods() {
		v.firstDisp();
		int chk = -99;
		for (int i = 0; i < goods.size(); i++) {
			if (v.getInputID() == goods.get(i).getGoodsID()) {
				chk = i;				
			}
		}
		return chk;
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

	
	/**
	 * 未登録の商品を登録する。
	 * @return 商品のコレクション
	 */
	public void recordGoods() {
		v.goodsDisp();
		Goods g = new Goods(v.goodsDisp());
		makerCode = g.getMakerCode();
		searchMaker();
		goods.add(g);
	}
	
	
	/**
	 * 未登録のメーカーを登録する。
	 * @return メーカーのコレクション
	 */
	public void recordMaker() {
		Maker m = new Maker(v.makerDisp());
		maker.add(m);
	}
	
	
	/**
	 * 登録済みの商品に入荷した数量を加算する。
	 * @param num 入荷した商品の格納されているリストの添え字
	 */
	public void addGoods(int num) {
		int stock = goods.get(num).getQuantity();
		stock += v.getInputQuantity();
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
	
}
