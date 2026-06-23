package exercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class ClaculadoraInvestimentosGrid5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDeposito;
	private JTextField textNumMeses;
	private JTextField textJuros;
	
	public class Investimento
	{
	 private int meses;
	 private double juros;
	 private double deposito_mensal;
	 public Investimento(int a, double j, double dm) {
	 meses = a;
	 juros = j/100;
	 deposito_mensal = dm;
	 }
	 public double calculaTotal() {
	 int num_pagamentos = meses;
	 double total = 0;
	 for (int i = 0; i < num_pagamentos; i++) {
	 total = total + deposito_mensal;
	 total = total + total * juros;
	 }
	 return total;
	 }
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosGrid5 frame = new ClaculadoraInvestimentosGrid5();
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
	public ClaculadoraInvestimentosGrid5() {
		setTitle("CalcInvest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 205);
		setBounds(100, 100, 363, 196);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mnAjuda.add(mntmSobre);
		

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		JLabel lblDeposito = new JLabel("Depósito Mensal R$ :");
		contentPane.add(lblDeposito);
		lblDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(panel);
		
		textNumMeses = new JTextField();
		panel.add(textNumMeses);
		textNumMeses.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de Meses :");
		lblNumMeses.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNumMeses);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		

		
		textDeposito = new JTextField();
		panel_1.add(textDeposito);
		textDeposito.setColumns(10);
		
		JLabel lblJuros = new JLabel("Juros ao mês % :");
		lblJuros.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblJuros);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textJuros = new JTextField();
		panel_2.add(textJuros);
		textJuros.setColumns(10);
		
		JLabel lblTotalInvestido = new JLabel("Total Investido   Juros R$ :");
		lblTotalInvestido.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblTotalInvestido);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		
		JLabel lblNewLabelTotal = new JLabel("");
		contentPane.add(lblNewLabelTotal);
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);

		
		
		

JButton btnNewButton = new JButton("Calcular");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		int pag = Integer.parseInt(textNumMeses.getText());
		double juro = Double.parseDouble(textJuros.getText());
		double dep = Double.parseDouble(textDeposito.getText());
		
		Investimento invest = new Investimento(pag, juro, dep);
	
		lblJuros.setText(String.format("%.2f", invest.calculaTotal()) );
	}
});
contentPane.add(btnNewButton);

}

}
