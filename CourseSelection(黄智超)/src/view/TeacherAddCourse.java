package view;

import javax.swing.JOptionPane;
import biz.*;

public class TeacherAddCourse {
	static void show()throws Exception{
		String courseNo=(String)JOptionPane.showInputDialog(null,"�����������Ŀγ̺ţ�\n","ѧ��",
				JOptionPane.PLAIN_MESSAGE,null,null,"��������");  
		String courseName=(String)JOptionPane.showInputDialog(null,"������γ̵����ƣ�\n","ѧ��",
				JOptionPane.PLAIN_MESSAGE,null,null,"��������");  
		String courseGrade=(String)JOptionPane.showInputDialog(null,"������ÿγ̵�ѧ�֣�\n","ѧ��",
				JOptionPane.PLAIN_MESSAGE,null,null,"��������");  
		CourseBiz cs=new CourseBiz();
		cs.teacherAddCourse(courseNo, courseName, courseGrade);
	}
}
