package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author alexander.tsimpliar
 *
 */
public class MiniGame extends JFrame {
	private Container contentPane;
	private JLabel text;
	private JLabel text0;
	private JLabel text1;
	private JLabel text2;
	private JLabel text3;
	private JLabel text4;
	private JLabel text5;
	private JLabel text6;
	private JLabel text7;
	private JLabel text8;
	private JLabel text9;
	private JLabel text10;
	private JLabel text11;
	private JLabel text12;
	private JLabel text13;
	private JLabel text14;
	private JLabel text15;
	private JLabel text16;
	private JLabel text17;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private JButton continueButton = new JButton("continue");
	private JButton optionOneButton = new JButton("option 1");
	private JButton optionTwoButton = new JButton("option 2");
	private JButton optionThreeButton = new JButton("option 3");

	/**
	 * Public minigame skapar själva skärmen som spelet ska utspela sig på.
	 * storlek på fönstret, inga flikknappar, synlig, hämtar funktioner som har
	 * skapats utanför public minigame, bakgrundsfärg.
	 */
	public MiniGame() {

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		this.setUndecorated(true);
		this.setVisible(true);
		contentPane = this.getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.black);
		addButtons(contentPane);
	}
	/**
	 * 
	 * @param contentPane
	 *            är en funktion med alla knappar som finns inuti spelet.
	 *            "Close" knappen som är lokaliserat uppe i det högra hörnet med
	 *            svart färg och vit text.
	 */
	public void addButtons(Container contentPane) {
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(toolkit.getScreenSize().width - 100, 0, 100, 50);
		closeButton.setBackground(new Color(0, 0, 0));
		closeButton.setForeground(Color.white);
		closeButton.addActionListener(event -> closeButtonPressed());
		contentPane.add(closeButton);
		/**
		 * här är alla texter som används i programmet. Har ingen mening förutom
		 * text0 som ändras på hela tiden.
		 */
		text0 = new JLabel("yo, welcome to my first game." + "This is from a skyrim book,"
				+ "not for publishing because I don't want to be copyright claimed."
				+ "The text will be explaining about what is happening in the game."
				+ "You will be able to give different commands like the commands in the gameboy games."
				+ "press continue to continue");
		text0.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text0.setForeground(Color.white);

		text1 = new JLabel("<html> <body> <p> Kolb was a brave nord warrior. "
				+ "One day his chief asked Kolb to slay an evil dragon that threatened their village. "
				+ "Go through the mountain pass, Kolb, his chief said. " + "You will find the dragon on the other side. "
				+ "<br> <br> press continue </p> </body> </html>");
		text1.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text1.setForeground(Color.white);

		text2 = new JLabel("<html> <body> <p> Kolb took his favorite axe" + "and shield and walked to the"
				+ "pass, where he found a cold" + "cave, a windy cave, and a narrow trail."
				+ "<br> Option 1: Enter the cold cave" + "<br> Option 2: Enter the windy cave"
				+ "<br> Option 3: Walk up the trail </p> </body> </html>");
		text2.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text2.setForeground(Color.white);

		text3 = new JLabel("<html> <body> <p> kolb stepped onto a rocky" + "hill. He could see the dragon"
				+ "sleeping bellow, and a tavern off a road nearby." + "<br> Option 1: Climb down"
				+ "<br> Option 2: Visit tavern" + "</p> </body> </html>");
		text3.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text3.setForeground(Color.white);

		text4 = new JLabel("<html> <body> <p> Following the stench, Kolb" + "found a filthy orc! The orc"
				+ "snarled and charged Kolb" + "with his spiked club." + "<br> Option 1: Raise shield"
				+ "<br> Option 2: Swing axe" + "</p> </body> </html>");
		text4.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text4.setForeground(Color.white);

		text5 = new JLabel("<html> <body> <p> Treading through the marsh," + "Kolb discovered a wailing"
				+ "ghost blocking his way." + "<br> Option 1: Attack ghost" + "<br> Option 2: Give gold"
				+ "</p> </body> </html>");
		text5.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text5.setForeground(Color.white);

		text6 = new JLabel("<html> <body> <p> The head of the axe lodged" + "itself in the tough, scaly neck"
				+ "of the beast. It wailed and" + "thrashed, but Kolb held on" + "and eventually sawed through"
				+ "the neck, killing the beast." + "Kolb returned home" + "victorious, and his village"
				+ "was never bothered by the" + "dragon again." + "<br> <br> The end </p> </body> </html>");
		text6.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text6.setForeground(Color.white);

		text7 = new JLabel("<html> <body> <p> Leaving the marsh behind" + "him, Kolb could see the"
				+ "Dragon's lair nearby, as well" + "as a small, wellcoming tavern." + "<br> Option 1: Go to lair"
				+ "<br> Option 2: Go to tavern" + "</p> </body> </html>");
		text7.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text7.setForeground(Color.white);

		text8 = new JLabel("<html> <body> <p> A strong gust of wind blew" + "Kolb's torch out, and knocked"
				+ "him into a pit where he splits his " + "head and died." + "<br> <br> The end </p> </body> </html>");
		text8.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text8.setForeground(Color.white);

		text9 = new JLabel("<html> <body> <p> The orc cackled as his club" + "splintered Kolb's shield and"
				+ "smashed into his face. There" + "Kolb died, and the orc had" + "soup from his bones."
				+ "<br> <br> The end </p> </body> </html>");
		text9.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text9.setForeground(Color.white);

		text10 = new JLabel("<html> <body> <p> Kolb remembered a story his" + "Gran told him and tossed two"
				+ "gold chits for the ghost, and" + "it faded away, allowing him" + "to pass."
				+ "<br> <br> Press continue </p> </body> </html>");
		text10.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text10.setForeground(Color.white);

		text11 = new JLabel("<html> <body> <p> Kolb crept towards the belly" + "of the beast, but no sooner"
				+ "had he taken his eyes off the" + "head of the beast than it" + "snapped him up and ate him"
				+ "whole, axe and all." + "<br> <br> The end </p> </body> </html>");
		text11.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text11.setForeground(Color.white);

		text12 = new JLabel("<html> <body> <p> Climbing up, Kolb found a" + "camp. He met a wise man"
				+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
				+ "through the hills, the other" + "through a marsh." + "<br> Option 1: Take the hills"
				+ "<br> Option 2: Take the marsh" + "</p> </body> </html>");
		text12.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text12.setForeground(Color.white);

		text13 = new JLabel("<html> <body> <p> Before the orc could strike," + "Kolb swung his mighty axe."
				+ "The orc's head and club fell" + "uselessly to the floor."
				+ "<br> <br> Press continue </p> </body> </html>");
		text13.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text13.setForeground(Color.white);

		text14 = new JLabel("<html> <body> <p> Kolb stopped at the tavern to" + "rest before fighting the"
				+ "Dragon. High elves ran the" + "tavern, however, and" + "poisoned the mead so they"
				+ "could steal his gold." + "<br> <br> The end </p> </body> </html>");
		text14.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text14.setForeground(Color.white);

		text15 = new JLabel("<html> <body> <p> Kolb swung his axe as hard" + "as he could, but the ghost"
				+ "hardly seemed to notice. The" + "ghost drifted into Kolb, and a" + "deep sleep took him over,"
				+ "From wich he never awoke." + "<br> <br> The end </p> </body> </html>");
		text15.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text15.setForeground(Color.white);

		text16 = new JLabel("<html> <body> <p> Kolb found the lair where the" + "dragon slept, tendrils of"
				+ "smoke waiting from it's" + "nostrils. The air made Kolb's" + "eyes sting, and he nearly"
				+ "slipped on the bones of men," + "picked clean. the beast lay" + "on its side, the throat and"
				+ "belly waiting targets." + "<br> Option 1: Strike the neck" + "<br> Option 2: Strike the belly"
				+ "</p> </body> </html>");
		text16.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text16.setForeground(Color.white);

		text17 = new JLabel("<html> <body> <p>Kolb stepped into the frozen cave, " + "but his nord blood kept him warm."
				+ "A smelly tunnel climbed ahead of him," + "and wind howled from another to the left."
				+ "A ladder was nearby as well." + "<br> Option 1: Take the smelly tunnel"
				+ "<br> Option 2: Take the windy tunnel" + "<br> Option 3: Climb the ladder </p> </body> </html>");
		text17.setBounds(50, 250, toolkit.getScreenSize().width - 50, 100);
		text17.setForeground(Color.white);
		/**
		 * Här är de resterande knapparna som avänds för att gå vidare i programmet.
		 */
		JButton startButton = new JButton("Start");

		startButton.setBounds(50, 50, 100, 50);
		startButton.setBackground(new Color(0, 0, 0));
		startButton.setForeground(Color.white);
		contentPane.add(startButton);
		startButton.addActionListener(event -> startButtonPressed());
		contentPane.repaint();

		continueButton.setBounds(150, 50, 100, 50);
		continueButton.setBackground(new Color(0, 0, 0));
		continueButton.setForeground(Color.white);
		continueButton.addActionListener(event -> continueButtonPressed());

		optionOneButton.setBounds(250, 50, 100, 50);
		optionOneButton.setBackground(new Color(0, 0, 0));
		optionOneButton.setForeground(Color.white);
		optionOneButton.addActionListener(event -> optionOneButtonPressed());

		optionTwoButton.setBounds(350, 50, 100, 50);
		optionTwoButton.setBackground(new Color(0, 0, 0));
		optionTwoButton.setForeground(Color.white);
		optionTwoButton.addActionListener(event -> optionTwoButtonPressed());

		optionThreeButton.setBounds(450, 50, 100, 50);
		optionThreeButton.setBackground(new Color(0, 0, 0));
		optionThreeButton.setForeground(Color.white);
		optionThreeButton.addActionListener(event -> optionThreeButtonPressed());

	}
	/**
	 * När knapparna trycks så har de olika funktioner som de gör vid vissa tillfällen.
	 */
	public void startButtonPressed() {

		contentPane.add(text0);
		text0.setText("<html> <body> <p> yo, welcome to my first game. " + "This is from a skyrim book, "
				+ "not for publishing because I don't want to be copyright claimed. "
				+ "The text will be explaining about what is happening in the game. "
				+ "You will be able to give different options to progress in the story."
				+ "<br> press continue to proceed </p> </body> </html>");
		contentPane.add(continueButton);
		contentPane.add(optionOneButton);
		contentPane.add(optionTwoButton);
		contentPane.add(optionThreeButton);
		contentPane.repaint();
	}

	public void continueButtonPressed() {
		if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> yo, welcome to my first game. " + "This is from a skyrim book, "
						+ "not for publishing because I don't want to be copyright claimed. "
						+ "The text will be explaining about what is happening in the game. "
						+ "You will be able to give different options to progress in the story."
						+ "<br> press continue to proceed </p> </body> </html>")) {

			text0.setText("<html> <body> <p> Kolb was a brave nord warrior. "
					+ "One day his chief asked Kolb to slay an evil dragon that threatened their village. "
					+ "Go through the mountain pass, Kolb, his chief said. "
					+ "You will find the dragon on the other side. Kolb took his favorite axe "
					+ "and shield and walked to the " + "pass, where he found a cold "
					+ "cave, a windy cave, and a narrow trail. " + "<br> Option 1: Enter the cold cave"
					+ "<br> Option 2: Enter the windy cave" + "<br> Option 3: Walk up the trail </p> </body> </html>");
		} else if (text0.getText()
				.equalsIgnoreCase("Kolb stepped into the frozen cave, " + "but his nord blood kept him warm."
						+ "A smelly tunnel climbed ahead of him," + "and wind howled from another to the left."
						+ "A ladder was nearby as well.")) {
			text0.setText("<html> <body> <p>Kolb stepped into the frozen cave, " + "but his nord blood kept him warm."
					+ "A smelly tunnel climbed ahead of him," + "and wind howled from another to the left."
					+ "A ladder was nearby as well." + "<br> Option 1: Take the smelly tunnel"
					+ "<br> Option 2: Take the windy tunnel" + "<br> Option 3: Climb the ladder </p> </body> </html>");
		} else if (text0.getText()
				.equalsIgnoreCase("Following the stench, Kolb" + "found a filthy orc! The orc"
				+ "snarled and charged Kolb" + "with his spiked club.")) {
			text0.setText("<html> <body> <p> Following the stench, Kolb" + "found a filthy orc! The orc"
					+ "snarled and charged Kolb" + "with his spiked club." + "<br> Option 1: Raise shield"
					+ "<br> Option 2: Swing axe" + "</p> </body> </html>");
		} else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Before the orc could strike," + "Kolb swung his mighty axe."
						+ "The orc's head and club fell" + "uselessly to the floor."
						+ "<br> <br> Press continue </p> </body> </html>")) {
			text0.setText("<html> <body> <p> kolb stepped onto a rocky" + "hill. He could see the dragon"
					+ "sleeping bellow, and a tavern off a road nearby." + "<br> Option 1: Climb down"
					+ "<br> Option 2: Visit tavern" + "</p> </body> </html>");
		} else if (text0.getText()
				.equalsIgnoreCase("Kolb found the lair where the" + "dragon slept, tendrils of"
						+ "smoke waiting from it's" + "nostrils. The air made Kolb's" + "eyes sting, and he nearly"
						+ "slipped on the bones of men," + "picked clean. the beast lay" + "on its side, the throat and"
						+ "belly waiting targets.")) {
			text0.setText("<html> <body> <p> Kolb found the lair where the" + "dragon slept, tendrils of"
					+ "smoke waiting from it's" + "nostrils. The air made Kolb's" + "eyes sting, and he nearly"
					+ "slipped on the bones of men," + "picked clean. the beast lay" + "on its side, the throat and"
					+ "belly waiting targets." + "<br> Option 1: Strike the neck" + "<br> Option 2: Strike the belly"
					+ "</p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("Climbing up, Kolb found a" + "camp. He met a wise man"
							+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
							+ "through the hills, the other" + "through a marsh.")) {
			text0.setText("<html> <body> <p> Climbing up, Kolb found a" + "camp. He met a wise man"
				+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
				+ "through the hills, the other" + "through a marsh." + "<br> Option 1: Take the hills"
				+ "<br> Option 2: Take the marsh" + "</p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("kolb stepped onto a rocky" + "hill. He could see the dragon"
				+ "sleeping bellow, and a tavern off a road nearby.")) {
			text0.setText("<html> <body> <p> kolb stepped onto a rocky" + "hill. He could see the dragon"
						+ "sleeping bellow, and a tavern off a road nearby." + "<br> Option 1: Climb down"
						+ "<br> Option 2: Visit tavern" + "</p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("Treading through the marsh," + "Kolb discovered a wailing"
				+ "ghost blocking his way.")) {
			text0.setText("<html> <body> <p> Treading through the marsh," + "Kolb discovered a wailing"
				+ "ghost blocking his way." + "<br> Option 1: Attack ghost" + "<br> Option 2: Give gold"
				+ "</p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Kolb remembered a story his" + "Gran told him and tossed two"
				+ "gold chits for the ghost, and" + "it faded away, allowing him" + "to pass."
				+ "<br> <br> Press continue </p> </body> </html>")) {
			text0.setText("<html> <body> <p> Leaving the marsh behind" + "him, Kolb could see the"
					+ "Dragon's lair nearby, as well" + "as a small, wellcoming tavern." + "<br> Option 1: Go to lair"
					+ "<br> Option 2: Go to tavern" + "</p> </body> </html>");
		}

	}

	public void optionOneButtonPressed() {

		if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Kolb was a brave nord warrior. "
				+ "One day his chief asked Kolb to slay an evil dragon that threatened their village. "
				+ "Go through the mountain pass, Kolb, his chief said. "
				+ "You will find the dragon on the other side. Kolb took his favorite axe "
				+ "and shield and walked to the " + "pass, where he found a cold "
				+ "cave, a windy cave, and a narrow trail. " + "<br> Option 1: Enter the cold cave"
				+ "<br> Option 2: Enter the windy cave" + "<br> Option 3: Walk up the trail </p> </body> </html>")) {
			text0.setText("Kolb stepped into the frozen cave, " + "but his nord blood kept him warm."
					+ "A smelly tunnel climbed ahead of him," + "and wind howled from another to the left."
					+ "A ladder was nearby as well.");
		} else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p>Kolb stepped into the frozen cave, "
						+ "but his nord blood kept him warm." + "A smelly tunnel climbed ahead of him,"
						+ "and wind howled from another to the left." + "A ladder was nearby as well."
						+ "<br> Option 1: Take the smelly tunnel" + "<br> Option 2: Take the windy tunnel"
						+ "<br> Option 3: Climb the ladder </p> </body> </html>")) {
			text0.setText("Following the stench, Kolb" + "found a filthy orc! The orc" + "snarled and charged Kolb"
					+ "with his spiked club.");
		} else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Following the stench, Kolb" + "found a filthy orc! The orc"
						+ "snarled and charged Kolb" + "with his spiked club." + "<br> Option 1: Raise shield"
						+ "<br> Option 2: Swing axe" + "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> The orc cackled as his club" + "splintered Kolb's shield and"
					+ "smashed into his face. There" + "Kolb died, and the orc had" + "soup from his bones."
					+ "<br> <br> The end </p> </body> </html>");
		} else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> kolb stepped onto a rocky" + "hill. He could see the dragon"
						+ "sleeping bellow, and a tavern off a road nearby." + "<br> Option 1: Climb down"
						+ "<br> Option 2: Visit tavern" + "</p> </body> </html>")) {
			text0.setText("Kolb found the lair where the" + "dragon slept, tendrils of" + "smoke waiting from it's"
					+ "nostrils. The air made Kolb's" + "eyes sting, and he nearly" + "slipped on the bones of men,"
					+ "picked clean. the beast lay" + "on its side, the throat and" + "belly waiting targets.");
		} else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Kolb found the lair where the" + "dragon slept, tendrils of"
						+ "smoke waiting from it's" + "nostrils. The air made Kolb's" + "eyes sting, and he nearly"
						+ "slipped on the bones of men," + "picked clean. the beast lay" + "on its side, the throat and"
						+ "belly waiting targets." + "<br> Option 1: Strike the neck"
						+ "<br> Option 2: Strike the belly" + "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> The head of the axe lodged" + "itself in the tough, scaly neck"
					+ "of the beast. It wailed and" + "thrashed, but Kolb held on" + "and eventually sawed through"
					+ "the neck, killing the beast." + "Kolb returned home" + "victorious, and his village"
					+ "was never bothered by the" + "dragon again." + "<br> <br> The end </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Climbing up, Kolb found a" + "camp. He met a wise man"
				+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
				+ "through the hills, the other" + "through a marsh." + "<br> Option 1: Take the hills"
				+ "<br> Option 2: Take the marsh" + "</p> </body> </html>")) {
			text0.setText("kolb stepped onto a rocky" + "hill. He could see the dragon"
				+ "sleeping bellow, and a tavern off a road nearby.");
		}	else if(text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Treading through the marsh," + "Kolb discovered a wailing"
				+ "ghost blocking his way." + "<br> Option 1: Attack ghost" + "<br> Option 2: Give gold"
				+ "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> Kolb swung his axe as hard" + "as he could, but the ghost"
				+ "hardly seemed to notice. The" + "ghost drifted into Kolb, and a" + "deep sleep took him over,"
				+ "From wich he never awoke." + "<br> <br> The end </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Leaving the marsh behind" + "him, Kolb could see the"
					+ "Dragon's lair nearby, as well" + "as a small, wellcoming tavern." + "<br> Option 1: Go to lair"
					+ "<br> Option 2: Go to tavern" + "</p> </body> </html>")) {
			text0.setText("Kolb found the lair where the" + "dragon slept, tendrils of"
					+ "smoke waiting from it's" + "nostrils. The air made Kolb's" + "eyes sting, and he nearly"
					+ "slipped on the bones of men," + "picked clean. the beast lay" + "on its side, the throat and"
					+ "belly waiting targets.");
		}

	}

	public void optionTwoButtonPressed() {

		if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Following the stench, Kolb" + "found a filthy orc! The orc"
						+ "snarled and charged Kolb" + "with his spiked club." + "<br> Option 1: Raise shield"
						+ "<br> Option 2: Swing axe" + "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> Before the orc could strike," + "Kolb swung his mighty axe."
					+ "The orc's head and club fell" + "uselessly to the floor."
					+ "<br> <br> Press continue </p> </body> </html>");
		} else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Kolb found the lair where the" + "dragon slept, tendrils of"
						+ "smoke waiting from it's" + "nostrils. The air made Kolb's" + "eyes sting, and he nearly"
						+ "slipped on the bones of men," + "picked clean. the beast lay" + "on its side, the throat and"
						+ "belly waiting targets." + "<br> Option 1: Strike the neck"
						+ "<br> Option 2: Strike the belly" + "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> Kolb crept towards the belly" + "of the beast, but no sooner"
					+ "had he taken his eyes off the" + "head of the beast than it" + "snapped him up and ate him"
					+ "whole, axe and all." + "<br> <br> The end </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> kolb stepped onto a rocky" + "hill. He could see the dragon"
						+ "sleeping bellow, and a tavern off a road nearby." + "<br> Option 1: Climb down"
						+ "<br> Option 2: Visit tavern" + "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> Kolb stopped at the tavern to" + "rest before fighting the"
				+ "Dragon. High elves ran the" + "tavern, however, and" + "poisoned the mead so they"
				+ "could steal his gold." + "<br> <br> The end </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p>Kolb stepped into the frozen cave, " + "but his nord blood kept him warm."
				+ "A smelly tunnel climbed ahead of him," + "and wind howled from another to the left."
				+ "A ladder was nearby as well." + "<br> Option 1: Take the smelly tunnel"
				+ "<br> Option 2: Take the windy tunnel" + "<br> Option 3: Climb the ladder </p> </body> </html>")) {
			text0.setText("<html> <body> <p> A strong gust of wind blew" + "Kolb's torch out, and knocked"
				+ "him into a pit where he splits his " + "head and died." + "<br> <br> The end </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Kolb was a brave nord warrior. "
						+ "One day his chief asked Kolb to slay an evil dragon that threatened their village. "
						+ "Go through the mountain pass, Kolb, his chief said. "
						+ "You will find the dragon on the other side. Kolb took his favorite axe "
						+ "and shield and walked to the " + "pass, where he found a cold "
						+ "cave, a windy cave, and a narrow trail. " + "<br> Option 1: Enter the cold cave"
						+ "<br> Option 2: Enter the windy cave" + "<br> Option 3: Walk up the trail </p> </body> </html>")) {
			text0.setText("<html> <body> <p> A strong gust of wind blew" + "Kolb's torch out, and knocked"
					+ "him into a pit where he splits his " + "head and died." + "<br> <br> The end </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Climbing up, Kolb found a" + "camp. He met a wise man"
				+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
				+ "through the hills, the other" + "through a marsh." + "<br> Option 1: Take the hills"
				+ "<br> Option 2: Take the marsh" + "</p> </body> </html>")) {
			text0.setText("Treading through the marsh," + "Kolb discovered a wailing"
				+ "ghost blocking his way.");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Treading through the marsh," + "Kolb discovered a wailing"
				+ "ghost blocking his way." + "<br> Option 1: Attack ghost" + "<br> Option 2: Give gold"
				+ "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> Kolb remembered a story his" + "Gran told him and tossed two"
				+ "gold chits for the ghost, and" + "it faded away, allowing him" + "to pass."
				+ "<br> <br> Press continue </p> </body> </html>");
		}	else if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Leaving the marsh behind" + "him, Kolb could see the"
					+ "Dragon's lair nearby, as well" + "as a small, wellcoming tavern." + "<br> Option 1: Go to lair"
					+ "<br> Option 2: Go to tavern" + "</p> </body> </html>")) {
			text0.setText("<html> <body> <p> Kolb stopped at the tavern to" + "rest before fighting the"
				+ "Dragon. High elves ran the" + "tavern, however, and" + "poisoned the mead so they"
				+ "could steal his gold." + "<br> <br> The end </p> </body> </html>");
		}

	}

	public void optionThreeButtonPressed() {
		
		if (text0.getText()
				.equalsIgnoreCase("<html> <body> <p> Kolb was a brave nord warrior. "
				+ "One day his chief asked Kolb to slay an evil dragon that threatened their village. "
				+ "Go through the mountain pass, Kolb, his chief said. "
				+ "You will find the dragon on the other side. Kolb took his favorite axe "
				+ "and shield and walked to the " + "pass, where he found a cold "
				+ "cave, a windy cave, and a narrow trail. " + "<br> Option 1: Enter the cold cave"
				+ "<br> Option 2: Enter the windy cave" + "<br> Option 3: Walk up the trail </p> </body> </html>")) {
					text0.setText("Climbing up, Kolb found a" + "camp. He met a wise man"
							+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
							+ "through the hills, the other" + "through a marsh.");
				}	else if (text0.getText()
						.equalsIgnoreCase("<html> <body> <p>Kolb stepped into the frozen cave, "
						+ "but his nord blood kept him warm." + "A smelly tunnel climbed ahead of him,"
						+ "and wind howled from another to the left." + "A ladder was nearby as well."
						+ "<br> Option 1: Take the smelly tunnel" + "<br> Option 2: Take the windy tunnel"
						+ "<br> Option 3: Climb the ladder </p> </body> </html>")) {
					text0.setText("Climbing up, Kolb found a" + "camp. He met a wise man"
				+ "who shared bread and" + "showed two paths to the" + "Dragon's lair. One went"
				+ "through the hills, the other" + "through a marsh.");
				}

	}
	/**
	 * Funktion till close knappen så att programmet stängs av.
	 */
	public void closeButtonPressed() {
		System.exit(0);
	}
	/**
	 * 
	 * @param args Denna funktion gör så att hela programmet startas.
	 */
	public static void main(String[] args) {

		MiniGame frame = new MiniGame();

	}

}