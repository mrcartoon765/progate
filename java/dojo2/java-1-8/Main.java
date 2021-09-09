import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("ビアンキ", "緑", 0);
		System.out.println("【自転車の情報】");
		bicycle.printData();
		System.out.println("走る距離を入力してください：");
		int bicycle_range = scanner.nextInt();
		bicycle.run(bicycle_range);
		System.out.println("-----------------");
		Car car = new Car("フェラーリ", "赤");
		System.out.println("【車の情報】");
		car.printData();
		System.out.println("-----------------");
		System.out.print("走る距離を入力してください：");
		int car_range = scanner.nextInt();
		car.run(car_range);


	}
}

