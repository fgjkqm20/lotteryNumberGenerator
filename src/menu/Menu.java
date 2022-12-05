package menu;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import actionListener.ShowNumber;

public class Menu {
	public void showMenu() {	
		JFrame frm=new JFrame("복권 번호 생성기");		// 창 생성
		frm.setBounds(300, 200, 800, 200);			// 창 위치, 크기 설정
		frm.setLayout(new GridLayout(1, 2));		// 레이아웃 설정
		
		Font font = new Font("돋움", Font.PLAIN, 30);		// 버튼 폰트
		
		// 버튼 생성
		JButton btn1 = new JButton("일반 복권 번호 생성");
		JButton btn2 = new JButton("연금 복권 번호 생성");
		
		// 버튼 폰트 설정
		btn1.setFont(font);
		btn2.setFont(font);
		
		// 버튼 동작 설정
		btn1.addActionListener(new ShowNumber(false));
		btn2.addActionListener(new ShowNumber(true));
		
		// 창에 버튼 추가
		frm.add(btn1); frm.add(btn2); 
		
		// 창 보이기
		frm.setVisible(true);	
		// X 버튼 누르면 프로그램 종료
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
