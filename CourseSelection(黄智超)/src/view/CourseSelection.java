package view;
import java.util.Scanner;

import javax.swing.JOptionPane;

import biz.CourseBiz;
import biz.SCBiz;
public class CourseSelection {

	public static void show()throws Exception{
		String[] possibleValues = { "δѡ��", "�鿴��ѡ�γ�" ,"ѡ�������γ�","��ѡ��ѡ��γ�"}; 
		String selection = (String)JOptionPane.showInputDialog(null, "����Ҫ?", "��ʦѡ��ϵͳ", 
				JOptionPane.INFORMATION_MESSAGE, null,  possibleValues, possibleValues[0]);
		CourseBiz cbBiz=new CourseBiz();
		SCBiz scBiz=new SCBiz();
		String courseId="";
		switch (selection){
		case "�鿴��ѡ�γ�":
			JOptionPane.showMessageDialog(null, scBiz.getSelectedCourse());
			break;
		case "ѡ�������γ�":
			courseId=cbBiz.SelectCourses();
			scBiz.selectCourse(courseId);
			break;
		case "��ѡ��ѡ��γ�":
			System.out.println(MainUI.whoLogin().getStudentName()+"ͬѧ,������ѡ��γ�,����������ʾ,����ϵͳ����ʾ������");
			String Selected=scBiz.getSelectedCourse();
			if(Selected!=null){
				courseId=(String)JOptionPane.showInputDialog(null,"��������Ҫ��ѡ�Ŀγ̺ţ�\n"+
						Selected,"�γ�",JOptionPane.PLAIN_MESSAGE,null,null,"��������");  
				scBiz.deleteOneCourse(courseId);
			}
			
			break;
		}
	}

}
