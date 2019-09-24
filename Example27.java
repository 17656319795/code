package temp;

class DivideByMinusException extends Exception{
	public DivideByMinusException(){
		super();
	}
	public DivideByMinusException(String message){
		super(message);
	}
}
public class Example27 {

	public static void main(String[] args) {
		try {
			divide(4,-2);
		}catch(DivideByMinusException e){
			System.out.println(e.getMessage());
		}
	}
	public static int divide(int x,int y)throws DivideByMinusException {//
		if(y<0){
			throw new DivideByMinusException("¸ºÊý");
		}
		int result=x/y;
		return result;
	}
}

