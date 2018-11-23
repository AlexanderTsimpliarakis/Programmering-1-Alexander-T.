package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	private JLabel text;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();

	public Main() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Första talet är width och andra är height
		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		// Denna tagg gör så att själva fönstret blir tomt
		this.setUndecorated(true);
		this.setVisible(true);
		Container contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.orange);
		addButtons(contentPane);
	}

	public void addButtons(Container contentPane) {
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		// första är röd, andra är grön och sista är blå
		closeButton.setBackground(new Color(255, 255, 255));
		closeButton.setForeground(Color.red);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);

		text = new JLabel("Goddagens");
		text.setBounds(50, 250, 100, 50);
		text.setForeground(Color.DARK_GRAY);
		contentPane.add(text);

		// Det blev något fel här

		JButton changeTextButton = new JButton("Change text on label");
		{
			changeTextButton.setBounds(50, 50, 100, 50);
			// första är röd, andra är grön och sista är blå
			changeTextButton.setBackground(new Color(255, 255, 255));
			changeTextButton.setForeground(Color.red);
			changeTextButton.addActionListener(event -> changeTextButtonPressed());
			contentPane.add(changeTextButton);

		}
	}

	public void changeTextButtonPressed() {
		String currenText = text.getText();
		if (text.getText().equalsIgnoreCase("Goddagens"))
			text.setText("Adjö");
		else
			text.setText("Goddagens");
	}

	public void closeButtonPressed() {
		System.exit(0);
	}

	public static void main(String[] args) {

		Main frame = new Main();
		// frame.addButtons(contentPane);
	}

}
