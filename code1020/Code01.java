package code1020;

public class Code01 {

	public static void main(String[] args) {
		Computer c,c2;
		c=new Computer("�������");
		c2=new Computer("��������");
		c.start();
		c2.start();
	}

}
class Computer extends Thread{
	public Computer(String name){
		super(name);
	}
	public void run(){
		while(true){
			Thread th=Thread.currentThread();
			String th_name=th.getName();
			System.out.println(th_name+"��������");
		}
	}
}