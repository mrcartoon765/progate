import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bicycle bicycle = new Bicycle("ビアンキ", "緑", 0);
		System.out.println("【自転車の情報】");
		System.out.println("名前：" + bicycle.getName());
		System.out.println("色：" + bicycle.getColor());
		System.out.println("走行距離：" + bicycle.getDistance() + "km");
		System.out.println("-----------------");
		System.out.println("走る距離を入力してください：");
		int range = scanner.nextInt();
		Bicycle.run(range);
		System.out.println("-----------------");
		Car car = new Car("フェラーリ", "赤", 0);
		System.out.println("【車の情報】");
		System.out.println("名前：" + car.getName());
		System.out.println("色：" + car.getColor());
		System.out.println("走行距離：" + car.getDistance() + "km");
		System.out.println("-----------------");
		System.out.println("走る距離を入力してください：");

	}
}
