
public class Goods {

	private int goodsID;
	private String goodsNmae;
	private int price;
	private int quantity;
	private int makerCode;
	
	Goods() {
		
	}
	
	public boolean searchGoodsID(int goodsID) {
		//商品情報から指定された商品ＩＤと同じ商品があるかどうかをチェックする。
		if (goodsID == 0) {//商品ＩＤが一致した場合
			return true;
		} else {//商品ＩＤが不一致の場合
			return false;
		}
	}
}
