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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela01 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNome;
	private JLabel lblGenero;
	private JLabel lblEndereo;
	private JLabel lblEstadoCivl;
	private JTextField TxtEndereco;
	private JTextField TxNome;
	private JComboBox cmbEstadoCivil;
	private JComboBox cmbGenero;
	private JButton btnlimpar;
	private JButton btnMostrar;
	private TextArea txtAreaMostrar;

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

		TxtEndereco = new JTextField();
		TxtEndereco.setColumns(10);
		TxtEndereco.setBounds(156, 46, 250, 24);
		contentPane.add(TxtEndereco);

		TxNome = new JTextField();
		TxNome.setColumns(10);
		TxNome.setBounds(156, 12, 250, 22);
		contentPane.add(TxNome);

		cmbEstadoCivil = new JComboBox();
		cmbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] { "selecionar", "casado ", "solteiro" }));
		cmbEstadoCivil.setBounds(156, 112, 250, 22);
		contentPane.add(cmbEstadoCivil);

		cmbGenero = new JComboBox();
		cmbGenero.setModel(new DefaultComboBoxModel(new String[] { "selecionar", "masculino", "feminino" }));
		cmbGenero.setBounds(156, 77, 250, 22);
		contentPane.add(cmbGenero);

		btnlimpar = new JButton("mostrar ");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnlimpar.setBounds(24, 172, 152, 24);
		contentPane.add(btnlimpar);

		btnMostrar = new JButton("limpar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnMostrar.setBounds(247, 172, 177, 22);
		contentPane.add(btnMostrar);

		txtAreaMostrar = new TextArea();
		txtAreaMostrar.setBounds(51, 204, 386, 101);
		contentPane.add(txtAreaMostrar);
	}
}
