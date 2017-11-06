package com.andres.calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

/**
 * Created by A.Zapotochnyy on 15.02.2017.
 */

public class Calculator extends JFrame {

	private static final long serialVersionUID = -7543891456923229391L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	String b = "";
	char c;// '+','-'or...
	char c2;// '%' or '#'
	Double numb;
	Double rez;
	Double rez2; // for '%'
	boolean flag = true;// for +-, <-
	boolean flag2 = true;// for '='
	boolean flag3 = true;// for '.'

	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0 };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 1.0 };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 2.0;
		gbc_lblNewLabel.weightx = 10.0;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.ipady = 1;
		gbc_lblNewLabel_1.ipadx = 1;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 8.0;
		gbc_panel.weightx = 10.0;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		// NUMBERS
		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "1");
			}
		});
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 0;
		gbc_button_10.gridy = 3;
		panel.add(button_10, gbc_button_10);

		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "2");
			}
		});
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 1;
		gbc_button_11.gridy = 3;
		panel.add(button_11, gbc_button_11);

		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "3");
			}
		});
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 2;
		gbc_button_12.gridy = 3;
		panel.add(button_12, gbc_button_12);

		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "4");
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 2;
		panel.add(button_6, gbc_button_6);

		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "5");
			}
		});
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 1;
		gbc_button_7.gridy = 2;
		panel.add(button_7, gbc_button_7);

		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "6");
			}
		});
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 2;
		gbc_button_8.gridy = 2;
		panel.add(button_8, gbc_button_8);

		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "7");
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 1;
		panel.add(button_1, gbc_button_1);

		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "8");
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 1;
		panel.add(button_2, gbc_button_2);

		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "9");
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 1;
		panel.add(button_3, gbc_button_3);

		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flag = false;
				lblNewLabel.setText(lblNewLabel.getText() + "0");
			}
		});
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 0, 5);
		gbc_button_15.gridwidth = 2;
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.gridx = 0;
		gbc_button_15.gridy = 4;
		panel.add(button_15, gbc_button_15);

		// Arithmetic operations
		// "+" operation
		JButton button_17 = new JButton("+");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == false) {
					Double b = 0.0;
					try {
						b = Double.parseDouble(lblNewLabel.getText());
					} catch (NumberFormatException eh) {
						b = Double.parseDouble(lblNewLabel_1.getText());
					}
					c = '+';
					numb = b;
					lblNewLabel.setText("");
					if (rez != null) {
						lblNewLabel_1.setText("" + rez);
					}
				}
				flag = true;
				flag2 = true;
				flag3 = true;
			}
		});
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.fill = GridBagConstraints.BOTH;
		gbc_button_17.insets = new Insets(0, 0, 0, 5);
		gbc_button_17.gridx = 3;
		gbc_button_17.gridy = 4;
		panel.add(button_17, gbc_button_17);

		// "-" operation
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == false) {
					Double b = 0.0;
					try {
						b = Double.parseDouble(lblNewLabel.getText());
					} catch (NumberFormatException eh) {

						b = Double.parseDouble(lblNewLabel_1.getText());
					}
					c = '-';
					numb = b;
					lblNewLabel.setText("");
					if (rez != null) {
						lblNewLabel_1.setText("" + rez);
					}
				}
				flag = true;
				flag2 = true;
				flag3 = true;
			}
		});

		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 3;
		gbc_button_13.gridy = 3;
		panel.add(button_13, gbc_button_13);

		// "/" operation
		JButton button_4 = new JButton("/");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == false) {
					Double b = 0.0;
					try {
						b = Double.parseDouble(lblNewLabel.getText());
					} catch (NumberFormatException eh) {
						b = Double.parseDouble(lblNewLabel_1.getText());
					}
					c = '/';
					numb = b;
					lblNewLabel.setText("");
					if (rez != null) {
						lblNewLabel_1.setText("" + rez);
					}
				}
				flag = true;
				flag2 = true;
				flag3 = true;
			}
		});

		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 3;
		gbc_button_4.gridy = 1;
		panel.add(button_4, gbc_button_4);

		// for "*" operation
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flag == false) {
					Double b = 0.0;
					try {
						b = Double.parseDouble(lblNewLabel.getText());
					} catch (NumberFormatException eh) {
						b = Double.parseDouble(lblNewLabel_1.getText());
					}
					c = '*';
					numb = b;
					lblNewLabel.setText("");
					if (rez != null) {
						lblNewLabel_1.setText("" + rez);
					}
				}
				flag = true;
				flag2 = true;
				flag3 = true;
			}
		});

		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 3;
		gbc_button_9.gridy = 2;
		panel.add(button_9, gbc_button_9);

		// "%" operation
		JButton button_5 = new JButton("%");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == false) {
					Double b = 0.0;
					try {
						b = Double.parseDouble(lblNewLabel.getText());
					} catch (NumberFormatException eh) {
						try {
							b = Double.parseDouble(lblNewLabel_1.getText());
						} catch (NumberFormatException eh2) {
						}
					}
					rez2 = b / 100;
					c2 = '%';
					lblNewLabel.setText("");
					lblNewLabel_1.setText("" + rez2);
					flag2 = true;
					flag3 = true;
				}
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.gridheight = 2;
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 0);
		gbc_button_5.gridx = 4;
		gbc_button_5.gridy = 1;
		panel.add(button_5, gbc_button_5);

		// "Sqrt" operation
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flag == false) {
					Double b = 0.0;
					try {
						b = Math.sqrt(Double.parseDouble(lblNewLabel.getText()));
					} catch (NumberFormatException eh) {
						try {
							b = Math.sqrt(Double.parseDouble(lblNewLabel_1.getText()));
						} catch (NumberFormatException eh2) {
						}
					}
					BigDecimal bigdez = new BigDecimal(b);
					rez = Double.parseDouble("" + bigdez.setScale(4, BigDecimal.ROUND_CEILING));
					lblNewLabel.setText("");
					if (rez != null) {
						lblNewLabel_1.setText("" + rez);
					}
					flag = true;
					flag3 = true;
				}
			}
		});

		GridBagConstraints gbc_btnSqrt = new GridBagConstraints();
		gbc_btnSqrt.fill = GridBagConstraints.BOTH;
		gbc_btnSqrt.insets = new Insets(0, 0, 5, 0);
		gbc_btnSqrt.gridx = 4;
		gbc_btnSqrt.gridy = 0;
		panel.add(btnSqrt, gbc_btnSqrt);

		// ", " operation
		JButton button_16 = new JButton(",");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (flag == false & flag3 == true) {
					lblNewLabel.setText(lblNewLabel.getText() + ".");
					flag = true;
					flag3 = false;
				}
			}
		});

		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 0, 5);
		gbc_button_16.gridx = 2;
		gbc_button_16.gridy = 4;
		panel.add(button_16, gbc_button_16);

		// "+ - " operation
		JButton button = new JButton("+ -");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == false) {
					Double a = Double.parseDouble(lblNewLabel.getText());
					a = -a;
					lblNewLabel.setText("" + a);
				}
				flag2 = true;
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);

		// CORRECTION
		// "<-" operation
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag == false) {

					String b = lblNewLabel.getText();
					String a = "";
					if (b.length() != 0) {
						a = b.substring(0, b.length() - 1);
					}
					lblNewLabel.setText(a);
					flag2 = true;
				}
			}
		});

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);

		// Clear part
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("");
				flag = true;
				flag2 = true;
				flag3 = true;
			}
		});
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.fill = GridBagConstraints.BOTH;
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 1;
		gbc_btnCe.gridy = 0;
		panel.add(btnCe, gbc_btnCe);

		// Clear all
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("");
				lblNewLabel_1.setText("");
				rez = 0.0;
				flag = true;
				flag2 = true;
				flag3 = true;
			}
		});

		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);

		// Result
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag2 == true & flag == false) {
					switch (c) {
					case '+':
						if (c2 == '%') {
							rez = numb + (numb * rez2);
							c2 = '#';
							break;
						} else {
							Double s = Double.parseDouble(lblNewLabel.getText());
							rez = numb + s;
						}
						break;
					case '-':
						if (c2 == '%') {
							rez = numb - (numb * rez2);
							c2 = '#';
							break;
						} else {
							Double s1 = Double.parseDouble(lblNewLabel.getText());
							rez = numb - s1;
						}
						break;
					case '/':
						if (c2 == '%') {
							rez = numb / rez2;
							c2 = '#';
							break;
						} else {
							Double s2 = Double.parseDouble(lblNewLabel.getText());
							rez = numb / s2;
						}
						break;
					case '*':
						if (c2 == '%') {
							rez = numb * rez2;
							c2 = '#';
							break;
						} else {
							Double s3 = Double.parseDouble(lblNewLabel.getText());
							rez = numb * s3;
						}
						break;
					default:
						Double s4 = Double.parseDouble(lblNewLabel.getText());
						rez = s4;
						break;
					}
				}

				BigDecimal rezob = new BigDecimal(rez);
				rez = Double.parseDouble("" + rezob.setScale(4, BigDecimal.ROUND_CEILING));
				lblNewLabel.setText("" + rez);
				lblNewLabel_1.setText("" + rez);
				flag2 = false;
				flag3 = true;
			}
		});

		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.gridheight = 2;
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.gridx = 4;
		gbc_button_14.gridy = 3;
		panel.add(button_14, gbc_button_14);
	}
}
