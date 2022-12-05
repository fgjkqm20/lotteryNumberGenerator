package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ShowNumber implements ActionListener {
	private boolean select;		// 복권 선택
	
	public ShowNumber(boolean select) {
		this.select = select;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Integer> numArr = new ArrayList<>();	// 복권 번호 저장 배열
		
		for(int i=0 ; i<6; i++) {		// 1~45 사이의 랜덤 수 저장
			int num = (int)(Math.random()*45) + 1;
			
			if(numArr.contains(num)) {	// 번호 중복 방지
				i--;
				continue;
			}
			
			numArr.add(num);
		}
		
		Collections.sort(numArr);	// 복권 번호 오름차순 정렬
		
		String msg = "";
		if(select) {		// 연금 복권을 선택했을 경우
			int code = (int)(Math.random() * 5) +1;		// 조 저장 변수
			msg =  code + "조    ";
		}
		
		for(int num : numArr) {	// 복권 번호 출력 메시지 만들기
			msg += num + "    ";	
		}
		
		JOptionPane.showMessageDialog(null, msg);	// 복권 번호 보여주기
	}
}
