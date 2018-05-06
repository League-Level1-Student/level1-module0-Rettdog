import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		button.setText("Fortune");
		frame.add(button);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		switch (rand) {
		case 0:
			JOptionPane.showMessageDialog(null, "You will win the lottery during your lifetime.");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "You will click the x");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You are feeling sleepy");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "How are you");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Your future is grim");
			break;

		}
	}
}
