
public class CatRunner {
public static void main(String[] args) {
	Cat cats= new Cat("leo");
 cats.printName();
cats.meow();
for(int i =0; i<9; i++) {
	cats.kill();
}
}
}
