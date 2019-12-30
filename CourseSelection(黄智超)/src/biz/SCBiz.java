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
			JOptionPane.showMessageDialog(null, "�γ�id����ѡ��ʧ��"
					, "��ʾ��Ϣ", 0);
		}else if(sc.isSelected(courseNo)){
			JOptionPane.showMessageDialog(null, "���Ѿ�ѡ���ÿγ�"
					, "��ʾ��Ϣ", 0);
		}else{
			sc.addCourseNo(courseNo);
			sc.addGrade(((Course)(courseDao.getEntity(courseNo))).getCourseGrade());
			scDao.insert(sc);
			JOptionPane.showMessageDialog(null, "ѡ�γɹ�"
					, "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
		}
	}
	public boolean printSelectedCourse()throws Exception{
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
			JOptionPane.showMessageDialog(null, "����δѡ����γ�"
					, "��ʾ��Ϣ", 0);
			return false;
		}else{
			TreeSet<String> AllCourseNo=sc.getAllCourseNo();
			for(String courseNo:AllCourseNo){
//				if(courseNo!=" "&&courseNo!="\\|"){
					Course cr=(Course)courseDao.getEntity(courseNo);
					if(cr==null)continue;
					
					System.out.println(cr.getCourseNo()+' '+cr.getCourseName()+' '+cr.getCourseGrade());
//				}
			}
			return true;
			
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
			JOptionPane.showMessageDialog(null, "����δѡ����γ�"
					, "��ʾ��Ϣ", 0);
		}else{
			if(sc.isSelected(courseNo)){
				sc.deleteCourse(courseNo);
				scDao.insert(sc);
				String courseName=((Course)courseDao.getEntity(courseNo)).getCourseName();
				System.out.println("���ѳɹ���ѡ�γ�"+courseName);
			}else{
				JOptionPane.showMessageDialog(null, "����δѡ����ÿγ�"
				, "Error", 0);
			}
		}
	}
}
