package test;

public class StaticDispatch {

	static abstract class Human {

	}

	static class Man extends Human {

	}

	static class Woman extends Human {

	}

	public void sayHello(Human guy) {
		System.out.println("Hello,guy");
	}

	public void sayHello(Man guy) {
		System.out.println("Hello,gentleman");
	}

	public void sayHello(Woman guy) {
		System.out.println("Hello,lady");
	}

	public static void main(String[] args) {
//		Human man = new Man();
//		Human woman = new Woman();
//		StaticDispatch sd = new StaticDispatch();
//		sd.sayHello(man);
//		sd.sayHello(woman);
		
		// 實際型別變化 
		Human man = new Woman(); 
		StaticDispatch sd = new StaticDispatch();
		// 靜態型別變化
		sd.sayHello(man) ;
		sd.sayHello((Woman)man);
	}
}