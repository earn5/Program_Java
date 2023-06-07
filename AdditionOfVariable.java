class AdditionOfVariable {
	public static void main(String[] args) {
		int x = 5;
		int y = x++;
		System.out.println("Y: " + y);
		int z = ++x;
		System.out.println("X: " + x + ",Z: " + z);
		int result = x + y + z;
		System.out.println(result);
	}
}