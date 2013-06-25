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
	 * @param goodsID �Z�b�g���� goodsID
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
	 * @param goodsNmae �Z�b�g���� goodsNmae
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
	 * @param price �Z�b�g���� price
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
	 * @param quantity �Z�b�g���� quantity
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
	 * @param makerCode �Z�b�g���� makerCode
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
		//���i��񂩂�w�肳�ꂽ���i�h�c�Ɠ������i�����邩�ǂ������`�F�b�N����B
		if (goodsID == 0) {//���i�h�c����v�����ꍇ
			return true;
		} else {//���i�h�c���s��v�̏ꍇ
			return false;
		}
	}
}
