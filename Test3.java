package code;

abstract class Tv{
	abstract void play();
}
class HaierTv extends Tv{
	void play(){
		System.out.println("This is HaierTv.");
	}
}
class HisenseTv extends Tv{
	void play(){
		System.out.println("This is HisenseTv.");
	}
}
class TvFactory{							//�򵥹���ģʽ
	public static Tv produce(String brand){
		if(brand.equals("HaierTv"))
			return new HaierTv();
		else if(brand.equals("HisenseTv"))
			return new HisenseTv();
		else
			return null;
	}
}
interface TvFactory2{						//��������ģʽ
	static Tv produceTv();
}
class HaierTvFactory implements TvFactory2{
	static Tv produceTv(){
		return new HaierTv();
	}
}
class HisenseTvFactory implements TvFactory2{
	static Tv produceTv(){
		return new HisenseTv();
	}
}
public class Test3 {

	public static void main(String[] args) {
		Tv T1=TvFactory.produce("HaierTv");		//ͨ���򵥹���ģʽʵ��������
		Tv T2=TvFactory.produce("HisenseTv");	
		T1.play();
		T2.play();
		Tv T3=HaierTvFactory.produceTv();		//ͨ����������ģʽʵ��������
		Tv T4=HisenseTvFactory.produceTv();
		T3.play();
		T4.play();
	}

}