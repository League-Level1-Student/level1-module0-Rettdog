import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public static void main(String[] args) {
		SoundEffectsMachine mech = new SoundEffectsMachine();
		mech.start();
	}
	
	public void start() {
		
		
		frame.add(panel);
		button1.setText("rain");
		button1.addActionListener(this);
		panel.add(button1);
		button2.setText("fire");
		button2.addActionListener(this);
		panel.add(button2);
		button3.setText("ice");
		button3.addActionListener(this);
		panel.add(button3);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("hi");
		System.out.println(e.getSource());
		if(e.getSource()==button1) {
			playSound("rain.wav");
			System.out.println("hi");
		}else if(e.getSource().equals(button2)) {
			playSound("fire.wav");
		}else if(e.getSource().equals(button3)) {
			playSound("ice.wav");
		}
		
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
