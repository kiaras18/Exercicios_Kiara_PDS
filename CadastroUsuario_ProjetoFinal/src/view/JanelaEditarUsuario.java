package view;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaEditarUsuario extends JDialog {

    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JButton btnSalvar;
    private JButton btnCancelar;
    private JCheckBox chkAtivo;
    private JLabel lblNewLabel;
    private JComboBox<String> cmbTipo;

    public JanelaEditarUsuario() {
    	
    	chkAtivo = new JCheckBox("Usuário Ativo");
    	add(chkAtivo);

        setTitle("Editar Usuário");
        setModal(true);
        setBounds(100,100,400,250);

        getContentPane().setLayout(new MigLayout("", "[][][grow]", "[][][][][][][]"));
                
                lblNewLabel = new JLabel("EDITAR USUÁRIO");
                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
                getContentPane().add(lblNewLabel, "cell 2 0");
        
                JLabel label = new JLabel("Nome:");
                getContentPane().add(label, "cell 1 1,alignx left");
        txtNome = new JTextField();
        getContentPane().add(txtNome, "cell 2 1,growx");
        
                JLabel label_1 = new JLabel("CPF:");
                getContentPane().add(label_1, "cell 1 2");
        txtCpf = new JTextField();
        getContentPane().add(txtCpf, "cell 2 2,growx");
        
                JLabel label_2 = new JLabel("Telefone:");
                getContentPane().add(label_2, "cell 1 3");
        txtTelefone = new JTextField();
        getContentPane().add(txtTelefone, "cell 2 3,growx");
        
        JLabel lblTipo = new JLabel("Tipo:");
        getContentPane().add(lblTipo, "cell 1 5");

        cmbTipo = new JComboBox<>();

        cmbTipo.addItem("Administrador");
        cmbTipo.addItem("Bolsista");
        cmbTipo.addItem("Coodernador");

        getContentPane().add(cmbTipo, "cell 2 5,growx");
        
                JLabel label_3 = new JLabel("Email:");
                getContentPane().add(label_3, "cell 1 4");
                        txtEmail = new JTextField();
                        getContentPane().add(txtEmail, "cell 2 4,growx");
                
                        btnSalvar = new JButton("Salvar");
                        btnSalvar.setForeground(new Color(255, 255, 255));
                        btnSalvar.setBackground(new Color(0, 128, 0));
                        getContentPane().add(btnSalvar, "cell 1 6");
        
                btnCancelar = new JButton("Cancelar");
                btnCancelar.setForeground(new Color(255, 255, 255));
                btnCancelar.setBackground(new Color(255, 0, 0));
                btnCancelar.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                	}
                });
                getContentPane().add(btnCancelar, "cell 2 6,alignx center");
    }
    public JCheckBox getChkAtivo() {
        return chkAtivo;
    }
    
    public JComboBox<String> getCmbTipo() {
        return cmbTipo;
    }
    
    

    public JTextField getTxtNome() { return txtNome; }
    public JTextField getTxtCpf() { return txtCpf; }
    public JTextField getTxtTelefone() { return txtTelefone; }
    public JTextField getTxtEmail() { return txtEmail; }

    public JButton getBtnSalvar() { return btnSalvar; }
    public JButton getBtnCancelar() { return btnCancelar; }
}