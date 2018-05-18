package exercicio04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//JL & JTextfield
		
		JFrame formulario = new JFrame("Caixa");
		formulario.setSize(350, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel nome = new JLabel("Informe o nome do produto: ");
		nome.setBounds(10, 10, 180, 20);
		JTextField campoNome = new JTextField();
		campoNome.setBounds(180, 10, 100, 20);
		
		
		JLabel valor = new JLabel("Informe o valor do produto: ");
		valor.setBounds(10, 40, 180, 20);
		JTextField campoValor = new JTextField();
		campoValor.setBounds(180, 40, 100, 20);
		
		
		
		JLabel pagamento = new JLabel("Informe o método de pagamento: ");
		pagamento.setBounds(10, 75, 200, 20);
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(210, 70, 100, 30);
		combo.addItem("À vista");
		combo.addItem("Cartão" );
		
		
		//JButton
		JButton botao = new JButton("Confirmar");
		botao.setBounds(50, 110, 150, 30);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(campoValor.getText());
				
				if((valor > 500) && (combo.getSelectedItem().equals("À vista"))){
					JOptionPane.showMessageDialog(null, "o produto " +campoNome.getText()+" custará R$ "+valor*0.90);
				}else{ 
					JOptionPane.showMessageDialog(null, "o produto " +campoNome.getText()+" custará R$ "+valor);
				}	
					
					
			}
				
			
		});
				
		formulario.add(nome);
		formulario.add(campoNome);
		formulario.add(valor);
		formulario.add(campoValor);
		formulario.add(combo);
		formulario.add(pagamento);
		formulario.add(botao);
		
		
		formulario.setVisible(true);
		
		
		
	}

}
