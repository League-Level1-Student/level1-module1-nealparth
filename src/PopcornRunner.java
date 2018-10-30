import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
String flavor=	JOptionPane.showInputDialog("What flavor do you want the popcorn to be");
	Popcorn bag= new Popcorn(flavor);
	Microwave cook=  new Microwave();
	String time= JOptionPane.showInputDialog("How long do you want your popcorn to be cooked for");
	int x= Integer.parseInt(time);
	cook.setTime(x);
	cook.putInMicrowave(bag);
	cook.startMicrowave();
	bag.applyHeat();
	bag.eat();
}
}
