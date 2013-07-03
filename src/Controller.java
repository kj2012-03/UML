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
	
	private Goods newGoods;
	private Maker newMaker;
	private ArrayList<Goods> goods;
	private ArrayList<Maker> maker;
	
	
	/**
	 * ���o�^�̏��i��o�^����B
	 * @return ���i�̃R���N�V����
	 */
	public void recordGoods() {
		String[] item = {"���i�h�c", "���i��", "���i", "���ח�", "���[�J�[�R�[�h"};
		System.out.print("���i�h�c\n>" + inputID);
		goodsInfo.add(Integer.toString(inputID));
		try {
			for (int i = 1; i < item.length; i++) {
				System.out.print(item[i] + "\n>");
				goodsInfo.add(inputMess());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		newGoods = new Goods(goodsInfo);
		makerCode = newGoods.getMakerCode();
		searchMaker();
		newGoods.displayGoods();
		goods.add(newGoods);
	}
	
	/**
	 * ���׏��i�̏��i�h�c�Ɛ��ʂ���͂���B
	 * @param goodsID ���i�R�[�h
	 * @param quantity ���א���
	 */
//	public void input(int goodsID, int quantity) {
//		this.inputID = goodsID;
//		this.inputQuantity = quantity;
//	}
	
	/**
	 * ���o�^�̃��[�J�[��o�^����B
	 * @return ���[�J�[�̃R���N�V����
	 */
	public void recordMaker() {
		String[] item = {"���[�J�[�R�[�h", "���[�J�[��", "�A����", "�Z��"};
		System.out.print("���[�J�[�R�[�h\n>" + makerCode);
		makerInfo.add(Integer.toString(makerCode));
		try {
			for (int i = 1; i < item.length; i++) {
				System.out.print(item[i] + "\n>");
				makerInfo.add(inputMess());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		newMaker = new Maker(makerInfo);
		maker.add(newMaker);
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
