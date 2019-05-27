package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//@SuppressWarnings("serial")
public class Calculator implements ActionListener{
	JFrame frame; 
	JTextField txtans ;
	JButton btn0  , btn1 , btn2 , btn3 , btn4  , btn5 , btn6 , btn7 , btn8	 , btn9 , btndot , btnsub   ;
	JButton btnadd , btndiv  ,btnc  ,btneq;
    public Calculator() 
    {
		initGui();
	}
	
	public void initGui() {
		frame = new JFrame();
		frame.setTitle("MY CALCULATOR");
		
		Container c= frame.getContentPane();
		frame.setLayout(new BorderLayout());
		JPanel panel =new JPanel();
		panel.setLayout(new GridLayout(5,4));
		txtans = new JTextField(10);
		c.add(txtans , BorderLayout.NORTH);
		JLabel lb = new JLabel("                        calculator ") ;
		
		c.add(lb ,BorderLayout.SOUTH );
		btn0 = new JButton(" 0 ") ;
		btn0.setBackground(Color.black);
		panel.add(btn0);
		btn1 = new JButton(" 1 ") ;
		panel.add(btn1);
		btn2 = new JButton(" 2 ") ;
		panel.add(btn2);
		btn3 = new JButton(" 3 ") ;
		panel.add(btn3);
		btn4 = new JButton(" 4 ") ;
		panel.add(btn4);
		btn5 = new JButton(" 5 ") ;
		panel.add(btn5);
		btn6 = new JButton(" 6 ") ;
		panel.add(btn6);
		btn7 = new JButton(" 7 ") ;
		panel.add(btn7);
		btn8 = new JButton(" 8 ") ;
		panel.add(btn8);
		btn9 = new JButton(" 9 ") ;
		panel.add(btn9);
		btneq = new JButton(" = ") ;
		panel.add(btneq);
		btnsub = new JButton(" - ") ;
		panel.add(btnsub);
		btnadd = new JButton(" + ") ;
		panel.add(btnadd);
		btndiv = new JButton(" / ") ;
		panel.add(btndiv);
		btndot = new JButton(" . ") ;
		panel.add(btndot);
		btnc = new JButton(" c ") ;
		panel.add(btnc);

		c.add(panel , BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(230, 320);
		
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnadd.addActionListener(this);
		btnsub.addActionListener(this);
		btneq.addActionListener(this);
		btndot.addActionListener(this);
		btnc.addActionListener(this);

		
	}
	

	public static void main(String[] args) {
		Calculator c1 = new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{  
		if (e.getSource() == btn0)
		{
			txtans.setText(txtans.getText()+0);
		}
		if (e.getSource() == btn1)
		{
			txtans.setText(txtans.getText()+1);
		}
		if (e.getSource() == btn2)
		{
			txtans.setText(txtans.getText()+2);
		}
		if (e.getSource() == btn3)
		{
			txtans.setText(txtans.getText()+3);
		}
		if (e.getSource() == btn4)
		{
			txtans.setText(txtans.getText()+4);
		}
		if (e.getSource() == btn5)
		{
			txtans.setText(txtans.getText()+5);
		}
		if (e.getSource() == btn6)
		{
			txtans.setText(txtans.getText()+6);
		}
		if (e.getSource() == btn7)
		{
			txtans.setText(txtans.getText()+7);
		}
		if (e.getSource() == btn8)
		{
			txtans.setText(txtans.getText()+8);
		}
		if (e.getSource() == btn9)
		{
			txtans.setText(txtans.getText()+9);
		}
		if (e.getSource() == btndot)
		{
			txtans.setText(txtans.getText()+".");
		}
		if (e.getSource() == btndiv)
		{
			txtans.setText(txtans.getText()+"/");
		}
		if (e.getSource() == btneq)
		{
			
			
			
			//txtans.setText(txtans.getText()+"=");
		}
		if (e.getSource() == btnsub)
		{
			txtans.setText(txtans.getText()+"-");
		}
		if (e.getSource() == btnc)
		{
			
			txtans.setText("");
		}
		if (e.getSource() == btnadd)
		{
			txtans.setText(txtans.getText()+"+");
		}
		
		
		
	}

}
