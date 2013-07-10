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
	 * @param makerCode �Z�b�g���� makerCode
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
	 * @param makerName �Z�b�g���� makerName
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
	 * @param tel �Z�b�g���� tel
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
	 * @param address �Z�b�g���� address
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
	 * �o�^�ς݃��[�J�[�쐬�p�R���X�g���N�^
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
