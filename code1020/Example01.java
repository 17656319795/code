package code1020;

public class Example01 {
	public static void main(String [] args){
		MyThread myThread=new MyThread();
		myThread.start();
		while(true){
			System.out.println("main()������������");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("MyThread���run()����������");
		}
	}
}
