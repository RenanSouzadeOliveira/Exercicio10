package exercicio10;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Interface extends JFrame{
	
	JLabel lblcalor = new JLabel("Calor");
	JLabel lblmassa = new JLabel("Massa");
	JLabel lblvariacao = new JLabel("Temperatura");
	JLabel lblvariacaop = new JLabel("Variação");
	JLabel lblq = new JLabel("Quantidade de Calor");
	JTextField txtcalor = new JTextField();
	JTextField txtmassa = new JTextField();
	JTextField txtvariacao = new JTextField();
	JTextField txtvariacaop = new JTextField();
	JTextField txtq = new JTextField();
	
	

	JButton btnCalculo = new JButton("Calcular");
	
		double calor, massa, variacao, variacaop;
	public Interface(){
		Calculo calc = new Calculo();
		
		Container paine = this.getContentPane();
		
		paine.add(lblcalor); // label
		lblcalor.setBounds(20,20,245,40);
		
		paine.add(txtcalor);// caixa
		txtcalor.setBounds(150,30,140,20);
		
		paine.add(lblmassa);// label
		lblmassa.setBounds(20,100,245,40);
		
		paine.add(txtmassa);// caixa
		txtmassa.setBounds(150,110,140,20);
		
		paine.add(lblvariacao);// label
		lblvariacao.setBounds(20,140,245,40);
		
		paine.add(txtvariacao);// caixa
		txtvariacao.setBounds(150,150,140,20);
		
		paine.add(lblvariacaop);// label
		lblvariacaop.setBounds(20,220,245,40);
		
		paine.add(txtvariacaop);// caixa
		txtvariacaop.setBounds(150,230,140,20);
		
		paine.add(lblq);// label
		lblq.setBounds(20,300,245,40);
		
		paine.add(txtq);// caixa
		txtq.setBounds(150,310,140,20);

		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 calor = Double.parseDouble(txtcalor.getText());
				 massa = Double.parseDouble(txtmassa.getText());
				 variacao = Double.parseDouble(txtvariacao.getText());
				 variacaop = Double.parseDouble(txtvariacaop.getText());
				 txtq.setText("" + calc.velocidade(calor, massa, variacao, variacaop));
				 
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtq.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
