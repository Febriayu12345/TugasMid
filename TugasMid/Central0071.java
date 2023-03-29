interface A { 
	void aaa();
}
 
interface B extends A {
	void aaa();
}
	
class Central0071 implements A, B {
	public void aaa() {
		System.out.println("aaa");
	}

	public static void main(String arg[]) {
		System.out.println("main");
		Central0071 obj = new Central0071();
		obj.aaa();
	}
}