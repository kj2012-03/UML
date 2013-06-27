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
	
	
	ArrayList<Goods> goods;
	ArrayList<Maker> maker;
	
	public ArrayList<String> recordGoods() {
		goodsInfo.add(Integer.toString(goodsID));
		goodsInfo.add(goodsName);
		goodsInfo.add(Integer.toString(price));
		goodsInfo.add(Integer.toString(quantity));
		goodsInfo.add(Integer.toString(makerCode));
		return goodsInfo;
	}
	
	/**
	 * ���׏��i�̏��i�h�c�Ɛ��ʂ���͂���B
	 * @param goodsID ���i�R�[�h
	 * @param quantity ���א���
	 */
	public void input(int goodsID, int quantity) {
		this.inputID = goodsID;
		this.inputQuantity = quantity;
	}
	
	public ArrayList<String> recordMaker() {
		makerInfo.add(Integer.toString(makerCode));
		makerInfo.add(makerName);
		makerInfo.add(tel);
		makerInfo.add(address);
		return makerInfo;
	}
	
	/**
	 * ���ׂ��ꂽ���i�̂h�c���o�^����Ă��邩��������B
	 * @return �������ꂽ���i�h�c�̃��X�g�̓Y����
	 */
	public int search() {
		int chk = -99;
		for (int i = 0; i < goods.size(); i++) {
			if (inputID == goods.get(i).getGoodsID()) {
				chk = i;				
			}
		}
		return chk;
	}
	
	public void addGoods(int num) {
		int stock = goods.get(num).getQuantity();
		stock += inputQuantity;
		
	}
}
