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
	 * @param makerCode �Z�b�g���� makerCode
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
	 * @param makerName �Z�b�g���� makerName
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
	 * @param tel �Z�b�g���� tel
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
	
	public boolean searchMakerCode(int makerCode) {
		//���[�J�[��񂩂�w�肳�ꂽ���[�J�[�R�[�h�����݂��邩�ǂ����`�F�b�N����B
		if (makerCode == 0) {//���[�J�[�R�[�h����v�����ꍇ
			return true;
		} else {//�P�[�J�[�R�[�h���s��v�������ꍇ
			return false;
		}
	}
}
