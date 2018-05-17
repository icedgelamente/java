package EX02_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Principal {

	public static void main(String[] args) {
		
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 130);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
		formulario.setLayout(null);			
		
				//JLabel
				JLabel rotulo = new JLabel();
				rotulo.setText("Informe seu nome");
				rotulo.setBounds(10, 10, 110, 20);

				
				
				
		
	}

}
