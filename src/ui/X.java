package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class X extends  JFrame {
	public X() {
		this.setSize(400,200);
		GridLayout  gridLayout=new GridLayout(5,2);
		this.setLayout(gridLayout);
		JLabel m1=new JLabel("dddx");
		JTextField  n1=new JTextField(20);
		JLabel  m2=new JLabel("ss");
		JTextField  n2=new JTextField(20);
        JLabel m3=new JLabel("qqd");
        JTextField  n3=new JTextField(20);
        JLabel m4=new JLabel("fff");
        JTextField n4=new JTextField(20);
        JButton button=new JButton("≤È—Ø£∫");
        button.addActionListener(new  ActionListener() {
        	public void actionPerformed(ActionEvent  event) {
        		JOptionPane.showMessageDialog(null,n1.getText()+n1.getText()+n2.getText()+n3.getText()+n4.getText());
				
			}
        });
        		
        this.add(m1);	
        this.add(n1);
        this.add(m2);
        this.add(n2);
        this.add(m3);
        this.add(n3);
        this.add(m4);
        this.add(n4);
        this.add(button);
        this.setVisible(true);
        this.setDefaultCloseOperation(X.EXIT_ON_CLOSE);
        		

	}
	public static void main (String arg[]) {
		new X();
	}

}
