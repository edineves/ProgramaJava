package br.edu.unicid.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.border.BevelBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel txtCodLeitor;
	private JLabel txtNomeLeitor;
	private JLabel cmbTipoLeitor;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox comboBox;
	private TextArea txtListar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodLeitor = new JLabel("C\u00F3digo do Letor");
		txtCodLeitor.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCodLeitor.setBounds(41, 10, 119, 40);
		contentPane.add(txtCodLeitor);
		
		txtNomeLeitor = new JLabel("Nome do Leitor");
		txtNomeLeitor.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNomeLeitor.setBounds(41, 70, 119, 49);
		contentPane.add(txtNomeLeitor);
		
		cmbTipoLeitor = new JLabel("Tipo de Leitor");
		cmbTipoLeitor.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmbTipoLeitor.setBounds(41, 140, 119, 49);
		contentPane.add(cmbTipoLeitor);
		
		btnNewButton_4 = new JButton("Excluir");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(561, 239, 99, 31);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Listar");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_5.setBounds(670, 237, 113, 35);
		contentPane.add(btnNewButton_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(180, 17, 603, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 81, 603, 40);
		contentPane.add(textField_1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Op\u00E7\u00E3o", "Aluno", "Professor", "Administrativo\t"}));
		comboBox.setBounds(170, 142, 613, 47);
		contentPane.add(comboBox);
		
		txtListar = new TextArea();
		txtListar.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtListar.setBounds(47, 293, 729, 73);
		contentPane.add(txtListar);
		
		btnNewButton = new JButton("Alterrar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(442, 239, 109, 31);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Consultar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(289, 239, 133, 31);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Salvar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(170, 239, 109, 31);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Novo");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(47, 239, 113, 31);
		contentPane.add(btnNewButton_3);
		
		JLabel lblMensagem = new JLabel(".");
		lblMensagem.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblMensagem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMensagem.setBounds(47, 388, 736, 31);
		contentPane.add(lblMensagem);
	}
}
