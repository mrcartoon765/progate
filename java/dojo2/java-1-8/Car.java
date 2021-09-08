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

	public int run(int distance) {
		System.out.println(distance + "km走ります");
		System.out.println("走行距離：" + this.distance + "km");
		return distance;
	}
}