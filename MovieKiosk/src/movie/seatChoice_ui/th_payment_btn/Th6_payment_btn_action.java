package movie.seatChoice_ui.th_payment_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_3;
import movie.seatChoice_ui.SeatChoice_6;
import movie.selectmovie.DateJList;
import movie.selectmovie.SelectMovieMain;
import pos.advancedTicket.third.At3Frame;
import util.DBUtill;

public class Th6_payment_btn_action implements ActionListener {
   Th6_payment_btn btn;


   public Th6_payment_btn_action(Th6_payment_btn btn) {

      this.btn = btn;
   }
   @Override
   public void actionPerformed(ActionEvent e) {
        if(SeatChoice_6.peoples == SeatChoice_6.selected_cnt)
        {
           PeopleCheck.seat6.dispose();
           pos.advancedTicket.third.At3Frame payment = new At3Frame();
           
          Connection con = null;
          PreparedStatement ps = null;
          
          try {
             con = DBUtill.getConnection();
             ps = con.prepareStatement("INSERT INTO movieSales VALUES ('m' || MS_CODE_SEQ.nextval,?,?,?,?)");
             
             ps.setString(1, SelectMovieMain.movie_name);
             ps.setString(2,  "" + SeatChoice_6.ticket_price);
             ps.setString(3, "" + SeatChoice_6.peoples);
             ps.setString(4, DateJList.movie_date);
             
             ps.executeUpdate();
             
             con = DBUtill.getConnection();
             ps = con.prepareStatement("INSERT INTO seats VALUES (s_code_seq.nextval,?,?,?,?)");
             
             int index = 0;
             for(int i = 0; i < 15; i++) {
                if(SeatChoice_6.th6a_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "A";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6a_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6a_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6b_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "B";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6b_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6b_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6c_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "C";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6c_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6c_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6d_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "D";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6d_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6d_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6e_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "E";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6e_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6e_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6f_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "F";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6f_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6f_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6g_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "G";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6g_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6g_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6h_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "H";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6h_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6h_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6i_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "I";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6i_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6i_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6j_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "J";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6j_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6j_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                if(SeatChoice_6.th6k_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "K";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_6.th6k_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_6.th6k_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                   ps.executeUpdate();
                }
                
             }
             

             
             con.close();
             ps.close();
             SeatChoice_6.soldout_update();
             
          } catch (SQLException e1) {
             e1.printStackTrace();
          }
           
        }
        else
        {
           ErrorFrame frame = new ErrorFrame();
           frame.getContentPane().setBackground(new Color(0x404040));
           frame.setDefaultOptions();
           JLabel label = new JLabel();
           label.setText("선택인원이 "+ SeatChoice_6.peoples + "명 보다 적습니다");
           label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
           label.setForeground(Color.white);
           frame.add(label);

        }

   }

}
