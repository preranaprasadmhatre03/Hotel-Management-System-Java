package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HotelManagementSystem extends JFrame implements ActionListener
{
	
	HotelManagementSystem(){
		setSize(1366,565);
		setLocation(100,100);
		
		//adding image
		ImageIcon il= new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
		JLabel image= new JLabel(il);
		image.setBounds(0, 0, 1366, 565);
		add(image);
		
		//to write something on frame using JLabel
		JLabel text= new JLabel("HOTEL MANAGEMENT SYSTEM");
		text.setBounds(20, 430, 1000, 90);
		text.setForeground(Color.white);
		text.setFont(new Font("serif",Font.BOLD,50));
		image.add(text);
		
		//Adding next button
		JButton next = new JButton("Next");
		next.setBounds(1150, 450, 150, 50);
		next.setBackground(Color.WHITE);
		next.setForeground(Color.BLACK);
		next.addActionListener(this);
		next.setFont(new Font("serif",Font.PLAIN,24));
		image.add(next);
		
		
		setVisible(true);
		
		//For blinking effect of text infinite loop 
		while(true) {
			text.setVisible(false);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			text.setVisible(true);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
	}
	
	

	public static void main(String[] args) 
	{
		new HotelManagementSystem();
		
		
	}


   // overriding actionPerformed() methodd of ActionListener interface and
	//after clicking the next button login page will be opened
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
		
	}

}