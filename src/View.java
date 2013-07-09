import java.util.ArrayList;


public class View {

	private ArrayList<String> goodsInfo;
	private ArrayList<String> makerInfo;
	
	private int inputID;
	private int inputQuantity;
	
	public void firstDisp() {
		
	}
	
	public ArrayList<String> goodsDisp() {
		return goodsInfo;
	}
	
	public ArrayList<String> makerDisp() {
		return makerInfo;
	}
	
	public int getInputID() {
		return inputID;
	}
	
	public int getInputQuantity() {
		return inputQuantity;
	}
	
	public boolean checkNumber(String str) {
		return true;
	}
	
}
