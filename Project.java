import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


public class Practise extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		JFrame jf = new JFrame("MENU", null);
		JFrame jf1 = new JFrame("ADMISSION FORM"); jf1.setLayout(null); jf1.setSize(800, 700);
		JFrame jf2 = new JFrame("STUDENT DETAILS"); jf2.setSize(800, 700);
		jf.setSize(800, 700); jf.setLayout(null); jf1.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE); jf.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(EXIT_ON_CLOSE); jf2.setLocationRelativeTo(null);
		jf2.setDefaultCloseOperation(EXIT_ON_CLOSE); jf2.getContentPane().setBackground(Color.ORANGE);
		jf.getContentPane().setBackground(Color.ORANGE);
		jf1.getContentPane().setBackground(Color.ORANGE);
		ImageIcon img = new ImageIcon("C:\\Users\\Hemanth\\Pictures\\lpu2.png");
		ImageIcon img1 = new ImageIcon("C:\\Users\\Hemanth\\Pictures\\lpu3.png");
		jf.setIconImage(img.getImage());
		jf1.setIconImage(img.getImage());
		jf2.setIconImage(img.getImage());
		JButton jb = new JButton(img1); jb.setBounds(330, 10, 140, 140); jf.add(jb);

		//

		JLabel jl1 = new JLabel("ADMISSIONS");
		jl1.setForeground(Color.BLUE); jl1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		jl1.setBounds(270, 200, 380, 60); jf.add(jl1);
		JButton jb1 = new JButton("Register");
		jb1.setBounds(260, 350, 120, 30); jf.add(jb1);
		JButton jb2 = new JButton("Details");
		jb2.setBounds(420, 350, 120, 30); jf.add(jb2);

		JButton jb8 = new JButton(img1); jb8.setBounds(330, 10, 140, 140);
		JLabel jl2  = new JLabel("ADMISSION FORM");
		jl2.setForeground(Color.BLUE); jl2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		JLabel jl3 = new JLabel("First Name:");
		JTextField t1 = new JTextField(25);
		JLabel jl4 = new JLabel("Last Name:");
		JTextField t2 = new JTextField(25);
		JLabel jl5 = new JLabel("Father's Name:");
		JTextField t3 = new JTextField(25);
		JLabel jl6 = new  JLabel("Address");
		JTextArea ta1 = new JTextArea(40, 20);
		JLabel jl7 = new JLabel("Date of Birth:");
		JTextField t4 = new JTextField("YYYY-MM-DD", 10);
		JLabel jl8 = new JLabel("Mobile:");
		JTextField t5 = new JTextField(10);
		String[] branch = {"CSE", "ECE", "MEC", "CIVIL", "Other"};
		JLabel jl9 = new JLabel("Preferred Branch:");
		JComboBox<Object> jcb1 = new JComboBox<Object>(branch);
		JTextField t6 = new JTextField("Specify Others", 20);
		JButton jb3 = new JButton("ENROLL");
		jf1.add(jb8); jl2.setBounds(210, 160, 420, 60); jf1.add(jl2); jl3.setBounds(230, 250, 170, 30); jf1.add(jl3);
		t1.setBounds(420, 250, 150, 30); jf1.add(t1); jl4.setBounds(230, 290, 170, 30); jf1.add(jl4);
		t2.setBounds(420, 290, 150, 30); jf1.add(t2); jl5.setBounds(230, 330, 170, 30); jf1.add(jl5);
		t3.setBounds(420, 330, 150, 30); jf1.add(t3); jl6.setBounds(230, 370, 170, 30); jf1.add(jl6);
		ta1.setBounds(420, 370, 150, 60); jf1.add(ta1); jl7.setBounds(230, 440, 170, 30); jf1.add(jl7);
		t4.setBounds(420, 440, 150, 30); jf1.add(t4); jl8.setBounds(230, 480, 170, 30); jf1.add(jl8);
		t5.setBounds(420, 480, 150, 30); jf1.add(t5); jl9.setBounds(230, 520, 170, 30); jf1.add(jl9);
		jcb1.setBounds(420, 520, 150, 30); jf1.add(jcb1); t6.setBounds(420, 560, 150, 30); jf1.add(t6);
		jb3.setBounds(330, 600, 100, 50); jf1.add(jb3);

		jb8.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jf.setVisible(true);
			}
		});

		jb1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				jf1.setVisible(true);
			}
		});

		JPanel jp1 = new JPanel(); jp1.setLayout(null);
		jp1.setBackground(Color.ORANGE);
		JButton jb9 = new JButton(img1); jb9.setBounds(330, 10, 140, 140); jp1.add(jb9);
		JScrollPane jsp = new JScrollPane(jp1);
		JLabel jl10 = new JLabel("STUDENT DETAILS"); JLabel jl13 = new JLabel("OR");
		jl10.setForeground(Color.BLUE); jl10.setFont(new Font("Times New Roman", Font.BOLD, 40));
		jl10.setBounds(210, 180, 380, 60); jp1.add(jl10); jl13.setBounds(380, 260, 80, 50); jp1.add(jl13);
		jl13.setFont(new Font("Times New Roman", Font.BOLD, 25));
		JLabel jl11 = new JLabel("First Name:"); JLabel jl12 = new JLabel("Last Name:");
		jl11.setBounds(50, 250, 100, 30); jl12.setBounds(50, 290, 100, 30); jp1.add(jl11); jp1.add(jl12);
		JTextField t7 = new JTextField(null, 20); JTextField t8 = new JTextField(null, 20);
		t7.setBounds(150, 250, 100, 20); t8.setBounds(150, 290, 100, 20); jp1.add(t7); jp1.add(t8);
		JLabel jl14 = new JLabel("ID:"); jl14.setFont(new Font("Times New Roman", Font.BOLD, 18));
		jl14.setBounds(500, 275, 50, 20); jp1.add(jl14);
		JTextField t9 = new JTextField(20); t9.setBounds(550, 275, 100, 20); jp1.add(t9);
		JButton jb4 = new JButton("GET DETAILS"); jb4.setBounds(325, 330, 150, 30); jp1.add(jb4);
		JLabel jl21 = new JLabel("First Name:"); jl21.setBounds(225, 400, 175, 30); jp1.add(jl21);
		JLabel jl22 = new JLabel(); jl22.setBounds(400, 400, 175, 30); jp1.add(jl22);
		JLabel jl31 = new JLabel("Last Name:"); jl31.setBounds(225, 440, 175, 30); jp1.add(jl31);
		JLabel jl33 = new JLabel(); jl33.setBounds(400, 440, 175, 30); jp1.add(jl33);
		JLabel jl41 = new JLabel("Father's Name:"); jl41.setBounds(225, 480, 175, 30); jp1.add(jl41);
		JLabel jl44 = new JLabel(); jl44.setBounds(400, 480, 175, 30); jp1.add(jl44);
		JLabel jl51 = new JLabel("Preferred Branch:"); jl51.setBounds(225, 520, 175, 30); jp1.add(jl51);
		JLabel jl55 = new JLabel(); jl55.setBounds(400, 520, 175, 30); jp1.add(jl55);
		JLabel jl61 = new JLabel("Mobile Number:"); jl61.setBounds(225, 560, 175, 30); jp1.add(jl61);
		JLabel jl66 = new JLabel(); jl66.setBounds(400, 560, 175, 30); jp1.add(jl66);

		jb9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jf.setVisible(true);
			}
		});

		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "11402000");
					if(!(t7.getText().equals(""))){
						String stmt = "select * from Students where f_name='"+t7.getText()+"' AND l_name='"+t8.getText()+"';";
						PreparedStatement st = con.prepareStatement(stmt);
						ResultSet rs = st.executeQuery();
						if(rs.next()){
							jl22.setText(rs.getString(2));
							jl33.setText(rs.getString(3));
							jl44.setText(rs.getString(4));
							jl55.setText(rs.getString(8));
							jl66.setText(String.valueOf(rs.getLong(7)));
						}
						else{
							String message = "No Student with the given Name could be found";
							JOptionPane.showMessageDialog(jf2, message, "Student Not Found", JOptionPane.ERROR_MESSAGE);
						}						
					}
					else{
						String stmt = "select * from Students where id=" + Integer.parseInt(t9.getText()) + ";";
						PreparedStatement st = con.prepareStatement(stmt);
						ResultSet rs = st.executeQuery();
						if(rs.next()){
							jl22.setText(rs.getString(2));
							jl33.setText(rs.getString(3));
							jl44.setText(rs.getString(4));
							jl55.setText(rs.getString(8));
							jl66.setText(String.valueOf(rs.getLong(7)));
						}
						else{
							String message = "No Student with the given ID could be found";
							JOptionPane.showMessageDialog(jf2, message, "Student Not Found", JOptionPane.ERROR_MESSAGE);
						}
					}
					con.close();
				} catch (SQLException | ClassNotFoundException e) {
					e.printStackTrace();
				}												 
			}
		});
		jf2.add(jsp);

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				jf2.setVisible(true);
			}
		});

		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "11402000");
					PreparedStatement st1 = con.prepareStatement("select * from Students where f_name='"+t1.getText()+"' AND l_name='"+t2.getText()+"';");
					ResultSet rst = st1.executeQuery();
					if(!rst.next()){										
						PreparedStatement st = con.prepareStatement("insert into Students(f_name,l_name,father_name,address,dob,mobile_no,branch,other_branch) values(?, ?, ?, ?, ?, ?, ?, ?)");
						st.setString(1, t1.getText()); st.setString(2, t2.getText()); st.setString(3, t3.getText());
						st.setString(4, ta1.getText()); st.setString(5, t4.getText()); st.setLong(6, Long.parseLong(t5.getText()));
						st.setString(7, branch[jcb1.getSelectedIndex()]); st.setString(8, t6.getText());
						int x = st.executeUpdate();
						System.out.println("Number of rows affected by the statement are: "+x);
						t1.setText(null); t2.setText(null); t3.setText(null); ta1.setText(null); t4.setText(null);
						t5.setText(null); t6.setText(null);
						String s = new String("New Student "+t1.getText()+" "+t2.getText()+" admissioned in LPU");
						JOptionPane.showMessageDialog(jf2, s);
					}else{
						String s = new String("A Student with the same First Name & Second Name already exists.Do you wish to continue?");
						if((JOptionPane.showConfirmDialog(jf2, s)) == 0){
							PreparedStatement st = con.prepareStatement("insert into Students(f_name,l_name,father_name,address,dob,mobile_no,branch,other_branch) values(?, ?, ?, ?, ?, ?, ?, ?)");
							st.setString(1, t1.getText()); st.setString(2, t2.getText()); st.setString(3, t3.getText());
							st.setString(4, ta1.getText()); st.setString(5, t4.getText()); st.setLong(6, Long.parseLong(t5.getText()));
							st.setString(7, branch[jcb1.getSelectedIndex()]); st.setString(8, t6.getText());
							int x = st.executeUpdate();
							System.out.println("Number of rows affected by the statement are: "+x);
							t1.setText(null); t2.setText(null); t3.setText(null); ta1.setText(null); t4.setText(null);
							t5.setText(null); t6.setText(null);
							String sa = new String("New Student "+t1.getText()+" "+t2.getText()+" admissioned in LPU");
							JOptionPane.showMessageDialog(jf2, sa);
						}
						else{
							
						}
					}
					con.close();
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			}
		});



		jf.setVisible(true);
	}

}
