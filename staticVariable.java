class StaticVariableDemo {
	public static int x = 1;
	int y = 2;
	public static void main(String[] args){
		StaticVariableDemo demo = new StaticVariableDemo();
		demo.x = 11;
		demo.y = 22;
		StaticVariableDemo demo2 = new StaticVariableDemo();
		System.out.println(demo2.x+":::"+demo2.y);
	}
}