
public class Goods {

	private int goodsID;
	private String goodsNmae;
	private int price;
	private int quantity;
	private int makerCode;
	
	Goods() {
		
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
