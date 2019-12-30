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
		String ans="所有的课程列表如下";
		while(it.hasNext()){
			Course tmp=(Course)it.next();
			ans+="\n课程号:"+tmp.getCourseNo()+" 课程名:"+tmp.getCourseName()+" 学分:"+tmp.getCourseGrade();
		}
		String courseNo=(String)JOptionPane.showInputDialog(null,"请输入你要退选的课程号：\n"+
				ans,"课程",JOptionPane.PLAIN_MESSAGE,null,null,"在这输入");
		return courseNo;
	}
	public void teacherAddCourse(String courseNo,String courseName,String courseGrade)throws Exception{
		courseDao = CourseDao.getInstance();
		course=new Course();
		course.setCourseName(courseName);
		course.setCourseNo(courseNo);
		course.setCourseGrade(Integer.parseInt(courseGrade));
		if(courseDao.isTrueCourseNo(courseNo)){
			JOptionPane.showMessageDialog(null, "该课程已经存在"
					, "提示信息", 0);
		}
		else{
			courseDao.insert(course);
			JOptionPane.showMessageDialog(null, "添加课程成功");
		}
		courseDao.save();
	}
}
