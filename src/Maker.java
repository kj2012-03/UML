import java.util.ArrayList;


public class Maker {

	private int makerCode;
	private String makerName;
	private String tel;
	private String address;
	
	Maker(ArrayList<String> makerInfo) {
		
	}
	
	public boolean searchMakerCode(int makerCode) {
		//メーカー情報から指定されたメーカーコードが存在するかどうかチェックする。
		if (makerCode == 0) {//メーカーコードが一致した場合
			return true;
		} else {//ケーカーコードが不一致だった場合
			return false;
		}
	}
}
