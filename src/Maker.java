import java.util.ArrayList;


public class Maker {

	private int makerCode;
	private String makerName;
	private String tel;
	private String address;
	
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

	/**
	 * @return makerName
	 */
	public String getMakerName() {
		return makerName;
	}

	/**
	 * @param makerName セットする makerName
	 */
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	/**
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel セットする tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	Maker(ArrayList<String> makerInfo) {
		this.makerCode = Integer.parseInt(makerInfo.get(0));
		this.makerName = makerInfo.get(1);
		this.tel = makerInfo.get(2);
		this.address = makerInfo.get(3);
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
