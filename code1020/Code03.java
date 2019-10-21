package code1020;

public class Code03 {

	public static void main(String[] args) {
		Books book=new Books();
		Thread Teacher=new Thread(book,"贾老师");
		Thread Teacher2=new Thread(book,"黄老师");
		Thread Teacher3=new Thread(book,"王老师");
		Teacher.start();
		Teacher2.start();
		Teacher3.start();
	}

}
class Books implements Runnable{
	int num=80;
	boolean flag=false;
	public void run(){
		while(true){
			if(num>0&&flag==false){
				flag=true;
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th+"正在发售第"+num+"本书");
				num--;
				flag=false;
			}
		}
	}
}