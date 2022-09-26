import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class drawingTree extends JPanel {
	
	static Nood[] copietab =new Nood[100];
	int n=0;
	
	drawingTree(Nood [] node,int n) {
copietab=node.clone();
this.n=n;
	}
	
	public void paintComponent(Graphics g) {
		for(int x=0;x<n;x++) {
			
			
			g.drawOval(copietab[x].x,copietab[x].y,40,40);
			
			String a= String.valueOf(copietab[x].data);
			g.drawString(a,copietab[x].x+5,copietab[x].y+25);
			
			if(copietab[x].right!=null) {
				g.setColor(Color.red);
				g.drawLine(copietab[x].x+15, copietab[x].y+40,copietab[x].x+90, copietab[x].y+90);
			}
			
			if(copietab[x].left!=null) {
				g.setColor(Color.green);
				g.drawLine(copietab[x].x+15, copietab[x].y+40,copietab[x].x-50, copietab[x].y+90);
			}

			g.setColor(Color.black);
			
		}
		
		
	}
 
}
