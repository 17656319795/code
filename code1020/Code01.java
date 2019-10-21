package code1020;

public class Code01 {

	public static void main(String[] args) {
		Computer c,c2;
		c=new Computer("联想电脑");
		c2=new Computer("戴尔电脑");
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
			System.out.println(th_name+"正在运行");
		}
	}
}