import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Button;
import java.awt.Font;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtValorVenda;
	private JTextField txtValorFinal;
	private JRadioButton rdbDinheiro;
	private JRadioButton rdbCartao;
	private JRadioButton rdbCheque;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private final ButtonGroup grpTipoPagamento = new ButtonGroup();
	private JRadioButton rdbPix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Pre\u00E7o Final");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Entre com o valor da venda ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(44, 33, 303, 40);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Pre\u00E7o final da compra ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(54, 220, 356, 43);
		contentPane.add(lblNewLabel_1);
		
		txtValorVenda = new JTextField();
		txtValorVenda.setBounds(454, 30, 344, 51);
		contentPane.add(txtValorVenda);
		txtValorVenda.setColumns(10);
		
		txtValorFinal = new JTextField();
		txtValorFinal.setColumns(10);
		txtValorFinal.setBounds(454, 218, 344, 51);
		contentPane.add(txtValorFinal);
		
		rdbDinheiro = new JRadioButton("Dinheiro");
		grpTipoPagamento.add(rdbDinheiro);
		rdbDinheiro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbDinheiro.setBounds(115, 157, 103, 21);
		contentPane.add(rdbDinheiro);
		
		rdbCartao = new JRadioButton("Cart\u00E3o");
		grpTipoPagamento.add(rdbCartao);
		rdbCartao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbCartao.setBounds(326, 157, 103, 21);
		contentPane.add(rdbCartao);
		
		rdbCheque = new JRadioButton("Cheque");
		grpTipoPagamento.add(rdbCheque);
		rdbCheque.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbCheque.setBounds(570, 157, 103, 21);
		contentPane.add(rdbCheque);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//converter string que vem do quadro para valor Double
				
				double valor = Double.parseDouble(txtValorVenda.getText());
				double resultado = 0; 
				
				if(rdbDinheiro.isSelected()) {
					resultado = valor * 0.95;
					
				}
				if(rdbCartao.isSelected()) {
					resultado = valor * 1.10;					
				}
				
				if(rdbCheque.isSelected()) {
					resultado = valor * 1.05;					
				}	
				
				if (rdbPix.isSelected()) {
					resultado = valor * 0.90;
				}
				
				DecimalFormat df = new DecimalFormat("#0.00");
				
				txtValorFinal.setText(df.format(resultado));
				
			}
		});
		btnCalcular.setBounds(322, 327, 112, 40);
		contentPane.add(btnCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtValorVenda.setText(null);
				txtValorFinal.setText(null);
				grpTipoPagamento.clearSelection();
				
			}
		});
		
		btnLimpar.setBounds(566, 327, 152, 40);
		contentPane.add(btnLimpar);
		
		rdbPix = new JRadioButton("Pix");
		grpTipoPagamento.add(rdbPix);
		rdbPix.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbPix.setBounds(735, 159, 103, 21);
		contentPane.add(rdbPix);
	}
}
