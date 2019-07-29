package multiplicationTableMatrix;
import javax.swing.*;

public class PanganibanACM_MultiplicationTableMatrix {
	public static void main(String[] args) {
	while (true) {
		while(true) {
	int x=0,y=0;
	try {
	x = Integer.parseInt(JOptionPane.showInputDialog("Enter value of x: "));
	y = Integer.parseInt(JOptionPane.showInputDialog("Enter value of y: "));
	}catch (NumberFormatException e) {
		int result = JOptionPane.showConfirmDialog(null,"Invalid Input! Do you want to try again?", null, JOptionPane.YES_NO_OPTION);
		if (result==JOptionPane.NO_OPTION) {
			System.exit(0);
		}
		break;
	}
	Table t = new Table();
	t.plot(x,y);
	int result = JOptionPane.showConfirmDialog(null,"Do you want to try again?", null, JOptionPane.YES_NO_OPTION);
	if (result==JOptionPane.NO_OPTION) {
		System.exit(0);
	}
	}
	}
	}
}
