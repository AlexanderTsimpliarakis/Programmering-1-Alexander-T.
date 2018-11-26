package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame extends JFrame {
	private JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public MiniGame() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// F�rsta talet �r width och andra �r height
		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		// Denna tagg g�r s� att sj�lva f�nstret blir tomt
		this.setUndecorated(true);
		this.setVisible(true);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.black);
		addButtons(contentPane);
	}

	public void addButtons(Container contentPane) {
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		// f�rsta �r r�d, andra �r gr�n och sista �r bl�
		closeButton.setBackground(new Color(0, 0, 0));
		closeButton.setForeground(Color.white);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);

		text = new JLabel("yo");
		text.setBounds(50, 250, toolkit.getScreenSize().width - 50, 50);
		text.setForeground(Color.white);
		contentPane.add(text);

		JButton changeTextButton = new JButton("Start");
		{
			changeTextButton.setBounds(50, 50, 100, 50);
			// f�rsta �r r�d, andra �r gr�n och sista �r bl�
			changeTextButton.setBackground(new Color(0, 0, 0));
			changeTextButton.setForeground(Color.white);
			changeTextButton.addActionListener(event -> changeTextButtonPressed());
			contentPane.add(changeTextButton);

		}
	}

	public void changeTextButtonPressed() {
		// String currenText = text.getText();
		if (text.getText().equalsIgnoreCase("yo"))
			text.setText(
					"Welcome to my first game. This is a pokemon rip-off game not for publishing because I don't want to be copyright claimed.");
		else
			text.getText().equalsIgnoreCase("yo");
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public static void main(String[] args) {

		MiniGame frame = new MiniGame();
		// frame.addButtons(contentPane);
	}

}