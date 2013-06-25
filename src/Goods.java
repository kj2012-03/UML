import java.util.ArrayList;


public class Goods {

	private int goodsID;
	private String goodsNmae;
	private int price;
	private int quantity;
	private int makerCode;
	
	/**
	 * @return goodsID
	 */
	public int getGoodsID() {
		return goodsID;
	}

	/**
	 * @param goodsID セットする goodsID
	 */
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}

	/**
	 * @return goodsNmae
	 */
	public String getGoodsNmae() {
		return goodsNmae;
	}

	/**
	 * @param goodsNmae セットする goodsNmae
	 */
	public void setGoodsNmae(String goodsNmae) {
		this.goodsNmae = goodsNmae;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity セットする quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return makerCode
	 */
	public int getMakerCode() {
		return makerCode;
	}

	/**
	 * @param makerCode セットする makerCode
	 */
	public void setMakerCode(int makerCode) {
		this.makerCode = makerCode;
	}

	Goods(ArrayList<String> goodsInfo) {
		this.goodsID = Integer.parseInt(goodsInfo.get(0));
		this.goodsNmae = goodsInfo.get(1);
		this.price = Integer.parseInt(goodsInfo.get(2));
		this.quantity = Integer.parseInt(goodsInfo.get(3));
		this.makerCode = Integer.parseInt(goodsInfo.get(4));
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
