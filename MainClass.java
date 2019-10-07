import factory.*;
import tv.*;
public class MainClass {
	public static void main(String [] args){
		HaierTVFactory Factory1=new HaierTVFactory(); 		//��������TV����
		Tv T1=Factory1.produceTv();
		HisenseTVFactory Factory2=new HisenseTVFactory();	//��������TV����
		Tv T2=Factory2.produceTv();
		T1.play();
		T2.play();
	}
}
