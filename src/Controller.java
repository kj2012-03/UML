import java.util.ArrayList;


public class Controller {

	private ArrayList<String> goodsInfo;
	private ArrayList<String> makerInfo;
	
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
	
	public void input(int goodsID, int quantity) {
		
	}
	
	public ArrayList<String> recordMaker() {
		makerInfo.add(Integer.toString(makerCode));
		makerInfo.add(makerName);
		makerInfo.add(tel);
		makerInfo.add(address);
		return makerInfo;
	}
}
