package view;
import java.util.Scanner;

import javax.swing.JOptionPane;

import biz.CourseBiz;
import biz.SCBiz;
public class CourseSelection {

	public static void show()throws Exception{
		String[] possibleValues = { "未选择", "查看已选课程" ,"选择其他课程","退选已选择课程"}; 
		String selection = (String)JOptionPane.showInputDialog(null, "您是要?", "安师选课系统", 
				JOptionPane.INFORMATION_MESSAGE, null,  possibleValues, possibleValues[0]);
		CourseBiz cbBiz=new CourseBiz();
		SCBiz scBiz=new SCBiz();
		String courseId="";
		switch (selection){
		case "查看已选课程":
			JOptionPane.showMessageDialog(null, scBiz.getSelectedCourse());
			break;
		case "选择其他课程":
			courseId=cbBiz.SelectCourses();
			scBiz.selectCourse(courseId);
			break;
		case "退选已选择课程":
			System.out.println(MainUI.whoLogin().getStudentName()+"同学,若您已选择课程,则在下面显示,否则系统会提示不存在");
			String Selected=scBiz.getSelectedCourse();
			if(Selected!=null){
				courseId=(String)JOptionPane.showInputDialog(null,"请输入你要退选的课程号：\n"+
						Selected,"课程",JOptionPane.PLAIN_MESSAGE,null,null,"在这输入");  
				scBiz.deleteOneCourse(courseId);
			}
			
			break;
		}
	}

}
