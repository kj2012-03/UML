import java.util.ArrayList;


public class Maker {

	private int makerCode;
	private String makerName;
	private String tel;
	private String address;
	
	Maker(ArrayList<String> makerInfo) {
		
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
