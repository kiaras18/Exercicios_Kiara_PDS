package Exercicio_JCombobox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Academia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JComboBox cbFreqSemanal;
	private JComboBox cbDuracao;
	private JComboBox cbTipoPlano;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Academia frame = new Academia();
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
	public Academia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente - Academia TREINO FIT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel, "cell 1 0,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx right");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 1 1,growx");
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone: ");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx right");
		
		txtTelefone = new JTextField();
		contentPane.add(txtTelefone, "cell 1 2,growx");
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de plano: ");
		contentPane.add(lblNewLabel_3, "cell 0 3,alignx trailing");
		
		cbTipoPlano = new JComboBox(TipoPlano.values());
		contentPane.add(cbTipoPlano, "cell 1 3,growx");
		
		JLabel lblNewLabel_4 = new JLabel("Duração:");
		contentPane.add(lblNewLabel_4, "cell 0 4,alignx trailing");
		
		cbDuracao = new JComboBox(Duracao.values());
		contentPane.add(cbDuracao, "cell 1 4,growx");
		
		JLabel lblNewLabel_5 = new JLabel("Frequencia semanal: ");
		contentPane.add(lblNewLabel_5, "cell 0 5,alignx trailing");
		
		cbFreqSemanal = new JComboBox(Frequencia.values());
		contentPane.add(cbFreqSemanal, "cell 1 5,growx");
		
		JLabel lblResultado = new JLabel(" ");
		contentPane.add(lblResultado, "cell 1 6");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		contentPane.add(btnCalcular, "flowx,cell 1 7,alignx center");
		
		JLabel lblNewLabel_6 = new JLabel("Valor final: ");
		contentPane.add(lblNewLabel_6, "cell 1 7,alignx center");
		
		lblResult = new JLabel(" ");
		contentPane.add(lblResult, "cell 1 7");
		
		
		
		
	}
	private void calcular() {
		  // Validação dos campos
	    if (txtNome.getText().trim().isEmpty()
	            || txtTelefone.getText().trim().isEmpty()) {

	        JOptionPane.showMessageDialog(
	                this,
	                "Preencha todos os campos!"
	        );
	        return;
	    }

	   
	    TipoPlano planoSel =
	            (TipoPlano) cbTipoPlano.getSelectedItem();

	    Duracao duracaoSel =
	            (Duracao) cbDuracao.getSelectedItem();

	    Frequencia freqSemanalSel =
	            (Frequencia) cbFreqSemanal.getSelectedItem();

	  
	    double preco = 0;

	    switch (planoSel) {

	        case BASICO:
	            preco = 80;
	            break;

	        case INTERMEDIARIO:
	            preco = 120;
	            break;

	        case PREMIUM:
	            preco = 180;
	            break;
	    }

	   
	    switch (freqSemanalSel) {

	        case TRES_VEZES:
	            preco += preco * 0.20;
	            break;

	        case CINCO_VEZES:
	            preco += preco * 0.50;
	            break;

	        default:
	            break;
	    }

	    
	    switch (duracaoSel) {

	        case SEMESTRAL:
	            preco -= preco * 0.10;
	            break;

	        case ANUAL:
	            preco -= preco * 0.20;
	            break;

	        default:
	            break;
	    }

	    
	    lblResult.setText(
	            String.format("R$ %.2f", preco)
	    );
	}
}
// Kiara Annelise da Silva Souza - I5
