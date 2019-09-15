package code;

class Moon{									//单例模式
	private static Moon INSTANCE=new Moon();
	private Moon(){
		System.out.println("moon 有且仅有一个");	
	};
	public static Moon getInstance(){
		return INSTANCE;
	}
}
class Star{									//非单例模式
	private static int idStar;				//该静态变量是为了让用户更清楚地认识到该模式下申请了多个对象，而单例模式下只能有一个对象
	Star(){
		idStar++;
		System.out.println(idStar+"号星在发光");
	};
}
public class Night {

	public static void main(String[] args) {
//		Moon A=new Moon();			//由于类Moon采用单例模式，构造方法私有，所以不能在外部实例化对象
		Moon.getInstance();			//由于单例模式中的getInstance()方法采用静态词修饰，所以可以直接通过类名.方法的方式输出
		Moon.getInstance();
		Star star=new Star();		//构造方法公有，所以可以实例化对象
		Star star2=new Star();		//由于星星有多个，所以可以多次对Star型对象并进行实例化。
		Star star3=new Star();
	}
}
