import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
	private JTextField text_answer;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8 ,b9 ,b0 ,bplus , bminus, bmulti, bdiv, bresult,breset,bdecimal;
	private String step1, step2, s_answer;
	private double answer = 0.0;
	private JPanel panel;
	private boolean clicked = false, choose = false;
	char operation = ' ';
	
	public Gui(){
		super("Calculator");
		
		text_answer = new JTextField(null,20);
		text_answer.setEditable(false);
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bdecimal = new JButton(",");
		bplus = new JButton("+");
		bminus = new JButton("-");
		bmulti = new JButton("*");
		bdiv = new JButton("/");
		bresult = new JButton("=");
		breset = new JButton("CE");
		
		Dimension dim = new Dimension(75,25);
		
		b1.setPreferredSize(dim); b2.setPreferredSize(dim); b3.setPreferredSize(dim); b4.setPreferredSize(dim); 
		b5.setPreferredSize(dim); b6.setPreferredSize(dim); b7.setPreferredSize(dim); b8.setPreferredSize(dim); 
		b9.setPreferredSize(dim); b0.setPreferredSize(new Dimension(155,25)); bdecimal.setPreferredSize(dim);
		bplus.setPreferredSize(dim); bminus.setPreferredSize(dim); 
		bmulti.setPreferredSize(dim); bdiv.setPreferredSize(dim);
		bresult.setPreferredSize(dim); breset.setPreferredSize(new Dimension(225,25));
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		Reset r = new Reset();
		
		b1.addActionListener(n); b2.addActionListener(n); b3.addActionListener(n); b4.addActionListener(n);
		b5.addActionListener(n); b6.addActionListener(n); b7.addActionListener(n); b8.addActionListener(n);
		b9.addActionListener(n); b0.addActionListener(n); bdecimal.addActionListener(n);
		
		bplus.addActionListener(c); bminus.addActionListener(c); bmulti.addActionListener(c); bdiv.addActionListener(c); bresult.addActionListener(c);
		
		breset.addActionListener(r);
		
		panel = new JPanel();
		panel.setBackground(Color.orange);
		panel.setLayout(new FlowLayout());
		panel.add(text_answer, BorderLayout.NORTH);
		
		panel.add(b1); panel.add(b2); panel.add(b3); panel.add(b4); 
		panel.add(b5); panel.add(b6); panel.add(b7); panel.add(b8); 
		panel.add(b9); panel.add(b0); panel.add(bdecimal); panel.add(bplus); panel.add(bminus);
		panel.add(bmulti); panel.add(bdiv); panel.add(bresult); panel.add(breset);
		
		
		this.setContentPane(panel);
	}
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(b1)){
				if(choose == false){
					if(step1 == null){
						step1 = "1";
					}else{
						step1 = step1 + "1";
					}
				}else{
					if(step2 == null){
						step2 = "1";
					}else{
						step2 = step1 + "1";
					}
				}
			}
			if(src.equals(b2)){
				if(choose == false){
					if(step1 == null){
						step1 = "2";
					}else{
						step1 = step1 + "2";
					}
				}else{
					if(step2 == null){
						step2 = "2";
					}else{
						step2 = step2 + "2";
					}
				}
			}
			if(src.equals(b3)){
				if(choose == false){
					if(step1 == null){
						step1 = "3";
					}else{
						step1 = step1 + "3";
					}
				}else{
					if(step2 == null){
						step2 = "3";
					}else{
						step2 = step2 + "3";
					}
				}
			}
			if(src.equals(b4)){
				if(choose == false){
					if(step1 == null){
						step1 = "4";
					}else{
						step1 = step1 + "4";
					}
				}else{
					if(step2 == null){
						step2 = "4";
					}else{
						step2 = step2 + "4";
					}
				}
			}
			if(src.equals(b5)){
				if(choose == false){
					if(step1 == null){
						step1 = "5";
					}else{
						step1 = step1 + "5";
					}
				}else{
					if(step2 == null){
						step2 = "5";
					}else{
						step2 = step2 + "5";
					}
				}
			}
			if(src.equals(b6)){
				if(choose == false){
					if(step1 == null){
						step1 = "6";
					}else{
						step1 = step1 + "6";
					}
				}else{
					if(step2 == null){
						step2 = "6";
					}else{
						step2 = step2 + "6";
					}
				}
			}
			if(src.equals(b7)){
				if(choose == false){
					if(step1 == null){
						step1 = "7";
					}else{
						step1 = step1 + "7";
					}
				}else{
					if(step2 == null){
						step2 = "7";
					}else{
						step2 = step2 + "7";
					}
				}
			}
			if(src.equals(b8)){
				if(choose == false){
					if(step1 == null){
						step1 = "8";
					}else{
						step1 = step1 + "8";
					}
				}else{
					if(step2 == null){
						step2 = "8";
					}else{
						step2 = step2 + "8";
					}
				}
			}
			if(src.equals(b9)){
				if(choose == false){
					if(step1 == null){
						step1 = "9";
					}else{
						step1 = step1 + "9";
					}
				}else{
					if(step2 == null){
						step2 = "9";
					}else{
						step2 = step2 + "9";
					}
				}
			}
			if(src.equals(b0)){
				if(choose == false){
					if(step1 == null){
						step1 = "0";
					}else{
						step1 += "0";
					}
				}else{
					if(step2 == null){
						step2 = "0";
					}else{
						step2 += "0";
					}
				}
			}
			if(src.equals(bdecimal)){
				if(choose == false){
					if(step1 == null){
						step1 = "0.";
					}else
						if(step1 != null){
							if(step1.contains(".")){
								System.out.println("ERROR");
							}else{
								step1 += ".";
							}
						}
				}else{
					if(step2 == null){
						step2 = "0.";
					}else
						if(step2!=null){
							if(step2.contains(".")){
								System.out.println("ERROR");
							}else{
								step2 += ".";
							}
						}
				}
			}
			if(clicked == false){
				if(choose == false){
					text_answer.setText(step1);
				}else{
					text_answer.setText(step2);
				}
			}
		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(bplus)){
				if(step1 == null){
					System.out.println("Wrong action");
				}else
					if(step1 != null && step2 == null){
						choose = true;
						operation = '+';
					}
					else
						if(step1 != null && step2 != null)
							System.out.println("ERROR");
			}
			
			if(src.equals(bminus)){
				if(step1 == null){
					System.out.println("Wrong action");
				}else
					if(step1 != null && step2 == null){
						choose = true;
						operation = '-';
					}
					else
						if(step1 != null && step2 != null)
							System.out.println("ERROR");
			}
			
			if(src.equals(bmulti)){
				if(step1 == null){
					System.out.println("Wrong action");
				}else
					if(step1 != null && step2 == null){
						choose = true;
						operation = '*';
					}
					else
						if(step1 != null && step2 != null)
							System.out.println("ERROR");
			}
			
			if(src.equals(bdiv)){
				if(step1 == null){
					System.out.println("Wrong action");
				}else
					if(step1 != null && step2 == null){
						choose = true;
						operation = '/';
					}
					else
						if(step1 != null && step2 != null)
							System.out.println("ERROR");
			}
			
			if(src.equals(bresult)){
				if(step1 == null){
					System.out.println("Wrong action");
				}else
					if(step1 != null && step2 == null){
						System.out.println("Wrong action");
					}
				if(step1 != null && step2 != null){
					double d1 = 0.0, d2 = 0.0;
					
					d1 = Double.parseDouble(step1);
					d2 = Double.parseDouble(step2);
					
					switch(operation){
					case '+' : answer = d1 + d2; break;
					case '-' : answer = d1 - d2; break;
					case '*' : answer = d1 * d2; break;
					case '/' : answer = d1 / d2; break;
					}
					s_answer = Double.toString(answer);
					text_answer.setText(s_answer);
					if (operation == '/' && d2 == 0.0)
						text_answer.setText("0.0");
				}
			}	
		}
	}

	private class Reset implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource();
			
			if (src.equals(breset)){
				step1 = null;
				step2 = null;
				operation =' ';
				choose = false;
				clicked = false;
				text_answer.setText(null);
				s_answer = null;
			}
		}	
	}
}