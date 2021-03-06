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
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("ガソリン量：" + this.fuel + "L");
	}

	public int run(int car_range) {
		System.out.println(car_range + "km走ります");
		if(fuel > car_range){
			System.out.println("走行距離：" + car_range + "km");
			System.out.println("ガソリン量：" + (fuel - car_range) + "L");
			return car_range;
		}else{
			System.out.println("ガソリンが足りません");
			System.out.println("走行距離：" + distance + "km");
			System.out.println("ガソリン量：" + fuel + "L");
			return distance;
		}
	}
}