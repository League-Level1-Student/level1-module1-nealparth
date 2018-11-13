package extra;

public class Duck {
	String favoriteFood;
	int numberOfFriends;

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	void quack() {
		System.out.println("quack");
		quack();
		this.quack();
	}

	void waddle() {
		System.out.println("waddle");
		waddle();

	}
}
