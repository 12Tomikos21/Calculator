import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		Gui g = new Gui();
		g.setSize(250, 500);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
	}
}