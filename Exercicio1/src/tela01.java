import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.TextArea;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class tela01 extends JFrame {

	private JPanel Sorveteria;
	private JButton btnCalcular;
	private JButton btnNewButton_1;
	private JLabel Qtdade;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private TextArea txtQtd1;
	private TextArea txtPreco1;
	private TextArea txtQtd2;
	private TextArea txtPreco2;
	private TextArea txtQtd3;
	private TextArea txtPreco3;
	private TextArea txtQtd4;
	private TextArea txtPreco4;
	private TextArea txtTotal;
	private JLabel Qtde;
	private JLabel PrecoUnidade;
	private JLabel Qtdade_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela01 frame = new tela01();
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
	public tela01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 492);
		Sorveteria = new JPanel();
		Sorveteria.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Sorveteria);
		Sorveteria.setLayout(null);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int Qtd1 = Integer.parseInt(txtQtd1.getText());
				int Qtd2 = Integer.parseInt(txtQtd2.getText());
				int Qtd3 = Integer.parseInt(txtQtd3.getText());
				int Qtd4 = Integer.parseInt(txtQtd4.getText());	
				
				double	Preco1 = Double.parseDouble(txtPreco1.getText());
				double	Preco2 = Double.parseDouble(txtPreco2.getText());
				double	Preco3 = Double.parseDouble(txtPreco3.getText());
				double	Preco4 = Double.parseDouble(txtPreco4.getText());
				
				double resultado = (Qtd1 * Preco1) +
						(Qtd2 * Preco2)+
						(Qtd3 * Preco3)+
						(Qtd4 * Preco4);
				
				txtTotal.setText(String.valueOf (resultado));
										
			}
		});
		btnCalcular.setBounds(192, 353, 222, 50);
		Sorveteria.add(btnCalcular);
		
		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQtd1.setText(null);
				txtQtd2.setText(null);
				txtQtd3.setText(null);
				txtQtd4.setText(null);
				txtPreco1.setText(null);
				txtPreco2.setText(null);
				txtPreco3.setText(null);
				txtPreco4.setText(null);
				txtTotal.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(464, 353, 243, 50);
		Sorveteria.add(btnNewButton_1);
		
		Qtdade = new JLabel("Tipo de Sorvete");
		Qtdade.setBounds(20, 6, 180, 50);
		Sorveteria.add(Qtdade);
		
		lblNewLabel_1 = new JLabel("Chocolate / Frutas");
		lblNewLabel_1.setBounds(20, 113, 166, 50);
		Sorveteria.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Bola");
		lblNewLabel_2.setBounds(24, 173, 166, 50);
		Sorveteria.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Pote de 2 litros");
		lblNewLabel_3.setBounds(24, 233, 166, 50);
		Sorveteria.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("pre\u00E7o unitario ");
		lblNewLabel_5.setBounds(493, 25, 160, 31);
		Sorveteria.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Total");
		lblNewLabel_6.setBounds(221, 293, 166, 50);
		Sorveteria.add(lblNewLabel_6);
		
		txtQtd1 = new TextArea();
		txtQtd1.setBounds(192, 62, 216, 39);
		Sorveteria.add(txtQtd1);
		
		txtPreco1 = new TextArea();
		txtPreco1.setBounds(471, 64, 216, 39);
		Sorveteria.add(txtPreco1);
		
		txtQtd2 = new TextArea();
		txtQtd2.setBounds(198, 124, 216, 39);
		Sorveteria.add(txtQtd2);
		
		txtPreco2 = new TextArea();
		txtPreco2.setBounds(471, 113, 216, 39);
		Sorveteria.add(txtPreco2);
		
		txtQtd3 = new TextArea();
		txtQtd3.setBounds(196, 173, 216, 39);
		Sorveteria.add(txtQtd3);
		
		txtPreco3 = new TextArea();
		txtPreco3.setBounds(471, 173, 216, 39);
		Sorveteria.add(txtPreco3);
		
		txtQtd4 = new TextArea();
		txtQtd4.setBounds(196, 233, 216, 39);
		Sorveteria.add(txtQtd4);
		
		txtPreco4 = new TextArea();
		txtPreco4.setBounds(471, 233, 216, 39);
		Sorveteria.add(txtPreco4);
		
		txtTotal = new TextArea();
		txtTotal.setBounds(471, 293, 222, 39);
		Sorveteria.add(txtTotal);
		
		Qtde = new JLabel("Qtdade");
		Qtde.setBounds(210, 6, 177, 50);
		Sorveteria.add(Qtde);
		
		PrecoUnidade = new JLabel("New label");
		PrecoUnidade.setBounds(170, 94, 11, 6);
		Sorveteria.add(PrecoUnidade);
		
		Qtdade_1 = new JLabel("Sorvete de Fruta");
		Qtdade_1.setBounds(20, 66, 180, 50);
		Sorveteria.add(Qtdade_1);
	}
}
