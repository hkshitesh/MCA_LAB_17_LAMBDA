interface I1
{
	public void f1();
}

public class MyLambdaClass {

	public static void main(String[] args) {
		
		I1 ob = new I1() {			
			
			public void f1() { System.out.println("Without Lambda Expression");			}
		};		
		ob.f1();
	}
}
