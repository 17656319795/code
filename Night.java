package code;

class Moon{									//����ģʽ
	private static Moon INSTANCE=new Moon();
	private Moon(){
		System.out.println("moon ���ҽ���һ��");	
	};
	public static Moon getInstance(){
		return INSTANCE;
	}
}
class Star{									//�ǵ���ģʽ
	private static int idStar;				//�þ�̬������Ϊ�����û����������ʶ����ģʽ�������˶�����󣬶�����ģʽ��ֻ����һ������
	Star(){
		idStar++;
		System.out.println(idStar+"�����ڷ���");
	};
}
public class Night {

	public static void main(String[] args) {
//		Moon A=new Moon();			//������Moon���õ���ģʽ�����췽��˽�У����Բ������ⲿʵ��������
		Moon.getInstance();			//���ڵ���ģʽ�е�getInstance()�������þ�̬�����Σ����Կ���ֱ��ͨ������.�����ķ�ʽ���
		Moon.getInstance();
		Star star=new Star();		//���췽�����У����Կ���ʵ��������
		Star star2=new Star();		//���������ж�������Կ��Զ�ζ�Star�Ͷ��󲢽���ʵ������
		Star star3=new Star();
	}
}
