interface I2
{
	public int sum(int a, int b);
}
public class WithLambdaClass {
	public static void main(String[] args) {
     I2 ob = (a,b)->{
     return(a+b); 
     };
     System.out.println(ob.sum(2,3));
	}
}