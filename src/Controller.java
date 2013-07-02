import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
	Goods newGoods;
	Maker newMaker;
	ArrayList<Goods> goods;
	ArrayList<Maker> maker;
	
	/**
	 * ���o�^�̏��i��o�^����B
	 * @return ���i�̃R���N�V����
	 */
	public ArrayList<Goods> recordGoods() {
		System.out.print("���i�h�c\n>" + inputID);
		newGoods.setGoodsID(inputID);
		try {
			System.out.print("���i��\n>");
			newGoods.setGoodsName(inputMess());
			System.out.print("���i\n>");
			newGoods.setPrice(Integer.parseInt(inputMess()));
			System.out.print("���ח�\n>" + inputQuantity);
			newGoods.setQuantity(inputQuantity);
			System.out.print("���[�J�[�R�[�h\n>");
			makerCode = Integer.parseInt(inputMess());
			
			newGoods.setMakerCode(makerCode);
		} catch (IOException e) {
			e.printStackTrace();
		}
		goods.add(newGoods);
		return goods;
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
	
	/**
	 * ���o�^�̃��[�J�[��o�^����B
	 * @return ���[�J�[�̃R���N�V����
	 */
	public ArrayList<Maker> recordMaker() {
		System.out.print("���[�J�[�R�[�h\n>" + makerCode);
		newMaker.setMakerCode(makerCode);
		System.out.print("���[�J�[��\n>");
		try {
			newMaker.setMakerName(inputMess());
			System.out.print("�A����\n>");
			newMaker.setTel(inputMess());
			System.out.print("�Z��\n>");
			newMaker.setAddress(inputMess());
		} catch (IOException e) {
			e.printStackTrace();
		}
		maker.add(newMaker);
		return maker;
	}
	
	/**
	 * ���ׂ��ꂽ���i�̂h�c���o�^����Ă��邩��������B
	 * @return �������ꂽ���i�h�c�̃��X�g�̓Y����
	 */
	public int searchGoods() {
		int chk = -99;
		for (int i = 0; i < goods.size(); i++) {
			if (inputID == goods.get(i).getGoodsID()) {
				chk = i;				
			}
		}
		return chk;
	}
	
	/**
	 * �o�^�ς݂̏��i�ɓ��ׂ������ʂ����Z����B
	 * @param num ���ׂ������i�̊i�[����Ă��郊�X�g�̓Y����
	 */
	public void addGoods(int num) {
		int stock = goods.get(num).getQuantity();
		stock += inputQuantity;
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
}
