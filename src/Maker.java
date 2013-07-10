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
		return this.makerCode;
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
		return this.makerName;
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
		return this.tel;
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
		return this.address;
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
	
	/**
	 * 登録済みメーカー作成用コンストラクタ
	 * @param code
	 * @param name
	 * @param tel
	 * @param add
	 */
	Maker(int code, String name, String tel, String add) {
		this.makerCode = code;
		this.makerName = name;
		this.tel = tel;
		this.address = add;
	}
}
