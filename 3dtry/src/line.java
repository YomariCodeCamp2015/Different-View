import javax.swing.JOptionPane;


public class line {
		public int x1,x2, y1,y2,z1,z2;
		public int X1,Y1,X2,Y2,Z1,Z2;
		public int piv;
		String temp;
		
		public  line()
		{
			
			
			temp= JOptionPane.showInputDialog("Enter the X1");
			x1=Integer.parseInt(temp);
			X1=Integer.parseInt(temp);
			temp= JOptionPane.showInputDialog("Enter the y1");
			y1=Integer.parseInt(temp);
			Y1=Integer.parseInt(temp);
			temp= JOptionPane.showInputDialog("Enter the z1");
			z1=Integer.parseInt(temp);
			Z1=Integer.parseInt(temp);
			temp= JOptionPane.showInputDialog("Enter the x2");
			x2=Integer.parseInt(temp);
			X2=Integer.parseInt(temp);
			temp= JOptionPane.showInputDialog("Enter the y2");
			y2=Integer.parseInt(temp);
			Y2=Integer.parseInt(temp);
			temp= JOptionPane.showInputDialog("Enter the z2");
			z2=Integer.parseInt(temp);
			Z2=Integer.parseInt(temp);
			piv=0;
					
		} 
		public line(int a)
		{
			piv=1;
		}
		
		
}
