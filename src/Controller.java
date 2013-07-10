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
		maker = new ArrayList<Maker>();
		for (int i = 0; i < 10; i++) {
			maker.add(new Maker(i, "Maker" + i, "000-000-000" + i, "Addres" + i));
		}
		goods = new ArrayList<Goods>();
		for (int i = 0; i < 10; i++) {
			goods.add(new Goods(i, "Goods" + i, i * 100, i + 10, i));
		}
		v = new View();
	}
	
	/**
	 * “ü‰×‚³‚ê‚½¤•i‚Ì‚h‚c‚ª“o˜^‚³‚ê‚Ä‚¢‚é‚©ŒŸõ‚·‚éB
	 * @return ŒŸõ‚³‚ê‚½¤•i‚h‚c‚ÌƒŠƒXƒg‚Ì“Y‚¦Žš
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
	 * “ü—Í‚³‚ê‚½ƒ[ƒJ[‚ÌƒR[ƒh‚ª“o˜^‚³‚ê‚Ä‚¢‚é‚©ŒŸõ‚·‚éB
	 * @return ƒ[ƒJ[ƒR[ƒh
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
	 * –¢“o˜^‚Ì¤•i‚ð“o˜^‚·‚éB
	 * @return ¤•i‚ÌƒRƒŒƒNƒVƒ‡ƒ“
	 */
	public void recordGoods() {
		v.goodsDisp();
		Goods g = new Goods(v.goodsDisp());
		makerCode = g.getMakerCode();
		searchMaker();
		goods.add(g);
	}
	
	
	/**
	 * –¢“o˜^‚Ìƒ[ƒJ[‚ð“o˜^‚·‚éB
	 * @return ƒ[ƒJ[‚ÌƒRƒŒƒNƒVƒ‡ƒ“
	 */
	public void recordMaker() {
		Maker m = new Maker(v.makerDisp());
		maker.add(m);
	}
	
	
	/**
	 * “o˜^Ï‚Ý‚Ì¤•i‚É“ü‰×‚µ‚½”—Ê‚ð‰ÁŽZ‚·‚éB
	 * @param num “ü‰×‚µ‚½¤•i‚ÌŠi”[‚³‚ê‚Ä‚¢‚éƒŠƒXƒg‚Ì“Y‚¦Žš
	 */
	public void addGoods(int num) {
		int stock = goods.get(num).getQuantity();
		stock += v.getInputQuantity();
		goods.get(num).setQuantity(stock);
	}
	
	/**
	 * •¶Žš—ñ‚ð“ü—Í‚·‚éB
	 * @return “ü—Í‚³‚ê‚½•¶Žš—ñ1s
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
