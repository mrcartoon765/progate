class Car {
	private String name;
	private String color;
	private int distance = 0;
	private int fuel = 100;

	Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void printData() {
		System.out.println("【車の情報】");
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
		System.out.println("-----------------");
	}

	public int run(int car_range) {
		System.out.print("走る距離を入力してください：");
		System.out.println(car_range + "km走ります");
		if (car_range < fuel) {
			System.out.println("走行距離：" + car_range + "km");
			fuel = fuel - car_range;
			System.out.println("ガソリン量：" + fuel + "L");
			System.out.println("-----------------");
			return car_range;
		} else {
			System.out.println("ガソリンが足りません");
			System.out.println("走行距離：" + distance + "km");
			System.out.println("ガソリン量：" + fuel + "L");
			System.out.println("-----------------");
			return distance;
		}
	}

	public void charge(int charge_fuel) {
		System.out.println(charge_fuel + "L給油します");
		if (charge_fuel <= 0) {
			System.out.println("給油できません");
		} else if (100 <= (charge_fuel + fuel)) {
			System.out.println("満タンまで給油します");
			fuel = 100;
		} else {
			fuel += charge_fuel;
		}
		System.out.println("ガソリン量：" + fuel + "L");

	}
}