package demo_calculatrice_swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calcul extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panel_1 ;
	private JPanel panel_2;
	private JButton Button_C;
	private JButton Button_Plus;
	private JButton Button_Moins;
	private JButton Button_Multi;
	private JLabel resultLabel;
	private JButton Button_Div;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_16;
	private double number1=0;
	private Model model;
	private String operator="";
	private boolean start=true;
	public Calcul() {
		setSize(new Dimension(300, 300));
		setVisible(true);
		setPreferredSize(new Dimension(200, 200));
		setTitle("Calculatrice");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		initComponent();
		
	}
	
	private void initComponent() {
		model = new Model();
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(20, 38));
		getContentPane().add(panel, BorderLayout.NORTH);
		
		resultLabel = new JLabel("");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultLabel.setPreferredSize(new Dimension(280, 30));
		panel.add(resultLabel);
		
		panel_1 = new JPanel();
		panel_1.setSize(new Dimension(75, 75));
		panel_1.setPreferredSize(new Dimension(100, 100));
		getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(5, 1, 0, 0));
		
		
		
		panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 3, 0, 0));
		
		btnNewButton_5 = new JButton("1");
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addNumber(e);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_7);
		
		btnNewButton_12 = new JButton("4");
		btnNewButton_12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_12);
		
		btnNewButton_8 = new JButton("5");
		btnNewButton_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_8);
		
		btnNewButton_4 = new JButton("6");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_4);
		
		btnNewButton_10 = new JButton("7");
		btnNewButton_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_10);
		
		btnNewButton_13 = new JButton("8");
		btnNewButton_13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_13);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_9);
		
		btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addNumber(arg0);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_11);
		
		Button_C = new JButton("C");
		Button_C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				resultLabel.setText("0");
				
				}
			}
		);
		Button_C.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(Button_C);
		
		Button_Plus = new JButton("+");
		Button_Plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processOperators(arg0);
				//startCalcul();
				}
			}
		);
		Button_Plus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(Button_Plus);
		
		Button_Moins = new JButton("-");
		Button_Moins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processOperators(arg0);
				//startCalcul();
				}
			}
		);
		Button_Moins.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(Button_Moins);
		
		Button_Multi = new JButton("*");
		Button_Multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processOperators(arg0);
				//startCalcul();
				}
			}
		);
		Button_Multi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(Button_Multi);
		
		Button_Div = new JButton("/");
		Button_Div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processOperators(arg0);
				//startCalcul();
				}
			}
		);
		Button_Div.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(Button_Div);
		
		btnNewButton_14 = new JButton(".");
		btnNewButton_14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processOperators(arg0);
				//startCalcul();
				}
			}
		);
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(btnNewButton_14);
		
		btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				processOperators(arg0);
				//startCalcul();
				}
			}
		);
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(btnNewButton_16); 
		
	}
	//----------------------------------------------------------
	public void addNumber(ActionEvent event) {
		if(start) {
			//resultLabel.setText("0");
			start=false;
		}
		String value=((JButton)event.getSource()).getText();
		resultLabel.setText(resultLabel.getText()+value);	
	}
	//-----------------------------------------------------------
	public void processOperators(ActionEvent event) {
		String value=((JButton)event.getSource()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
			
		operator=value;
		number1=Double.parseDouble(resultLabel.getText());
		resultLabel.setText("");
		}
		else{
			if(operator.isEmpty())
				return;
			double number2=Double.parseDouble(resultLabel.getText());
			double output=model.calculate(number1, number2, operator);
			resultLabel.setText(String.valueOf(output));
			operator="";
			start=true;
		}
	}
	
	//-----------------------------------------------------
	/*public void startCalcul() {
		if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(resultLabel.getText()).doubleValue();
            resultLabel.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(resultLabel.getText()).doubleValue();
            resultLabel.setText(String.valueOf(chiffre1));
        }
        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(resultLabel.getText()).doubleValue();
                resultLabel.setText(String.valueOf(chiffre1));
            }
            catch(ArithmeticException e){
            	resultLabel.setText("Division part zéro");
            }
        }
        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(resultLabel.getText()).doubleValue();
            resultLabel.setText(String.valueOf(chiffre1));
        }
    }*/
	
	
	public void lancer() {
		this.setVisible(true);
	}

}
