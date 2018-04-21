/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String imageURL = "https://img.buzzfeed.com/buzzfeed-static/static/2015-11/23/11/enhanced/webdr02/enhanced-buzz-25668-1448296037-6.jpg?downsize=715:*&output-format=auto&output-quality=auto";
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image = createImage(imageURL);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
if(Integer.parseInt(JOptionPane.showInputDialog("How many eyes does the animal have?"))==2) {
	JOptionPane.showMessageDialog(null, "correct!");
	
}else {
	JOptionPane.showMessageDialog(null, "incorrect");
	
}
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
String image2url = "https://rlv.zcache.com/rainbow_laser_cat_poster-rb846f7b157bd4fd287d8cb83b6a04688_wv0_8byvr_540.jpg";
Component image2 = createImage(image2url);
// 11. add the second image to the quiz window
quizWindow.add(image2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
if(JOptionPane.showInputDialog("How rich is this cat?").equalsIgnoreCase("Super rich!")) {
	JOptionPane.showMessageDialog(null, "correct!");
	
	}else {
		JOptionPane.showMessageDialog(null, "incorrect");
		
	}	

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





