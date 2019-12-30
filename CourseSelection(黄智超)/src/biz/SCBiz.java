package biz;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import dao.*;
import entity.*;
import view.MainUI;

public class SCBiz {
	private SCDao scDao;
	private CourseDao courseDao;
	private SC sc;
	private Student student;
	private Course course;
	
	public void selectCourse(String courseNo)throws Exception{
		scDao=SCDao.getInstance();
		courseDao=CourseDao.getInstance();
		
		student=MainUI.whoLogin();
		sc=(SC)scDao.getEntity(student.getStudentNo());
		if(sc==null){
			sc=new SC();
			sc.setStudentNo(student.getStudentNo());
		}
		if(courseDao.isTrueCourseNo(courseNo)==false){
			JOptionPane.showMessageDialog(null, "课程id错误选课失败"
					, "提示信息", 0);
		}else if(sc.isSelected(courseNo)){
			JOptionPane.showMessageDialog(null, "您已经选过该课程"
					, "提示信息", 0);
		}else{
			sc.addCourseNo(courseNo);
			sc.addGrade(((Course)(courseDao.getEntity(courseNo))).getCourseGrade());
			scDao.insert(sc);
			JOptionPane.showMessageDialog(null, "选课成功");
		}
	}
	public String getSelectedCourse()throws Exception{
		String ans="";
		scDao=SCDao.getInstance();
		courseDao=CourseDao.getInstance();
		student=MainUI.whoLogin();
		sc=(SC)scDao.getEntity(student.getStudentNo());
		if(sc==null){
			sc=new SC();
			sc.setStudentNo(student.getStudentNo());
			scDao.insert(sc);
			ans="您还未选择过课程";
			return ans;
		}
		if(sc.isEmpty()){
			System.out.println(1);
			ans="您还未选择过课程";
			return ans;
		}else{
			TreeSet<String> AllCourseNo=sc.getAllCourseNo();
			
			for(String courseNo:AllCourseNo){
//				if(courseNo!=" "&&courseNo!="\\|"){
					Course cr=(Course)courseDao.getEntity(courseNo);
					if(cr==null)continue;
					ans+="课程号:"+cr.getCourseNo()+' '+"课程名"+cr.getCourseName()+' '+"学分:"+cr.getCourseGrade()+'\n';
//					System.out.println(cr.getCourseNo()+' '+cr.getCourseName()+' '+cr.getCourseGrade());
//				}
			}
			return ans;
			
		}
	}
	public void deleteOneCourse(String courseNo)throws Exception{
		scDao=SCDao.getInstance();
		courseDao=CourseDao.getInstance();
		student=MainUI.whoLogin();
		sc=(SC)scDao.getEntity(student.getStudentNo());
		if(sc==null){
			sc=new SC();
			sc.setStudentNo(student.getStudentNo());
			scDao.insert(sc);
		}
		if(sc.isEmpty()){
			JOptionPane.showMessageDialog(null, "您还未选择过课程"
					, "Error", 0);
		}else{
			if(sc.isSelected(courseNo)){
				sc.deleteCourse(courseNo);
				int grade=((Course)(courseDao.getEntity(courseNo))).getCourseGrade();
				sc.addGrade(-grade);
				scDao.insert(sc);
				String courseName=((Course)courseDao.getEntity(courseNo)).getCourseName();
				JOptionPane.showMessageDialog(null, "您已成功退选课程");
			}else{
				JOptionPane.showMessageDialog(null, "您还未选择过该课程"
				, "Error", 0);
			}
		}
	}
}
