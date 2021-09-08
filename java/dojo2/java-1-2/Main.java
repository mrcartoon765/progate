class Main {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle("ビアンキ", "緑");
		System.out.println("【自転車の情報】");
		System.out.println("名前：" + bicycle.getName());
		System.out.println("色：" + bicycle.getColor());

	}
}
