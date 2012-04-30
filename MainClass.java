package Game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainClass {
	
	String type[] = {"clubs", "diamonds", "hearts", "spades"};            // 0-3
	String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J",   // 0-12
						"Q", "K", "A"};
	
	public static void main(String[] args) {
		
		GameMenu();
		
	}
	
	public static void GameMenu() {
		
		ImagePanel panel = new ImagePanel(new ImageIcon("D:/bg.png").getImage());
	    final JFrame frame = new JFrame("Poker");  
	    
	    JButton play = new JButton("PLAY");
	    play.setBounds(440, 280, 139, 21);
	    play.setVisible(true);
	    play.setBorder(null);
	    
	    JButton options = new JButton("OPTIONS");
	    options.setBounds(440, 320, 139, 21);
	    options.setVisible(true);
	    options.setBorder(null);
	    
	    JButton credits = new JButton("CREDITS");
	    credits.setBounds(440, 360, 139, 21);
	    credits.setVisible(true);
	    credits.setBorder(null);
	    
	    JButton exit = new JButton("EXIT");
	    exit.setBounds(440, 400, 139, 21);
	    exit.setVisible(true);
	    exit.setBorder(null);
	    
	    
	    frame.add(play);
	    frame.add(options);
	    frame.add(credits);
	    frame.add(exit);
	    frame.setSize(1030, 615);
	    frame.getContentPane().add(panel);
	    frame.setResizable(false);
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);

	    play.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e){
	    		frame.dispose();
	    		GameWindow();
	    	}
	    });
	        
	}
	
    
	
	public static void GameWindow() {
	
		ImagePanel panel = new ImagePanel(new ImageIcon("D:/poker-table.png").getImage());
		JFrame frame = new JFrame("Poker");
			
		
		JButton check = new JButton("CHECK");
	    check.setBounds(850, 550, 65, 20);
	    check.setVisible(true);
	    check.setBorder(null);
	    
	    JButton bet = new JButton("BET");
	    bet.setBounds(925, 450, 65, 20);
	    bet.setVisible(true);
	    bet.setBorder(null);
	    
	    JButton raise = new JButton("RAISE");
	    raise.setBounds(925, 400, 65, 20);
	    raise.setVisible(true);
	    raise.setBorder(null);
	    
	    JButton fold = new JButton("FOLD");
	    fold.setBounds(925, 550, 65, 20);
	    fold.setVisible(true);
	    fold.setBorder(null);
	    
	    JButton call = new JButton("CALL");
	    call.setBounds(850, 500, 140, 20);
	    call.setVisible(true);
	    call.setBorder(null);
	    
	    JButton allin = new JButton("ALL IN");
	    allin.setBounds(850, 350, 140, 20);
	    allin.setVisible(true);
	    allin.setBorder(null);
	    
	    frame.add(allin);
	    frame.add(call);
	    frame.add(fold);
	    frame.add(raise);
	    frame.add(bet);
		frame.add(check);
		frame.add(panel);
		frame.setSize(1030,615);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
	
}
	
	class ImagePanel extends JPanel {

		  private Image img;

		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }
		  
		  public void paintComponent(Graphics g) {
			  	
			    g.drawImage(img, 0, 0, null);
		  }
		  
		  public void GetDeck() {
			  Image C2 = new ImageIcon("D:/poker-tp/2C.jpeg").getImage();
			  Image D2 = new ImageIcon("D:/poker-tp/2D.jpeg").getImage();
			  Image H2 = new ImageIcon("D:/poker-tp/2H.jpeg").getImage();
			  Image S2 = new ImageIcon("D:/poker-tp/2S.jpeg").getImage();
			  
			  Image C3 = new ImageIcon("D:/poker-tp/3C.jpeg").getImage();
			  Image D3 = new ImageIcon("D:/poker-tp/3D.jpeg").getImage();
			  Image H3 = new ImageIcon("D:/poker-tp/3H.jpeg").getImage();
			  Image S3 = new ImageIcon("D:/poker-tp/3S.jpeg").getImage();
			  		
		  }
		  
		  public void RandomizeHands() {
			  
		  }

	}

