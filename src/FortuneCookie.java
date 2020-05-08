import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	        public void showButton() {
	            System.out.println("Button clicked");
	            
	            JFrame frame = new JFrame();
	            frame.setVisible(true);
	            JButton button = new JButton();
	            frame.add(button);
	            button.setText("Button");
	            frame.pack();
	            button.addActionListener(this);
	         
	            
	            
	            
	            
	            
	       }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
	            int rand = new Random().nextInt(5);
	            if (rand == 0) {
					JOptionPane.showMessageDialog(null, "Don't let anyone tell you that you can daydream on a monday");
				}
	            if (rand == 1) {
					JOptionPane.showMessageDialog(null, "Nobody got anywhere standing still");
				}	  
	            if (rand == 2) {
					JOptionPane.showMessageDialog(null, "Get lost in the right direction");
				}
	            if (rand == 3) {
					JOptionPane.showMessageDialog(null, "Fear will always be a thing but don't let it get in your way");
				}
	            if (rand == 4) {
					JOptionPane.showMessageDialog(null, "Change comes from embracing the future not fighting the past");
				}
				
				
			}
	    }

