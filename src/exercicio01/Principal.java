package exercicio01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		//JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Informaçoes do usuário");
		formulario.setLayout(null);	
		 	
		//JLabel  JTextField
		JLabel nome  = new JLabel("Informe seu nome:");
		nome.setBounds(10, 10, 110, 20);
		
		JTextField campo = new JTextField();
		campo.setBounds(130, 10, 150, 20);
		
		JLabel idade  = new JLabel("Informe sua idade:");
		idade.setBounds(10, 40, 110, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(130, 40, 150, 20);
		
		JLabel cidade  = new JLabel("Informe a sua cidade :");
		cidade.setBounds(10, 70, 180, 20);
		
		JTextField campo3 = new JTextField();
		campo3.setBounds(130, 70, 150, 20);
		
		
			  //JButton	 
		   JButton botao = new JButton("Confirmar");
	       botao.setBounds(50, 102, 200, 20);
	
	       	//Ação
	       
	       botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null, campo.getText()+",você tem "+campo2.getText()+ " anos de idade e mora em " +campo3.getText() );
				
			}
		});
		
	       
			//adicionar componentes
				
				formulario.add(nome);
				formulario.add(idade);
				formulario.add(cidade);
				formulario.add(campo);
				formulario.add(campo2);
				formulario.add(campo3);
				formulario.add(botao);
				
			      //Exibir o formulario
				formulario.setVisible(true);	
				
		
	}

}
