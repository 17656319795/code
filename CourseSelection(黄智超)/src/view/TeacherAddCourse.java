package view;

import javax.swing.JOptionPane;
import biz.*;

public class TeacherAddCourse {
	static void show()throws Exception{
		String courseNo=(String)JOptionPane.showInputDialog(null,"请输入新增的课程号：\n","学号",
				JOptionPane.PLAIN_MESSAGE,null,null,"在这输入");  
		String courseName=(String)JOptionPane.showInputDialog(null,"请输入课程的名称：\n","学号",
				JOptionPane.PLAIN_MESSAGE,null,null,"在这输入");  
		String courseGrade=(String)JOptionPane.showInputDialog(null,"请输入该课程的学分：\n","学号",
				JOptionPane.PLAIN_MESSAGE,null,null,"在这输入");  
		CourseBiz cs=new CourseBiz();
		cs.teacherAddCourse(courseNo, courseName, courseGrade);
	}
}
