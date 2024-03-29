package pos.admin.first;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import pos.admin.sales.first.S1Frame;

public class AdBtn1Act implements ActionListener, MouseListener {
	JFrame mainF;
	
	public AdBtn1Act(JFrame mainF) {
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { 
			new S1Frame();  
			mainF.dispose();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	      JButton b = (JButton)e.getSource();
	      LineBorder lb = new LineBorder(Color.lightGray,5,true);
	      b.setBorder(lb);
	}

	@Override
	public void mouseExited(MouseEvent e) {
	      JButton b = (JButton)e.getSource();
	      LineBorder lb = new LineBorder(Color.black,5,true);
	      b.setBorder(lb);
	}
}