package extra;

import java.util.Random;

public class Vault {
int random= new Random().nextInt();
	int secretcode= random;

boolean tryCode(int code) {
		if(secretcode==code) {
			return true;
		}
		return false;
		
	}
}
