import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela01 frame = new Janela01();
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
	public Janela01() {
		setForeground(new Color(255, 182, 193));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSite = new JLabel("Olá mundo!");
		lblSite.setBounds(21, 11, 385, 77);
		lblSite.setForeground(new Color(0, 0, 139));
		lblSite.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 65));
		
		JLabel label = new JLabel("");
		label.setBounds(206, 99, 0, 0);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(213, 99, 0, 0);
		
		JLabel lblNOME = new JLabel("Nome:");
		lblNOME.setBounds(21, 125, 46, 35);
		lblNOME.setFont(new Font("Scheherazade", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("fechar");
		btnNewButton.setBounds(122, 246, 77, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		
		txtNome = new JTextField();
		txtNome.setBounds(77, 132, 329, 20);
		txtNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(21, 158, 36, 35);
		lblCPF.setFont(new Font("Scheherazade", Font.BOLD, 20));
		
		textField_1 = new JTextField();
		textField_1.setBounds(75, 163, 331, 20);
		textField_1.setColumns(10);
		
		JLabel lblEMAIL = new JLabel("Email:");
		lblEMAIL.setBounds(21, 189, 47, 35);
		lblEMAIL.setFont(new Font("Scheherazade", Font.BOLD, 20));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(lblNOME);
		contentPane.add(txtNome);
		contentPane.add(lblEMAIL);
		contentPane.add(lblCPF);
		contentPane.add(textField_1);
		contentPane.add(lblSite);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(77, 196, 329, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				JOptionPane.showMessageDialog(null, "Nome: "+nome);
				
				
			}
		});
		btnNewButton_1.setBounds(213, 246, 89, 23);
		contentPane.add(btnNewButton_1);

	}
}
