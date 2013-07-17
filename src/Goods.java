import java.util.ArrayList;

public class Goods {

	private int goodsID;
	private String goodsName;
	private int price;
	private int quantity;
	private int makerCode;

	/**
	 * @return goodsID
	 */
	public int getGoodsID() {
		return this.goodsID;
	}

	/**
	 * @param goodsID
	 *            セットする goodsID
	 */
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}

	/**
	 * @return goodsNmae
	 */
	public String getGoodsName() {
		return this.goodsName;
	}

	/**
	 * @param goodsNmae
	 *            セットする goodsNmae
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * @param price
	 *            セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**
	 * @param quantity
	 *            セットする quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return makerCode
	 */
	public int getMakerCode() {
		return this.makerCode;
	}

	/**
	 * @param makerCode
	 *            セットする makerCode
	 */
	public void setMakerCode(int makerCode) {
		this.makerCode = makerCode;
	}

	/**
	 * Goodsクラスのコンストラクタ
	 * 
	 * @param goodsInfo
	 *            新規商品情報
	 */
	Goods(ArrayList<String> goodsInfo) {
		this.goodsID = Integer.parseInt(goodsInfo.get(0));
		this.goodsName = goodsInfo.get(1);
		this.price = Integer.parseInt(goodsInfo.get(2));
		this.quantity = Integer.parseInt(goodsInfo.get(3));
		this.makerCode = Integer.parseInt(goodsInfo.get(4));
	}

	/**
	 * 在庫作成用コンストラクタ
	 * 
	 * @param id
	 *            商品ＩＤ
	 * @param name
	 *            商品名
	 * @param price
	 *            価格
	 * @param qua
	 *            数量
	 * @param code
	 *            メーカーコード
	 */
	Goods(int id, String name, int price, int qua, int code) {
		this.goodsID = id;
		this.goodsName = name;
		this.price = price;
		this.quantity = qua;
		this.makerCode = code;
	}
}
