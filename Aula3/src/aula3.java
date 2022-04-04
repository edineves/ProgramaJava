import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import java.awt.Font;

public class aula3 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private TextField txtQtd1;
	private TextField textPreco1;
	private TextField txtQtd2;
	private TextField textPreco2;
	private TextField txtQtd3;
	private TextField textPreco3;
	private TextField txtQtd4;
	private TextField textPreco4;
	private TextField txtTotal;
	private Button button;
	private Button button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aula3 frame = new aula3();
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
	public aula3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 929, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Frutas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(71, 89, 115, 39);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Chocolate");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(71, 138, 115, 39);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Chocolate / Frutas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(71, 187, 115, 39);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Bola");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(71, 236, 115, 39);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(184, 292, 115, 39);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Tipo de Sorvete");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(81, 28, 184, 51);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Qtdade");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(367, 28, 115, 39);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Preco");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(598, 28, 115, 39);
		contentPane.add(lblNewLabel_7);
		
		txtQtd1 = new TextField();
		txtQtd1.setBounds(283, 89, 200, 35);
		contentPane.add(txtQtd1);
		
		textPreco1 = new TextField();
		textPreco1.setBounds(513, 89, 200, 35);
		contentPane.add(textPreco1);
		
		txtQtd2 = new TextField();
		txtQtd2.setBounds(283, 138, 200, 35);
		contentPane.add(txtQtd2);
		
		textPreco2 = new TextField();
		textPreco2.setBounds(513, 138, 200, 35);
		contentPane.add(textPreco2);
		
		txtQtd3 = new TextField();
		txtQtd3.setBounds(283, 187, 200, 35);
		contentPane.add(txtQtd3);
		
		textPreco3 = new TextField();
		textPreco3.setBounds(513, 187, 200, 35);
		contentPane.add(textPreco3);
		
		txtQtd4 = new TextField();
		txtQtd4.setBounds(283, 236, 200, 35);
		contentPane.add(txtQtd4);
		
		textPreco4 = new TextField();
		textPreco4.setBounds(513, 236, 200, 35);
		contentPane.add(textPreco4);
		
		txtTotal = new TextField();
		txtTotal.setBounds(394, 292, 231, 39);
		contentPane.add(txtTotal);
		
		button = new Button("Calcular");
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Qtd1 = Integer.parseInt(txtQtd1.getText());
				int Qtd2 = Integer.parseInt(txtQtd2.getText());
				int Qtd3 = Integer.parseInt(txtQtd3.getText());
				int Qtd4 = Integer.parseInt(txtQtd4.getText());	
				
				double	Preco1 = Double.parseDouble(textPreco1.getText());
				double	Preco2 = Double.parseDouble(textPreco2.getText());
				double	Preco3 = Double.parseDouble(textPreco3.getText());
				double	Preco4 = Double.parseDouble(textPreco4.getText());
				
				double resultado = (Qtd1 * Preco1) +
						(Qtd2 * Preco2)+
						(Qtd3 * Preco3)+
						(Qtd4 * Preco4);
				
				txtTotal.setText(String.valueOf (resultado));				
				
			}
		});
		button.setBounds(283, 345, 162, 29);
		contentPane.add(button);
		
		button_1 = new Button("Limpar");
		button_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQtd1.setText(null);
				txtQtd2.setText(null);
				txtQtd3.setText(null);
				txtQtd4.setText(null);
				textPreco1.setText(null);
				textPreco2.setText(null);
				textPreco3.setText(null);
				textPreco4.setText(null);
				txtTotal.setText(null);
				
			}
		});
		button_1.setBounds(541, 345, 155, 29);
		contentPane.add(button_1);
	}
}
