package vyshu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.lang.String;
public abstract class scoreboard implements  ActionListener{
public static void main(String args[])  
    {  
    JFrame f= new JFrame();  
    JLabel l1;
  l1=new JLabel("cricket score board");  
    l1.setBounds(250,120, 250,80);  
    f.add(l1);
  f.setLayout(null);  
    f.setVisible(true); 
    TextField t4;
    t4=new TextField();  
    t4.setBounds(250,250, 200,30);  
       f.add(t4);
       JLabel l2;
       l2=new JLabel("Team1 Name");  
       l2.setBounds(160,220, 250,80);  
       f.add(l2);
TextField t1,t2,t3;
t1=new TextField();  
t1.setBounds(730,250, 200,30);  
t2=new TextField();
t3=new TextField();  
t3.setBounds(250,380, 200,30);  
f.add(t3); 
Label l3,l5,l4;
l3=new Label("SCORE(T1) ");  
l3.setBounds(630,250, 100,30);  
l4=new Label(" SCORE(T2)  ");  
l4.setBounds(620,350, 100,30); 
l5=new Label("Team2 Name");  
l5.setBounds(150,380, 100,30); 

f.add(l3); f.add(l4);f.add(l5);
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);  
t2.setBounds(730,350, 200,30);  
f.add(t1); f.add(t2);  
f.setSize(1400,1400);  
f.setLayout(null);  
f.setVisible(true); 
JButton b=new JButton("Submit");
b.setBounds(290,530,90, 40);    
f.add(b);
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	 JFrame f= new JFrame();
 String team1=t1.getText();
 String team2=t2.getText();
	    JLabel l1;
	  l1=new JLabel("*****cricket score board*****");  
	    l1.setBounds(290,120, 250,80);  
	    f.add(l1);
	   f.setLayout(null);  
	        f.setVisible(true);  
	         f.setSize(1400,1400);  
	         TextField t1,t2;
	         Label l3,l4; 
	         l3=new Label(" Score(T1)");  
	         l3.setBounds(360,250, 100,30);  
	         l4=new Label(" Score(T2)");  
	         l4.setBounds(360,410,100,30); 
	         f.add(l3); f.add(l4);
	t1=new TextField(team1);  
	 t1.setEditable(false);
	t1.setBounds(270,300, 200,30);  
    t2=new TextField(team2);  
	t2.setBounds(270,490, 200,30);
	 t2.setEditable(false);
	f.add(t1);f.add(t2);
	JButton b=new JButton("score board");
	b. setBounds(600,600,90, 40);     
	f.add(b);
b.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
	JFrame f= new JFrame();
	 
      
	
	
	final Object[][] data = null;
	
	
		String data1[][]= {{"R.Sharma","42","44","6","0","95.45"},
				{"S.Dhawan","96","90","13","1","106.6/7"},
				{"V.Kohli","78","76","6","0","102.6/3"},
				{"s.lyer","7","17","1","0","41.18",},
				{"K.L.Rahul","80","52","4","3","153.8/5"},
				{"M.Pandey","2","4","0","0","50.00"},
				{"R.Jadeja(not out)","21","17","1","0","125.0/0"},
				{"M.Shami","98","10","9","1","96.08"},
				{"AUSTRALIA","-","-","-","-","-"},
				{"D.Warner","15","12","2","0","125.0/0"},
				{"A.Finch","33","48","3","0","68.75"},
				{"S.Smith","98","10","9","1","96.08"},
				{"R.Cummins","21","17","1","0","125.0/0"},
				{"S.Zampa","98","10","9","1","96.08"},
				{"A.Agar","25","25","3","0","100.0/0"}};
				String column[]= {"NAME","R","B","4S","6S"};
		JTable jt=new JTable(data1,column);
		jt.setBounds(40,100,100,200);
		JScrollPane sp=new JScrollPane(jt);
		f.add(sp);
		f.setSize(300,400);
		f.setVisible(true);
		
				JButton b=new JButton("congratulations");
				b. setBounds(600,600,90, 40);       
				f.add(b);
				f.setSize(1400,1400);
				f.setLayout(null);
				f.setVisible(true);
			b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					JFrame f;
					 JFrame f1= new JFrame();
					 {
				
							 
							 
		 JOptionPane.showMessageDialog(f1,"Team1 won the match");
					
		JOptionPane.showMessageDialog(f1,"visit m.cricbuzz.com for live updates");
					 
					 }
					 
				
					}
		
			});
			

}
});
}
});
    }
}
			
 

