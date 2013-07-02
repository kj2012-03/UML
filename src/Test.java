import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	public static void main(String[] args) {
		Auth au = new Auth();
//		Login lo = new Login();
		MyLogin mlo = new MyLogin();
//		au.check(lo);
		au.check(mlo);

	}

}
class Login {
	String [] idList = {"tanaka", "yamada"};
	String uid;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void getInfo() {
		System.out.println("ユーザー名");
		try {
			uid = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isUser() {
		for (int i = 0; i < idList.length; i++) {
			if (uid.equals(idList[i])) {
				return true;
			}
		}
		return false;
	}
}

class Auth {
	public void check(Login l) {
		l.getInfo();
		
		if (!l.isUser()) {
			System.out.print("Login failure");
		} else {
			System.out.print("Welcome");
		}
	}
}

class MyLogin extends Login {
	String[] passList = {"abc12345", "def67890"};
	String upass;
	
	public void getInfo() {
		System.out.println("ユーザー名");
		try {
			uid = br.readLine();
			System.out.println("パスワード");
			upass = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean isUser() {
		for (int i = 0; i < idList.length; i++) {
			if (uid.equals(idList[i])) {
				if (upass.equals(passList[i])) {
					return true;
				}
			}
		}
		return false;
	}
}