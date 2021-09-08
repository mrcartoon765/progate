class Main {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle("ビアンキ", "緑", 0);
		System.out.println("【自転車の情報】");
		System.out.println("名前：" + bicycle.getName());
		System.out.println("色：" + bicycle.getColor());
		System.out.println("走行距離：" + bicycle.getDistance() + "km");
		System.out.println("-----------------");
		System.out.println("走る距離を入力してください：");
		Bicycle.run(10);

	}
}
