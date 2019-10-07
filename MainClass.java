import factory.*;
import tv.*;
public class MainClass {
	public static void main(String [] args){
		HaierTVFactory Factory1=new HaierTVFactory(); 		//创建海尔TV工厂
		Tv T1=Factory1.produceTv();
		HisenseTVFactory Factory2=new HisenseTVFactory();	//创建海信TV工厂
		Tv T2=Factory2.produceTv();
		T1.play();
		T2.play();
	}
}
