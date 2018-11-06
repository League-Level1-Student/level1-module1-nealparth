package extra;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	vault.tryCode(0);
	
	JamesBond spy= new JamesBond();
	spy.findCode(vault);
}
}
