class Bicycle {
	private String name;
	private String color;
	private int distance = 0;

	Bicycle(String name, String color, int distance) {
		this.name = name;
		this.color = color;
		this.distance = distance;
	}

	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}

	public int getDistance() {
		return this.distance;
	}

	public static int run(int distance) {
		System.out.println(distance + "km走ります");
		System.out.println("走行距離：" + distance + "km");
		return distance;
	}
}