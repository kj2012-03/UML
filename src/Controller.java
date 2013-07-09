import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Controller {

	private View v;
	
	private int makerCode;
	
	private ArrayList<Goods> goods;
	private ArrayList<Maker> maker;
	
	Controller() {
		v = new View();
	}
	
	/**
	 * ���ׂ��ꂽ���i�̂h�c���o�^����Ă��邩��������B
	 * @return �������ꂽ���i�h�c�̃��X�g�̓Y����
	 */
	public int searchGoods() {
		v.firstDisp();
		int chk = -99;
		for (int i = 0; i < goods.size(); i++) {
			if (v.getInputID() == goods.get(i).getGoodsID()) {
				chk = i;				
			}
		}
		return chk;
	}

	/**
	 * ���͂��ꂽ���[�J�[�̃R�[�h���o�^����Ă��邩��������B
	 * @return ���[�J�[�R�[�h
	 */
	public int searchMaker() {
		for (int i = 0; i < maker.size(); i++) {
			if (makerCode == maker.get(i).getMakerCode()) {
				return makerCode;
			}
		}
		recordMaker();
		return makerCode;
	}

	
	/**
	 * ���o�^�̏��i��o�^����B
	 * @return ���i�̃R���N�V����
	 */
	public void recordGoods() {
		v.goodsDisp();
		Goods g = new Goods(v.goodsDisp());
		makerCode = g.getMakerCode();
		searchMaker();
		goods.add(g);
	}
	
	
	/**
	 * ���o�^�̃��[�J�[��o�^����B
	 * @return ���[�J�[�̃R���N�V����
	 */
	public void recordMaker() {
		Maker m = new Maker(v.makerDisp());
		maker.add(m);
	}
	
	
	/**
	 * �o�^�ς݂̏��i�ɓ��ׂ������ʂ����Z����B
	 * @param num ���ׂ������i�̊i�[����Ă��郊�X�g�̓Y����
	 */
	public void addGoods(int num) {
		int stock = goods.get(num).getQuantity();
		stock += v.getInputQuantity();
		goods.get(num).setQuantity(stock);
	}
	
	/**
	 * ���������͂���B
	 * @return ���͂��ꂽ������1�s
	 * @throws IOException
	 */
	public String inputMess() throws IOException {
		String s = null;
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			s = input.readLine();
		} catch (IOException e) {
			throw e;
		}
		return s;
	}
	
}
