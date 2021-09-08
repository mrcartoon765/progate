class Bicycle {
	private String name;
	private String color;
	private int distance = 0;

	Bicycle(String name, String color, int distance) {
		this.name = name;
		this.color = color;
	}

	public void printData() {
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
	}

	public void run(int distance) {
		System.out.println(distance + "km走ります");
		System.out.println("走行距離：" + this.distance + "km");
	}
}