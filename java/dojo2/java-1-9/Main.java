import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("ビアンキ", "緑", 0);
		bicycle.printData();
		System.out.println("走る距離を入力してください：");
		int bicycle_range = scanner.nextInt();
		bicycle.run(bicycle_range);
		Car car = new Car("フェラーリ", "赤");
		car.printData();
		System.out.print("走る距離を入力してください：");
		int car_range = scanner.nextInt();
		car.run(car_range);
		System.out.print("給油する量を入力してください：");
		int charge_fuel = scanner.nextInt();
		car.charge(charge_fuel);
	}
}
