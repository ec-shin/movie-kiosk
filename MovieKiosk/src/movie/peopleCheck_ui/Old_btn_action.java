package movie.peopleCheck_ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Old_btn_action implements ActionListener {
	
	Old_btn btn;

	
	public Old_btn_action(Old_btn btn) {
		
		this.btn = btn;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int all_people = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + Integer.parseInt(btn.getText());
		if(all_people <= 8)
		{
			PeopleCheck.now_old_btn_num = Integer.parseInt(btn.getText());
			PeopleCheck.old_cnt = Integer.parseInt(btn.getText());
			PeopleCheck.people_cnt.setText("총"+ (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt) + "명");
			btn.setBackground(new Color(0xCC0066));
			if(PeopleCheck.pre_old_btn_num != PeopleCheck.now_old_btn_num) {
				PeopleCheck.old_btn.get(PeopleCheck.pre_old_btn_num).setBackground(new Color(0x404040));
				PeopleCheck.pre_old_btn_num = PeopleCheck.now_old_btn_num;
			}
		}
		else
		{
			ErrorFrame frame = new ErrorFrame();
			frame.getContentPane().setBackground(new Color(0x404040));
			frame.setDefaultOptions();
			JLabel label = new JLabel();
			label.setText("인원이 8명 초과했습니다.");
			label.setFont(new Font("?��??", Font.PLAIN|Font.BOLD, 30));
			label.setForeground(Color.white);
			label.setHorizontalAlignment(JLabel.CENTER);
			frame.add(label);
		}

		
	}

}
