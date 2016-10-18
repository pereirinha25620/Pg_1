import javax.swing.JOptionPane;

	public class Nascimento{
		
	public static void main(String[]args){
		
		String dia = JOptionPane.showInputDialog("Insira a sua data de nascimento");
		
		System.out.println(dia);
		
		String mes = JOptionPane.showInputDialog("Insira o seu mes de nascimento");

	    System.out.println(mes);

	    String ano = JOptionPane.showInputDialog("Insira o seu ano de nascimento");

		System.out.println(ano);
		
		String resultado = dia + mes + ano;

		System.out.println("A soma do seu dia, mês e ano de aniversário é = " + resultado);
		
	}
}