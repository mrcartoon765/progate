class Main {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 6, 9, 13, 16 };

		int oddSum = 0; // 奇数
		int evenSum = 0; // 偶数

		for (int number : numbers) {
			if (number % 2 == 1) {
				oddSum = oddSum + number;
				System.out.println("奇数の和は" + oddSum + "です");
			} else if (number % 2 == 0) {
				evenSum = evenSum + number;
				System.out.println("偶数の和は" + evenSum + "です");
			} else {
				oddSum = oddSum;
				evenSum = evenSum;
			}
		}
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");
	}
}ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIL+o2lz/lFtg7drs3ESbtX0lNvV/r59Q/Jvt54Ew6y9w mrcartoon765 @gmail.
com