package biz;

import dao.*;
import entity.*;
import java.util.*;

import javax.swing.JOptionPane;

public class CourseBiz {
	CourseDao courseDao;
	private Course course;
	private HashMap<String,IEntity> courses;
	public String SelectCourses()throws Exception{
		courseDao = CourseDao.getInstance();
		Collection values=courseDao.getAllEntities().values();
		Iterator it=values.iterator();
		String ans="���еĿγ��б�����";
		while(it.hasNext()){
			Course tmp=(Course)it.next();
			ans+="\n�γ̺�:"+tmp.getCourseNo()+" �γ���:"+tmp.getCourseName()+" ѧ��:"+tmp.getCourseGrade();
		}
		String courseNo=(String)JOptionPane.showInputDialog(null,"��������Ҫ��ѡ�Ŀγ̺ţ�\n"+
				ans,"�γ�",JOptionPane.PLAIN_MESSAGE,null,null,"��������");
		return courseNo;
	}
	public void teacherAddCourse(String courseNo,String courseName,String courseGrade)throws Exception{
		courseDao = CourseDao.getInstance();
		course=new Course();
		course.setCourseName(courseName);
		course.setCourseNo(courseNo);
		course.setCourseGrade(Integer.parseInt(courseGrade));
		if(courseDao.isTrueCourseNo(courseNo)){
			JOptionPane.showMessageDialog(null, "�ÿγ��Ѿ�����"
					, "��ʾ��Ϣ", 0);
		}
		else{
			courseDao.insert(course);
			JOptionPane.showMessageDialog(null, "��ӿγ̳ɹ�");
		}
		courseDao.save();
	}
}
