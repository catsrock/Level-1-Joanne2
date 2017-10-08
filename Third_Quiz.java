import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Third_Quiz implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel riddle = new JLabel();
	static JButton submit = new JButton();
	static JButton hint = new JButton();
	static JTextField ans1 = new JTextField(20);

	public static void main(String[] args) {
		new Third_Quiz().createUI();
	}

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		riddle.setText("What do you call a boomerang that doesn't work?");
		panel.add(riddle);
		submit.setText("Submit");
		submit.addActionListener(this);
		panel.add(submit);
		hint.addActionListener(this);
		hint.setText("Hint");
		panel.add(hint);
		panel.add(ans1);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == (submit)) {
			System.out.println("Thing");
			if (ans1.getText().equals("a stick")) {
				System.out.println("Yayyy you are correct");
			} else {
				System.out.println(">:( You are wrong");
			}
		} else if (e.getSource() == (hint)) {
			System.out.println("It's really easy. What are you left with if you take the broom out of 'broomstick'?");
		}

		// TODO Auto-generated method stub

	}

}
