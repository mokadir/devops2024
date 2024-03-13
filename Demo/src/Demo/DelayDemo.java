package Demo;

public class DelayDemo {

	public static void main(String[] args) {
		System.out.println("Hi");
		for(int i=0; i<1000; i++) {
			System.out.println("Number of iteration= "+i);
			System.out.println("Wait");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
