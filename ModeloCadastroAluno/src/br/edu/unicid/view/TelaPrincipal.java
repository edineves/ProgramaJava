package br.edu.unicid.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.TextArea;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnAjuda;
	private JMenuItem mntmSalvar;
	private JMenuItem mntmAlterar;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmExcluir;
	private JMenuItem mntmSair;
	private JMenuItem mntmSalvarNotas;
	private JMenuItem mntmAlterarNotas;
	private JMenuItem mntmExcluirNotas;
	private JMenuItem mntmConsultarNotas;
	private JMenuItem mntmNewMenuItem_9;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textRgm;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textEndereco;
	private JTextField textMunicipio;
	private JComboBox comboBoxUF;
	private JSeparator separator;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JComboBox comboBoxCurso;
	private JComboBox comboBoxCampus;
	private JRadioButton rdbtnManha;
	private JRadioButton rdbtnTarde;
	private JRadioButton rdbtnNoite;
	private JTabbedPane tabbedPane_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabelNome;
	private JLabel lblNewLabelCurso;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JComboBox comboBoxDisciplina;
	private JComboBox comboBoxSemestre;
	private JComboBox comboBoxNota;
	private JTabbedPane tabbedPane_2;
	private JPanel panel_3;
	private JTextField textRGM;
	private JLabel lblNewLabelBoletim;
	private JTextField textFaltas;
	private JFormattedTextField textDataNascimento;
	private JFormattedTextField textCPF;
	private JFormattedTextField textCelular;
	private JButton btnLogo;
	private final ButtonGroup buttonGroupPeriodo = new ButtonGroup();
	private JLabel lblerror;

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
	public TelaPrincipal() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1057, 38);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("Aluno");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnNewMenu);
		
		mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmSalvar);
		
		mntmAlterar = new JMenuItem("Alterar");
		mntmAlterar.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu.add(mntmAlterar);
		
		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu.add(mntmConsultar);
		
		mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu.add(mntmExcluir);
		
		mntmSair = new JMenuItem("Sair");
		mntmSair.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			JOptionPane.showMessageDialog(null, "Saindo do Sistema");
			System.exit(0);			
			}
		});
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		mntmSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmSair);
		
		mnNewMenu_1 = new JMenu("Notas e Faltas ");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnNewMenu_1);
		
		mntmSalvarNotas = new JMenuItem("Salvar");
		mnNewMenu_1.add(mntmSalvarNotas);
		
		mntmAlterarNotas = new JMenuItem("Alterar");
		mnNewMenu_1.add(mntmAlterarNotas);
		
		mntmExcluirNotas = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmExcluirNotas);
		
		mntmConsultarNotas = new JMenuItem("Consular");
		mnNewMenu_1.add(mntmConsultarNotas);
		
		mnAjuda = new JMenu("Ajuda");
		mnAjuda.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		menuBar.add(mnAjuda);
		
		mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===
				JOptionPane.showMessageDialog(null,"Informações do Menu");	
			}
		});
		mnAjuda.add(mntmNewMenuItem_9);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 49, 844, 574);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textNome.setBounds(411, 73, 403, 30);
		panel.add(textNome);
		textNome.setColumns(10);
		
		lblNewLabel = new JLabel("RGM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 73, 92, 30);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Data de Nascimento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(7, 147, 133, 30);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(7, 206, 133, 30);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("End.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 282, 133, 30);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Municipio");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(7, 347, 126, 37);
		panel.add(lblNewLabel_4);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEmail.setBounds(115, 207, 699, 30);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(354, 73, 133, 30);
		panel.add(lblNewLabel_6);
		
		textRgm = new JTextField();
		textRgm.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textRgm.setBounds(115, 75, 215, 28);
		panel.add(textRgm);
		textRgm.setColumns(10);
		
		lblNewLabel_8 = new JLabel("CELULAR ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(470, 350, 76, 30);
		panel.add(lblNewLabel_8);
		
		lblNewLabel_5 = new JLabel("UF");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(337, 352, 33, 30);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("CPF");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(354, 147, 104, 30);
		panel.add(lblNewLabel_7);
		
		textEndereco = new JTextField();
		textEndereco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEndereco.setBounds(118, 282, 699, 30);
		panel.add(textEndereco);
		textEndereco.setColumns(10);
		
		comboBoxUF = new JComboBox();
		comboBoxUF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxUF.setBounds(380, 352, 58, 30);
		panel.add(comboBoxUF);
		comboBoxUF.setModel(new DefaultComboBoxModel(new String[] {".", "Sao Paulo", "Rio de Janeiro", "Parana", "Ceara", "Bahia", "Rio Grande do Sul"}));
		
		textMunicipio = new JTextField();
		textMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textMunicipio.setBounds(115, 353, 192, 31);
		panel.add(textMunicipio);
		textMunicipio.setColumns(10);
		
		textDataNascimento = new JFormattedTextField(new MaskFormatter(" ## / ## /#### "));
		textDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textDataNascimento.setBounds(171, 147, 159, 30);
		panel.add(textDataNascimento);
		
		textCPF = new JFormattedTextField(new MaskFormatter(" ### . ### . ### - ## "));
		textCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textCPF.setBounds(411, 147, 403, 30);
		panel.add(textCPF);
		
		textCelular = new JFormattedTextField(new MaskFormatter ("( ## ). ######### "));
		textCelular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textCelular.setBounds(534, 347, 280, 37);
		panel.add(textCelular);
		
		btnLogo = new JButton("");
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogo.setIcon(new ImageIcon("C:\\Users\\Edison\\Downloads\\java.png"));
		btnLogo.setBounds(10, 434, 133, 101);
		panel.add(btnLogo);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblNewLabel_9 = new JLabel("Curso");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(23, 60, 155, 31);
		panel_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Campus");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(23, 164, 155, 31);
		panel_1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Periodo");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(21, 260, 155, 31);
		panel_1.add(lblNewLabel_11);
		
		comboBoxCurso = new JComboBox();
		comboBoxCurso.setModel(new DefaultComboBoxModel(new String[] {"Analise e Desenvolvimento de Sistemas", "Administra\u00E7\u00E3o", "Economia"}));
		comboBoxCurso.setBounds(188, 66, 553, 31);
		panel_1.add(comboBoxCurso);
		
		comboBoxCampus = new JComboBox();
		comboBoxCampus.setModel(new DefaultComboBoxModel(new String[] {"Tatuape", "Sumare", "Sao Miguel Paulista"}));
		comboBoxCampus.setBounds(188, 170, 553, 31);
		panel_1.add(comboBoxCampus);
		
		rdbtnManha = new JRadioButton("Manh\u00E3 ");
		buttonGroupPeriodo.add(rdbtnManha);
		rdbtnManha.setBounds(220, 267, 109, 23);
		panel_1.add(rdbtnManha);
		
		rdbtnTarde = new JRadioButton("Tarde");
		buttonGroupPeriodo.add(rdbtnTarde);
		rdbtnTarde.setBounds(422, 267, 109, 23);
		panel_1.add(rdbtnTarde);
		
		rdbtnNoite = new JRadioButton("Noite");
		buttonGroupPeriodo.add(rdbtnNoite);
		rdbtnNoite.setBounds(606, 267, 109, 23);
		panel_1.add(rdbtnNoite);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Notas e Faltas ", null, tabbedPane_1, null);
		
		panel_2 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblNewLabel_12 = new JLabel("RGM");
		lblNewLabel_12.setBounds(34, 30, 54, 37);
		panel_2.add(lblNewLabel_12);
		
		lblNewLabelNome = new JLabel(".nome");
		lblNewLabelNome.setBounds(304, 27, 453, 37);
		panel_2.add(lblNewLabelNome);
		
		lblNewLabelCurso = new JLabel(".curso");
		lblNewLabelCurso.setBounds(34, 107, 723, 37);
		panel_2.add(lblNewLabelCurso);
		
		lblNewLabel_15 = new JLabel("Disciplina");
		lblNewLabel_15.setBounds(34, 200, 133, 30);
		panel_2.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Semestre");
		lblNewLabel_16.setBounds(34, 286, 133, 34);
		panel_2.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Notas");
		lblNewLabel_17.setBounds(339, 286, 87, 34);
		panel_2.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("Faltas");
		lblNewLabel_18.setBounds(590, 286, 74, 34);
		panel_2.add(lblNewLabel_18);
		
		comboBoxDisciplina = new JComboBox();
		comboBoxDisciplina.setModel(new DefaultComboBoxModel(new String[] {"Banco de Dados", "Engenharia de Software", "Tecnicas de Programacao"}));
		comboBoxDisciplina.setBounds(243, 193, 514, 37);
		panel_2.add(comboBoxDisciplina);
		
		comboBoxSemestre = new JComboBox();
		comboBoxSemestre.setModel(new DefaultComboBoxModel(new String[] {"2022 -1", "2022-2"}));
		comboBoxSemestre.setBounds(183, 284, 113, 38);
		panel_2.add(comboBoxSemestre);
		
		comboBoxNota = new JComboBox();
		comboBoxNota.setModel(new DefaultComboBoxModel(new String[] {"0", "0,5", "1", "1,5", "2", "2.5", "3", "3.5", "4"}));
		comboBoxNota.setBounds(449, 284, 113, 38);
		panel_2.add(comboBoxNota);
		
		textRGM = new JTextField();
		textRGM.setColumns(10);
		textRGM.setBounds(111, 30, 113, 34);
		panel_2.add(textRGM);
		
		textFaltas = new JTextField();
		textFaltas.setColumns(10);
		textFaltas.setBounds(642, 286, 113, 34);
		panel_2.add(textFaltas);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Boletim ", null, tabbedPane_2, null);
		
		panel_3 = new JPanel();
		tabbedPane_2.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblNewLabelBoletim = new JLabel("..Boletim ");
		lblNewLabelBoletim.setBounds(10, 11, 781, 463);
		panel_3.add(lblNewLabelBoletim);
		
		lblerror = new JLabel("New label");
		lblerror.setBounds(204, 458, 506, 60);
		panel_3.add(lblerror);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
