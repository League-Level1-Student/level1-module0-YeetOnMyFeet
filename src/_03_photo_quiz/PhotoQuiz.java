package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
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

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String photo = "https://cdn.vox-cdn.com/thumbor/SduOgNnRFMh_xr4CqNddMxw0W70=/0x0:6720x4480/1200x800/filters:focal(2794x1466:3868x2540)/cdn.vox-cdn.com/uploads/chorus_image/image/66740911/1206292069.jpg.0.jpg";
		// 2. create a variable of type "Component" that will hold your image
		// 3. use the "createImage()" method below to initialize your Component
Component image = createImage(photo);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String elon = JOptionPane.showInputDialog("Who is this?");
		// 7. print "CORRECT" if the user gave the right answer
if (elon.equals("elon musk")) {
	JOptionPane.showMessageDialog(null, "CORRECT!");
}
else {
	JOptionPane.showMessageDialog(null, "WRONG! ITS ELON MUSK!");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
String pic = "data:image/jpeg;base64,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";
		Component picture = createImage(pic);
// 11. add the second image to the quiz window
quizWindow.add(picture);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String ans = JOptionPane.showInputDialog("Who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if (ans.equals("tim cook")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong it's Tim Cook!");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
