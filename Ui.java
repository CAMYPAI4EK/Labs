package labs;

public class Ui {

	public static void main(String[] args) {
		
		IOperation[] operations= {
			new Sum(), new Sub(), new Mul()
		};
		
		int a=43, b = 21;
		for (IOperation op:operations) {
			System.out.println(op.getName());
			System.out.printf("%d %s %d=%d\n",
					a,op.getSign(),b,op.estimate(a,b));
			
		}
	}
}
