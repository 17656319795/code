package code1020;

public class Example02 {

	public static void main(String[] args) {
		MyThread myThread2=new MyThread();
		Thread thread=new Thread(myThread2);
		thread.start();
		while(true){
			System.out.println("main()方法正在运行");
		}
	}
}
class MyThread2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("MyThread()类的run方法正在运行");
		}
	}
}