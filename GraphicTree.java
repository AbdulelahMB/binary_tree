


import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraphicTree extends Tree {
	
	static Nood[] tap=new Nood[100];
	static int i=0;
	JFrame fenetre= null;
	JPanel panl=null;
	
	 GraphicTree() {

		 fenetre= new JFrame();
		fenetre.setTitle("search binary tree");
		fenetre.setSize(1500, 600);
		fenetre.setResizable(false);

	}
	
	public void getReady(Nood node) {
		tap[i]=node;
		i++;
		if(node.left!=null) {
			getReady(node.left);
			
		}
		if(node.right!=null) {
			getReady(node.right);
		}
	}
	
	public void drawTree() {

		fenetre.setContentPane(new drawingTree(tap, howmany));
		fenetre.setVisible(true);
		
	}

}
