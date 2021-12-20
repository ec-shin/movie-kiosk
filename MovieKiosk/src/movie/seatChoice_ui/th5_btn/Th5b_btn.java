package movie.seatChoice_ui.th5_btn;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Th5b_btn extends JButton {
	
	List<JButton> btns;
	int cnt;
	
	public Th5b_btn(List<JButton> btns, int cnt) {
		this.btns = btns;
		this.cnt = cnt;
		setText("" + (cnt + 1));
		setFont(new Font("?��??", Font.PLAIN, 15));
		setForeground(Color.white);
		setBackground(new Color(0xFFB266));
		setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
		addActionListener(new Th5b_btn_action(this));
		
	}

}