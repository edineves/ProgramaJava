import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.TextArea;

public class Tela01 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNome;
	private JLabel lblGenero;
	private JLabel lblEndereo;
	private JLabel lblEstadoCivl;
	private JTextField textField;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnMostrar;
	private JButton btnLimpar;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
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
	public Tela01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 376);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 84, 24);
		contentPane.add(lblNome);

		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(10, 76, 84, 24);
		contentPane.add(lblGenero);

		lblEndereo = new JLabel("Endereço ");
		lblEndereo.setBounds(10, 46, 84, 24);
		contentPane.add(lblEndereo);

		lblEstadoCivl = new JLabel("Estado Civíl");
		lblEstadoCivl.setBounds(10, 111, 78, 24);
		contentPane.add(lblEstadoCivl);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(156, 46, 250, 24);
		contentPane.add(textField);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 12, 250, 22);
		contentPane.add(textField_2);

		comboBox = new JComboBox();
		comboBox.setBounds(156, 112, 250, 22);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(156, 77, 250, 22);
		contentPane.add(comboBox_1);

		btnMostrar = new JButton("mostrar ");
		btnMostrar.setBounds(24, 172, 152, 24);
		contentPane.add(btnMostrar);

		btnLimpar = new JButton("limpar");
		btnLimpar.setBounds(247, 172, 177, 22);
		contentPane.add(btnLimpar);

		textArea = new TextArea();
		textArea.setBounds(49, 202, 386, 101);
		contentPane.add(textArea);
	}
}
