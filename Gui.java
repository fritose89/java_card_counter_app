import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Gui{

	private JLabel runningCount;
	private JLabel trueCount;
	private Card card;

	public static void main(String [] args){
		Gui gui = new Gui();
		gui.createGui();
	}
	
	public void createGui(){

		JFrame frame = new JFrame();
		frame.setTitle("Blackjack Counting Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);


		//Creating an Icon object and setting the icon
		ImageIcon icon = new ImageIcon("Blackjack Counter Icon.png");
		frame.setIconImage(icon.getImage());

		//Originally set to 420, 300
		frame.setLayout(null);
			

		card = new Card();


		//JPanel and Label to show the Running Count
		JPanel rCountPanel = new JPanel();
		rCountPanel.setBounds(50, 30, 100, 15);
		rCountPanel.setLayout(new BorderLayout());

		JLabel rCountText = new JLabel();
		rCountText.setText("Running Count");
		rCountText.setVerticalAlignment(JLabel.TOP);
		rCountText.setHorizontalAlignment(JLabel.CENTER);
		
		runningCount = new JLabel();
		runningCount.setText(card.getRunningCount());
		runningCount.setVerticalAlignment(JLabel.CENTER);
		runningCount.setHorizontalAlignment(JLabel.CENTER);


		//JPanel and Label to show the True Count 
		JPanel tCountPanel = new JPanel();
		tCountPanel.setBounds(250, 30, 100, 15);
		tCountPanel.setLayout(new BorderLayout());

		JLabel tCountText = new JLabel();
		tCountText.setText("True Count");
		tCountText.setVerticalAlignment(JLabel.CENTER);
		tCountText.setHorizontalAlignment(JLabel.CENTER);

		trueCount = new JLabel();
		trueCount.setText(card.getTrueCount());
		trueCount.setVerticalAlignment(JLabel.CENTER);
		trueCount.setHorizontalAlignment(JLabel.CENTER);



		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(50, 50, 100, 100);
		//Original 50, 50
		bluePanel.setLayout(new BorderLayout());


		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(250, 50, 100, 100);
		//Original 250, 50
		redPanel.setLayout(new BorderLayout());

		JButton decreaseCount = new JButton("10-A");
		decreaseCount.setBounds(250, 200, 100, 50);
		decreaseCount.setFocusable(false);
		decreaseCount.addActionListener(e -> {
			card.processCard("-");
			updateCounts();
		});

		JButton increaseCount = new JButton("2-6");
		increaseCount.setBounds(50, 200, 100, 50);
		increaseCount.setFocusable(false);
		increaseCount.addActionListener(e -> {
			card.processCard("+");
			updateCounts();
		});

		JButton neutralCount = new JButton("7-9");
		neutralCount.setBounds(150, 200, 100, 50);
		neutralCount.setFocusable(false);
		neutralCount.addActionListener(e -> {
			card.processCard(".");
			updateCounts();
		});


		JButton resetButton = new JButton("Reset");
		resetButton.setBounds(162, 62, 75, 75);
		resetButton.setFocusable(false);
		resetButton.addActionListener(e -> {
			card.reset();
			updateCounts();
		});








		frame.setVisible(true);
		frame.setLayout(null);
		rCountPanel.add(rCountText);
		tCountPanel.add(tCountText);
		bluePanel.add(runningCount);
		redPanel.add(trueCount);
		frame.add(bluePanel);
		frame.add(redPanel);
		frame.add(tCountPanel);
		frame.add(rCountPanel);
		frame.add(increaseCount);
		frame.add(decreaseCount);
		frame.add(neutralCount);
		frame.add(resetButton);

	}

	private void updateCounts(){
		runningCount.setText(card.getRunningCount());
		trueCount.setText(card.getTrueCount());
	}
		
		

	

	
}