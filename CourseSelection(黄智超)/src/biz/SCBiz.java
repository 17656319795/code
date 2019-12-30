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
			JOptionPane.showMessageDialog(null, "ѡ�γɹ�");
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
			ans="����δѡ����γ�";
			return ans;
		}
		if(sc.isEmpty()){
			System.out.println(1);
			ans="����δѡ����γ�";
			return ans;
		}else{
			TreeSet<String> AllCourseNo=sc.getAllCourseNo();
			
			for(String courseNo:AllCourseNo){
//				if(courseNo!=" "&&courseNo!="\\|"){
					Course cr=(Course)courseDao.getEntity(courseNo);
					if(cr==null)continue;
					ans+="�γ̺�:"+cr.getCourseNo()+' '+"�γ���"+cr.getCourseName()+' '+"ѧ��:"+cr.getCourseGrade()+'\n';
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
			JOptionPane.showMessageDialog(null, "����δѡ����γ�"
					, "Error", 0);
		}else{
			if(sc.isSelected(courseNo)){
				sc.deleteCourse(courseNo);
				int grade=((Course)(courseDao.getEntity(courseNo))).getCourseGrade();
				sc.addGrade(-grade);
				scDao.insert(sc);
				String courseName=((Course)courseDao.getEntity(courseNo)).getCourseName();
				JOptionPane.showMessageDialog(null, "���ѳɹ���ѡ�γ�");
			}else{
				JOptionPane.showMessageDialog(null, "����δѡ����ÿγ�"
				, "Error", 0);
			}
		}
	}
}
