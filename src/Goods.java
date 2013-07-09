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
	 * @param goodsID �Z�b�g���� goodsID
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
	 * @param goodsNmae �Z�b�g���� goodsNmae
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
	 * @param price �Z�b�g���� price
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
	 * @param quantity �Z�b�g���� quantity
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
	 * @param makerCode �Z�b�g���� makerCode
	 */
	public void setMakerCode(int makerCode) {
		this.makerCode = makerCode;
	}

	Goods(ArrayList<String> goodsInfo) {
		this.goodsID = Integer.parseInt(goodsInfo.get(0));
		this.goodsName = goodsInfo.get(1);
		this.price = Integer.parseInt(goodsInfo.get(2));
		this.quantity = Integer.parseInt(goodsInfo.get(3));
		this.makerCode = Integer.parseInt(goodsInfo.get(4));
	}
	
	
}
