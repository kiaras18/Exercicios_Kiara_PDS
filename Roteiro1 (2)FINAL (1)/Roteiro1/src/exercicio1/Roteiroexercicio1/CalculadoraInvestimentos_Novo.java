package Roteiroexercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CalculadoraInvestimentos_Novo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDeposito;
	private JLabel lblNewLabel_2;
	private JTextField textNumMeses;
	private JTextField textJurosMes;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos_Novo frame = new CalculadoraInvestimentos_Novo();
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
	public CalculadoraInvestimentos_Novo() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeposito = new JLabel("Depósito Mensal R$:");
		lblDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeposito.setBounds(63, 11, 119, 14);
		contentPane.add(lblDeposito);
		
		textDeposito = new JTextField();
		textDeposito.setBounds(10, 30, 214, 20);
		contentPane.add(textDeposito);
		textDeposito.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Num. De Meses:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(69, 53, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Juros ao mês %:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(63, 101, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Total Investido + Juros R$");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(38, 150, 158, 14);
		contentPane.add(lblNewLabel_2);
		
		textNumMeses = new JTextField();
		textNumMeses.setColumns(10);
		textNumMeses.setBounds(10, 73, 214, 20);
		contentPane.add(textNumMeses);
		
		textJurosMes = new JTextField();
		textJurosMes.setColumns(10);
		textJurosMes.setBounds(10, 119, 214, 20);
		contentPane.add(textJurosMes);
		
		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.setBounds(76, 175, 89, 23);
		contentPane.add(btnCalculo);

	}
}
