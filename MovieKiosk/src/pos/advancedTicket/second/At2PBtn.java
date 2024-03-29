package pos.advancedTicket.second;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import pos.advancedTicket.first.At1Frame;

public class At2PBtn extends JButton implements ActionListener{
    JFrame At2F;

    public At2PBtn(JFrame At2F) {
        super();
        this.At2F = At2F;
        setBounds(0,0,89,63);
        setBackground(Color.black);
        setImageSize();
        setBorder(null);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new At1Frame();
        At2F.setVisible(false);
    }

    private void setImageSize() {
        ImageIcon icon = new ImageIcon("./img/At1Page/p_w.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        this.setIcon(newImc);
    }
}