package code1020;

public class Code2 {

	public static void main(String[] args) {
		Mythread3 mythread=new Mythread3();
		Thread myth=new Thread(mythread);
		myth.start();
		for(int i=0;i<100;i++)
		{
			System.out.println("main");
		}
	}

}
class Mythread3 implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("new");
		}
	}
}