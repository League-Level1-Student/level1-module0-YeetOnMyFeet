package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class soundeffects implements ActionListener {
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
void run(){
frame.add(panel);
frame.setVisible(true);
button1.setText("Doh");
button2.setText("Boom");
button1.addActionListener(this);
button2.addActionListener(this);
panel.add(button1);
panel.add(button2);
frame.pack();
frame.setTitle("Sound Effects");




}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
    

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource()==button1) {
		playSound("60903_nicstage_bottlerocket2.wav");
	}
	else {
		playSound("517058_invisible-inks_scifi-sniper-rifle.wav");
	}
}
}
