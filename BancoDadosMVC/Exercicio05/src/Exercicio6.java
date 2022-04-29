import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.ScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.List;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DropMode;
import java.awt.TextField;
import javax.swing.JSeparator;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import java.awt.Font;

public class Exercicio6 extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuBar menuBar_1;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnCirculo;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel;
	private JLabel lblFormaEscolhida;
	private ScrollPane scrollPane_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JList list;
	private JSeparator separator;
	private JList list_1;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio6 frame = new Exercicio6();
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
	public Exercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 459);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Arquivo");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Editar");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Dersmarcar cor");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		separator = new JSeparator();
		mnNewMenu_1.add(separator);
		
		mntmNewMenuItem_3 = new JMenuItem("Desmarcar Forma");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("Quadrado ");
		rdbtnNewRadioButton.setBounds(40, 154, 158, 42);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnCirculo = new JRadioButton("Circulo");
		rdbtnCirculo.setBounds(40, 202, 158, 42);
		contentPane.add(rdbtnCirculo);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Triangulo");
		rdbtnNewRadioButton_2.setBounds(40, 251, 158, 42);
		contentPane.add(rdbtnNewRadioButton_2);
		
		lblNewLabel = new JLabel("cor escolhida >>>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(369, 68, 146, 58);
		contentPane.add(lblNewLabel);
		
		lblFormaEscolhida = new JLabel("Forma escolhida >>>");
		lblFormaEscolhida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFormaEscolhida.setBounds(351, 186, 207, 67);
		contentPane.add(lblFormaEscolhida);
		
		scrollPane_1 = new ScrollPane();
		scrollPane_1.setBounds(577, 186, 263, 75);
		contentPane.add(scrollPane_1);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(131, 329, 207, 46);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(369, 329, 207, 46);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(609, 329, 207, 46);
		contentPane.add(btnNewButton_2);
		
		list = new JList();
		list.setBounds(280, 33, 1, 1);
		contentPane.add(list);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(40, 33, 112, 96);
		contentPane.add(scrollPane_2);
		
		list_1 = new JList();
		scrollPane_2.setViewportView(list_1);
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Amarelo", "Azul", "Vermelho", "Verde", "Rosa"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		lblNewLabel_1 = new JLabel("teste");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(577, 78, 277, 42);
		contentPane.add(lblNewLabel_1);
	}
}
