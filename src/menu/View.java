package menu;

import javax.swing.JOptionPane;

import controller.RecursividadeController;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecursividadeController recursividade = new RecursividadeController();
		
		int x = 0;
		int y =0;
		
		
		while (x<=0 || y <=0) {
			try {
				x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Insira numeros inteiros");
			}
			
			if (x <= 0 || y <=0) {
				JOptionPane.showMessageDialog(null, "Insira numeros positivos");
			}
		}

		JOptionPane.showMessageDialog(null, recursividade.maximoMultiploComum(x, y));
				
	}

}
