package GUI;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

@SuppressWarnings("unused")
public class Project extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String HH[]){
		JFrame jf = new JFrame("MENU");
		JFrame jf2 = new JFrame("ADMISSION FORM");
		JFrame jf3 = new JFrame("DETAILS");
		ImageIcon img = new ImageIcon("C:\\Users\\Hemanth\\Pictures\\lpu.jpg");
		jf.setSize(img.getIconWidth(), img.getIconHeight());
		jf2.setSize(img.getIconWidth(), img.getIconHeight());
		jf3.setSize(img.getIconWidth(), img.getIconHeight());
		jf.setIconImage(new ImageIcon("C:\\Users\\Hemanth\\Pictures\\lpu2.png").getImage());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf2.setLocationRelativeTo(null);
		jf3.setLocationRelativeTo(null);
		jf.setLayout(null);
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); 
		jf.add(jl); jf2.add(jl);
		
		JToggleButton jb1 = new JToggleButton("REGISTER");
		JToggleButton jb2 = new JToggleButton("DETAILS");
		jf.add(jb1); jf.add(jb2); jb1.setBounds(300, 300, 100, 40); jb2.setBounds(500, 300, 100, 40);
		
		JLabel jl1 = new JLabel("Name: ");
		JTextField t1 = new JTextField(15);
		JLabel jl2 = new JLabel("Father's Name: ");
		JTextField t2 = new JTextField(15);
		JLabel jl3 = new JLabel("Father's Occupation: ");
		JTextField t3 = new JTextField(15);
		JLabel jl4 = new JLabel("Preferred Branch: ");
		String[] Branch = {"CSE", "ECE", "MEC", "CIVIL"};
		JComboBox<Object> jcb1 = new JComboBox<Object>(Branch);
		JLabel jl5 = new JLabel("CGPA/Percentage: ");
		JTextField t5 = new JTextField(15);
		JToggleButton jb3 = new JToggleButton("ENROLL");
		
		jl1.setBounds(50, 50, 150, 30); jl2.setBounds(50, 100, 150, 30); jl3.setBounds(50, 150, 150, 30);
		jl4.setBounds(50, 200, 150, 30); jl5.setBounds(50, 250, 150, 30);
		t1.setBounds(200, 50, 150, 30); t2.setBounds(200, 100, 150, 30); t3.setBounds(200, 150, 150, 30);
		jcb1.setBounds(200, 200, 150, 30); t5.setBounds(200, 250, 150, 30); jb3.setBounds(180, 450, 100, 30);
		jf2.add(jl1); jf2.add(t1); jf2.add(jl2); jf2.add(t2); jf2.add(jl3); jf2.add(t3); jf2.add(jl4); jf2.add(jcb1);
		jf2.add(jl5); jf2.add(t5);
		
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf2.setVisible(true);
				jf.setVisible(false);
			}
		});
		
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jf3.setVisible(true);
				jf.setVisible(false);
			}
		});
		
		jb3.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals(null) || t2.getText().equals(null) || t5.getText().equals(null)){
					String error = "Please fill all the Required Fields";
					JOptionPane.showMessageDialog(jf, error, "CORRECTION", JOptionPane.ERROR_MESSAGE);
				}
				else{
					String confirm = "Successfully Registered the new Student: " + t1.getText();
					JOptionPane.showMessageDialog(jf, confirm);
				}
			}
		});
		
		jf.setVisible(true);
	}
}
