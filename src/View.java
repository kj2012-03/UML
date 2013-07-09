import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class View {

	private ArrayList<String> goodsInfo;
	private ArrayList<String> makerInfo;

	private int inputID;
	private int inputQuantity;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void firstDisp() {
		try {
			while(true){
				System.out.println("���iID����͂��Ă�������");
				String str = br.readLine();
				if(checkNumber(str)){
					inputID = Integer.parseInt(str);
					break;
				}else{
					System.out.println("���͂��������Ȃ��ł�");
					System.out.println("���l����͂��Ă�������");
					System.out.println();
				}
			}

			while(true){
				System.out.println("���ׂ��鐔�ʂ���͂��Ă�������");
				String str = br.readLine();
				if(checkNumber(str)){
					inputQuantity = Integer.parseInt(str);
					break;
				}else{
					System.out.println("���͂��������Ȃ��ł�");
					System.out.println("���l����͂��Ă�������");
					System.out.println();
				}
			}

		} catch (NumberFormatException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

	}

	public ArrayList<String> goodsDisp() {
		String[] goods = new String[5];
		try {
			//ID
			goods[0] = String.valueOf(this.inputID);

			System.out.println("���i������͂��Ă�������");
			goods[1] = br.readLine();

			while(true){
				System.out.println("�l�i����͂��Ă�������");
				goods[2] = br.readLine();
				if(checkNumber(goods[2])){
					break;
				}else{
					System.out.println("���͂��������Ȃ��ł�");
					System.out.println("���l����͂��Ă�������");
				}
			}

			//����
			goods[3] = String.valueOf(this.inputQuantity);

			while(true){
				System.out.println("���[�J�[�R�[�h����͂��Ă�������");
				goods[4] = br.readLine();
				if(checkNumber(goods[4])){
					break;
				}else{
					System.out.println("���͂��������Ȃ��ł�");
					System.out.println("���l����͂��Ă�������");
				}
			}

			//���ږ�
			String[] col  = {"���iID", "���i��", "�l�i", "����", "���[�J�[�R�[�h"};

			System.out.println("----------���͏��-----------");
			for(int i = 0; i < 5; i++){
				System.out.printf("%5s:%-5s",col[i],goods[i]);
			}


		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

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

	public boolean checkNumber(String str){
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}