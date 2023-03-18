package labs;

public class Sub implements IOperation {
	@Override
	public String getSign() {
		return "-" ;
	}
	
	@Override
	public String getName() {
		return"Вычет";
	}
	
	@Override
	public int estimate (int a,int b) {
		return a-b;
}
}
