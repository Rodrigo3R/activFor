package senai;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		
		int quantity = 0;
		
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter with a quantity:"));
		
		String ois = "";
		
		if(quantity > 0) {
			for (int i = 0; i < quantity;i++) {
				ois += "Hy ";
				JOptionPane.showMessageDialog(null, ois);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Negative number not can be:");
		}
		
		int qtd = 0;
		
		qtd = Integer.parseInt(JOptionPane.showInputDialog("Enter with a quantity:"));
		
		if( qtd > 0) {
			for (int i = 1; i <= qtd; i ++) {
				if(i % 2 == 0 ) {
					JOptionPane.showMessageDialog(null, i + " Is an even number");
				}
				else {
					JOptionPane.showMessageDialog(null, i + " Is an odd number");
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Number negative can be.");
		}
	}

}
