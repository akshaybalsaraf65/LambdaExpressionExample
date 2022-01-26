import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

interface interf{
	
	public void m1();
	default void m2()
	{
		
	}
	public static void m3()
	{
		
	}
}
public class LambdaExample {

	// Normal code
	public static int m1(int n) {
	
		return n * n;
	}
	
	public void m2() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		// Normal code to method call
		System.out.println("The square of 4 :" +m1(4));
		System.out.println("The square of 5 :" +m1(5));
		
		// using lambda expression
		
		Function<Integer, Integer> f = i -> i * i;
		System.out.println("The square of 40 :" +f.apply(40));
		System.out.println("The square of 50 :" +f.apply(50));
		
		LambdaExample l = new LambdaExample();
		l.m2();
		
		// () -> System.out.println("Hello");
		
		interf ff = () -> System.out.println("Hello...");
		ff.m1();
		ff.m1();
		ff.m1();
		ff.m1();
		
		Runnable r = () -> {
			
			for(int i = 0; i <= 10; i++) {
				System.out.println("child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("main thread");
		}
		
		Runnable rr = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i <= 10; i++) {
					System.out.println("child thread");
				}
			}
		};
		
		Thread tt = new Thread(rr);
		tt.start();
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(20);
		ll.add(25);
		ll.add(5);
		ll.add(30);
		ll.add(30);
		ll.add(0);
		ll.add(15);
		System.out.println(ll);
		
		// Comparator<Integer> c = (I1,I2) -> (I1<I2>)?-1:(I1>I2)?+1:0;
		
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee("ak", 1));
		l1.add(new Employee("ak", 2));
		
		System.out.println(l1);
		
		ll.forEach(
				n -> System.out.println(n)
				);
		
		l1.forEach(
				n -> System.out.println(n)
				);
		
	}
}
