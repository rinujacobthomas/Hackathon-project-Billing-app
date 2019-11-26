package prj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Main
 {
	 public static void main(String [] args)
	 {
		 A a = new A();							//calling class A constructor for display
	 }
 }
 class A extends JFrame implements ActionListener
 {
	 public Connection conn() throws ClassNotFoundException, SQLException
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
			return con;
		}
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	 JTextField t1,t2,t3,t4,t5,t6;
	 JRadioButton r2,r1;
	 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
	 JComboBox c1,c2;
	 A()
	 {									//frame and all components
		 setVisible(true);
		 setLayout(null);
		 setSize(1500,1000);
		 setDefaultCloseOperation(3);				//enable close button
		l1= new JLabel("Chicken burger"); 
		add(l1);
		l1.setBounds(20, 20, 200, 20);
		l20= new JLabel("Currency Converter"); 
		add(l20);
		l20.setBounds(400, 20, 200, 20);
		 String s2[] = { "Euro", "Dollar"}; 
		c2 = new JComboBox(s2);
		 add(c2);
		 c2.setBounds(400, 50, 200, 30);
		 l21= new JLabel(".."); 
			add(l21);
			l21.setBounds(500, 100, 200, 20);
			b5=new JButton("Convert");
			add(b5);
			b5.setBounds(400, 140, 80, 20);
			b5.addActionListener(this);
			b6=new JButton("Clear");
			add(b6);
			b6.setBounds(500, 140, 80, 20);
			b6.addActionListener(this);
			b7=new JButton("CALCULATOR");
			add(b7);
			b7.setBounds(700, 20, 150, 20);
			b7.addActionListener(this);
			b25=new JButton("RECEIPT");
			add(b25);
			b25.setBounds(900, 20, 150, 20);
			b25.addActionListener(this);
		l2= new JLabel("Chicken burger meal"); 
		add(l2);
		l2.setBounds(20, 60, 200, 20);
		l3= new JLabel("Cheese burger"); 
		add(l3);
		l3.setBounds(20, 100, 200, 20);
		 t1= new JTextField();
		 add(t1);
		 t1.setBounds(200, 20, 50, 20);
		 t2= new JTextField();
		 add(t2);
		 t2.setBounds(200, 60, 50, 20);
		 t3= new JTextField();
		 add(t3);
		 t3.setBounds(200, 100, 50, 20);
		 l4= new JLabel("Drink");
		 add(l4);
		 l4.setBounds(20, 140, 100, 30);
		 l5= new JLabel("Quantity");
		 add(l5);
		 l5.setBounds(200, 140, 100, 30);
		 String s1[] = { "tea", "juice"}; 
		 c1 = new JComboBox(s1);
		 add(c1);
		 c1.setBounds(20, 180, 100, 20);
		 t4= new JTextField();
		 add(t4);
		 t4.setBounds(200, 180, 50, 20);
		 l6= new JLabel("home"); 
			add(l6);
			l6.setBounds(20, 210, 200, 20);
		 r1= new JRadioButton();
		 add(r1);
		 r1.setBounds(50, 210, 50, 20);
		 l7= new JLabel("tax"); 
			add(l7);
			l7.setBounds(200, 210, 200, 20);
		  r2= new JRadioButton();
		 add(r2);
		 r2.setBounds(220, 210, 50, 20);
		 l8= new JLabel("Cost of drinks"); 
			add(l8);
			l8.setBounds(20, 250, 200, 20);
			l9= new JLabel("Cost of meals"); 
			add(l9);
			l9.setBounds(20, 290, 200, 20);
			l10= new JLabel("Cost of delivery"); 
			add(l10);
			l10.setBounds(20, 330, 200, 20);
			 l11= new JLabel(".."); 
				add(l11);
				l11.setBounds(200, 250, 200, 20);
				l12= new JLabel(".."); 
				add(l12);
				l12.setBounds(200, 290, 200, 20);
				l13= new JLabel(".."); 
				add(l13);
				l13.setBounds(200, 330, 200, 20);
				b1=new JButton("Total");
				add(b1);
				b1.addActionListener(this);
				b1.setBounds(20, 380, 80, 20);
				b2=new JButton("Recept");
				add(b2);
				b2.setBounds(110, 380, 80, 20);
				b2.addActionListener(this);
				b3=new JButton("Reset");
				add(b3);
				b3.setBounds(200, 380, 80, 20);
				b3.addActionListener(this);
				b4=new JButton("Exit");
				add(b4);
				b4.setBounds(290, 380, 80, 20);
				b4.addActionListener(this);
				 l14= new JLabel("tax"); 
					add(l14);
					l14.setBounds(280, 250, 200, 20);
					l15= new JLabel("sub total"); 
					add(l15);
					l15.setBounds(280, 290, 200, 20);
					l16= new JLabel("total"); 
					add(l16);
					l16.setBounds(280, 330, 200, 20);
					l17= new JLabel(".."); 
					add(l17);
					l17.setBounds(380, 250, 200, 20);
					l18= new JLabel(".."); 
					add(l18);
					l18.setBounds(380, 290, 200, 20);
					l19= new JLabel(".."); 
					add(l19);
					l19.setBounds(380, 330, 200, 20);
		
	 }
	 int a=0,b=0,c=0,d=0,total=0,ckbr=0,ckbrml=0,csbr=0,drno=0,dl,tx;
	 String drink;
	public void actionPerformed(ActionEvent ar) {			//working
		if(ar.getSource()==b1)
		{
			ckbr=Integer.parseInt(t1.getText());
			a=ckbr*20;
			ckbrml=Integer.parseInt(t2.getText());
			b=ckbrml*40;
			csbr=Integer.parseInt(t3.getText());
			c=csbr*30;
			a=a+b+c;
			total=a;
			l12.setText(a+"");
			if(c1.getSelectedItem()=="tea")
			{
				d=20;
			drink="tea";
			}
			else
			{
				d=40;
				drink="juice";
			}
			drno=Integer.parseInt(t4.getText());
			d=d*drno;
			l11.setText(d+"");
			total=total+d;
			if(r1.isSelected())
			{
				l13.setText(50+"");
				dl=50;
				total=total+50;
			}
			else
			{
				dl=0;
			}
			if(r2.isSelected())
			{
				l17.setText(10+"");
				total=total+10;
				tx=10;
			}
			else
			{
				tx=0;
			}
			
			l19.setText(total+"");
			
			try {
				Statement st = conn().createStatement(); //Inserting to Database
				st.execute("insert into receipt values("+ckbr+","+ckbrml+","+csbr+",'"+drink+"',"+drno+","+d+","+a+","+dl+","+tx+","+total+")");
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ar.getSource()==b5)		//Conveting to Dollar
		{
			if(c2.getSelectedItem()=="Dollar")
			{
				l21.setText(total/50+"");
			}
			else
			{
				l21.setText(total/20+"");
			}
		}
		else if(ar.getSource()==b6)		//Resetting Fields
		{
			l21.setText("..");
		}
		else if(ar.getSource()==b25)
		{
			 JLabel pdname;
				pdname = new JLabel("Receipt");
         pdname.setBounds(10,400,150,30);;
         add(pdname);
			Statement st;
			try {
				st = conn().createStatement();
				ResultSet rs = st.executeQuery("select chickenburger,chickenburgermeea,cheesburger,drink,drinkno,costofdrink,costofmeal,delivery,tax,total from receipt");
	            int a=0;    
	           
	               while(rs.next())
	               {
	                   
	                    JLabel pdname1;
			    pdname1 = new JLabel(rs.getString(1));
	                    pdname1.setBounds(10,400+a,150,30);;
	                    add(pdname1);
	                       
	                       JLabel orderq=new JLabel(rs.getString(2));
	                       orderq.setBounds(120,400+a,150,30);
	                       add(orderq);
	                       
	                       JLabel ttperprodt=new JLabel(rs.getString(3));
	                       ttperprodt.setBounds(240,400+a,150,30);
	                       add(ttperprodt);
	                       a++;
	               }
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else if(ar.getSource()==b3)		//Resetting textFields
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			r1.setSelected(false);
			r1.setSelected(false);
			l11.setText("..");
			l12.setText("..");
			l13.setText("..");
			l17.setText("..");
			l18.setText("..");
			l19.setText("..");
		}
		else if(ar.getSource()==b7)		//unhiding Calculator
		{
			 t6= new JTextField();			//Calculator buttons and textFields
			 add(t6);
			 t6.setBounds(750, 80, 200, 40);
			b9=new JButton("1");
			add(b9);
			b9.setBounds(700, 140, 50, 20);
			b9.addActionListener(this);
			b10=new JButton("2");
			add(b10);
			b10.setBounds(760, 140, 50, 20);
			b10.addActionListener(this);
			b11=new JButton("3");
			add(b11);
			b11.setBounds(820, 140, 50, 20);
			b11.addActionListener(this);
			b12=new JButton("4");
			add(b12);
			b12.setBounds(880, 140, 50, 20);
			b12.addActionListener(this);
			b13=new JButton("+");
			add(b13);
			b13.setBounds(940, 140, 50, 20);
			b13.addActionListener(this);
			b14=new JButton("5");
			add(b14);
			b14.setBounds(700, 170, 50, 20);
			b14.addActionListener(this);
			b15=new JButton("6");
			add(b15);
			b15.setBounds(760, 170, 50, 20);
			b15.addActionListener(this);
			b16=new JButton("7");
			add(b16);
			b16.setBounds(820, 170, 50, 20);
			b16.addActionListener(this);
			b17=new JButton("8");
			add(b17);
			b17.setBounds(880, 170, 50, 20);
			b17.addActionListener(this);
			b18=new JButton("-");
			add(b18);
			b18.setBounds(940, 170, 50, 20);
			b18.addActionListener(this);
			b19=new JButton("9");
			add(b19);
			b19.setBounds(700, 200, 50, 20);
			b19.addActionListener(this);
			b20=new JButton("0");
			add(b20);
			b20.setBounds(760, 200, 50, 20);
			b20.addActionListener(this);
			b21=new JButton("/");
			add(b21);
			b21.setBounds(820, 200, 50, 20);
			b21.addActionListener(this);
			b22=new JButton("*");
			add(b22);
			b22.setBounds(880, 200, 50, 20);
			b22.addActionListener(this);
			b23=new JButton("B");
			add(b23);
			b23.setBounds(940, 200, 50, 20);
			b23.addActionListener(this);
			b23=new JButton("B");
			add(b23);
			b23.setBounds(940, 200, 50, 20);
			b23.addActionListener(this);
			b24=new JButton("=");
			add(b24);
			b24.setBounds(940, 200, 50, 20);
			b24.addActionListener(this);
			b24.setBounds(1000, 90, 50, 20);
			
			
		}
		
	}
	 
	 
 }
