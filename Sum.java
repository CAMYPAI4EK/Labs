package labs;

public class Sum implements IOperation {

	@Override
	public String getSign() {
		return "+" ;
	}
	
	@Override
	public String getName() {
		return"Сложение";
	}
	
	@Override
	public int estimate (int a,int b) {
		return a+b;
	}
}
