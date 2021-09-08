import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("ビアンキ", "緑", 0);
		System.out.println("【自転車の情報】");
		bicycle.printData();
		System.out.println("走る距離を入力してください：");
		int range = scanner.nextInt();
		bicycle.run(range);
		System.out.println("-----------------");
		Car car = new Car("フェラーリ", "赤");
		System.out.println("【車の情報】");
		car.printData();

	}
}
