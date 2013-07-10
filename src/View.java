import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class View {


	private int inputID;
	private int inputQuantity;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	View(){
	}
	//���iID�A���ʂ����
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

	//���i����
	public ArrayList<String> goodsDisp() {
		ArrayList<String> goodsInfo = new ArrayList<String>();
		String[] goods = new String[5];
		while(true){
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

				System.out.println("[���͏��]");
				for(int i = 0; i < col.length; i++){
					System.out.printf("%5s:%-5s",col[i],goods[i]);
				}

				System.out.println();
				System.out.println("����ł�낵���Ȃ�[y]����͂��Ă�������");
				System.out.println("[y]�ȊO�Ȃ�ē��͂��܂�");
				String ans = br.readLine();

				if(ans.equals("y")){
					for(String str : goods){
						goodsInfo.add(str);
					}
					break;
				}else{
					System.out.println("�ē��͂��܂�");
				}

			} catch (IOException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}
		return goodsInfo;
	}

	//���[�J�[����
	public ArrayList<String> makerDisp() {
		ArrayList<String> makerInfo = new ArrayList<String>();
		String[] maker = new String[4];
		while(true){
			try {
				while(true){
					System.out.println("���[�J�[�R�[�h����͂��Ă�������");
					maker[0] = br.readLine();
					if(checkNumber(maker[0])){
						break;
					}else{
						System.out.println("���͂��������Ȃ��ł�");
						System.out.println("���l����͂��Ă�������");
					}
				}

				System.out.println("���[�J�[������͂��Ă�������");
				maker[1] = br.readLine();

				while(true){
					System.out.println("�A�������͂��Ă�������");
					maker[2] = br.readLine();
					if(checkNumber(maker[2])){
						break;
					}else{
						System.out.println("���͂��������Ȃ��ł�");
						System.out.println("���l����͂��Ă�������");
					}
				}

				System.out.println("�Z������͂��Ă�������");
				maker[3] = br.readLine();

				//���ږ�
				String[] col  = {"���[�J�[ID", "���[�J�[��", "�A����", "�Z��"};

				System.out.println("[���͏��]");
				for(int i = 0; i < col.length; i++){
					System.out.printf("%5s:%-5s",col[i],maker[i]);
				}

				System.out.println();
				System.out.println("����ł�낵���Ȃ�[y]����͂��Ă�������");
				System.out.println("[y]�ȊO�Ȃ�ē��͂��܂�");
				String ans = br.readLine();

				if(ans.equals("y")){
					for(String str : maker){
						makerInfo.add(str);
					}
					break;
				}else{
					System.out.println("�ē��͂��܂�");
				}

			} catch (IOException e) {
				// TODO �����������ꂽ catch �u���b�N
				e.printStackTrace();
			}
		}
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