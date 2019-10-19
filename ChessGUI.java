import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class ChessGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ChessBoard board = new ChessBoard();
		board.printBoard();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChessGUI window = new ChessGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChessGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 153, 102));
		frame.setBackground(new Color(0, 102, 102));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	JPanel panel = new BoardPanel();
	frame.getContentPane().add(panel, BorderLayout.NORTH);
	}
	
	
	
	private class BoardPanel extends JPanel {
		final List<TilePanel> boardTiles;
		
		BoardPanel(){
			super(new GridLayout(8, 8));
			this.boardTiles = new ArrayList<TilePanel>();
			for(int i = 0; i < 64; i++)
			{
				final TilePanel tile = new TilePanel(i);
				this.boardTiles.add(tile);
				add(tile);
			}
			
			setPreferredSize(new Dimension(10, 10));
		}
	}
	
	private class TilePanel extends JPanel {
		private final int tileId;
		
		TilePanel(final int tileId){
			super(new GridBagLayout());
			this.tileId = tileId;
			if(tileId %2 == 0)
				setBackground(Color.decode("#FFFACD"));
			else
				setBackground(Color.decode("#593E1A"));
		}
		
	}
	
}
