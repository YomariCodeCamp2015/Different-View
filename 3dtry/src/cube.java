import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;


import java.awt.Graphics2D;

import javax.swing.*;
public class cube extends JPanel  {

	
	 
   	int ax=500,bx=600,cx=300,dx=200,ex=200,hx=400,fx=300,gx=300,ay=450,by=120,cy=400,dy=200,ey=150,fy=150,gy=250,hy=250,az=100,bz=100,cz=100,dz=100,ez=200,fz=200,gz=200,hz=200; 
	int axnew=ax,aynew=ay,aznew=az,bxnew=bx,bynew=by,bznew=bz,cxnew=cx,cynew=cy,cznew=cz,dxnew=dx,dynew=dy,dznew=dz,exnew=ex,eynew=ey,eznew=ez,fxnew=fx,fynew=fy,fznew=fz,gxnew=gx,gynew=gy,gznew=gz,hxnew=hx,hynew=hy,hznew=hz;
	int pivotx=600,pivoty=300,pivotz=000;
	 
	static line[] lsorted = new line[25];
	static line[] lnew=new line[25];


int numb=0;	
	 	protected void paintComponent(Graphics g2){
		super.paintComponent(g2);
		 Graphics2D g = (Graphics2D) g2;
		 
		 g.setStroke(new BasicStroke(3));
	
		 
//		g.setColor(.black);
//		g.drawLine(ax,ay,bxnew,by);
//		g.drawLine(bxnew,by,cxnew,cy);
//		g.drawLine(cxnew,cy,dx,dy);
//        g.setColor(Color.black);
//		g.drawLine(dx,dy,ax,ay);
//		g.setColor(Color.MAGENTA);
//		g.drawLine(exnew,ey,fxnew,fy);
//		g.drawLine(fxnew,fy,gxnew,gy);
//		g.drawLine(gxnew,gy,hxnew,hy);
//		g.drawLine(exnew,ey,hxnew,hy);
//		g.setColor(Color.blue);
//		g.drawLine(ax,ay,exnew,ey);
//		g.drawLine(bxnew,by,fxnew,fy);
//		g.drawLine(dx,dy,hxnew,hy);
//		g.drawLine(cxnew,cy,gxnew,gy);
		/*if(eznew>=pivotz){
		 g.setColor(Color.red);
		g.drawLine(250, 0, 250, 500);
		g.setColor(Color.MAGENTA);
		g.drawLine(axnew,aynew,bxnew,bynew);
		g.drawLine(bxnew,bynew,cxnew,cynew);
		g.drawLine(cxnew,cynew,dxnew,dynew);
		g.drawLine(dxnew,dynew,axnew,aynew);
		
		g.setColor(Color.blue);
		g.drawLine(axnew,aynew,exnew,eynew);
		g.setColor(Color.yellow);
		g.drawLine(bxnew,bynew,fxnew,fynew);
		g.setColor(Color.cyan);
		g.drawLine(dxnew,dynew,hxnew,hynew);
		g.setColor(Color.GREEN);
		g.drawLine(cxnew,cynew,gxnew,gynew);
		
		g.setColor(Color.black );
		g.drawLine(exnew,eynew,fxnew,fynew);
		g.drawLine(fxnew,fynew,gxnew,gynew);
		g.drawLine(gxnew,gynew,hxnew,hynew);
		g.drawLine(exnew,eynew,hxnew,hynew);
		
		}
		/*else
		{
		
			g.setColor(Color.black);
			g.drawLine(exnew,eynew,fxnew,fynew);
			g.drawLine(fxnew,fynew,gxnew,gynew);
			g.drawLine(gxnew,gynew,hxnew,hynew);
			g.drawLine(exnew,eynew,hxnew,hynew);
			g.setColor(Color.blue);
			g.drawLine(axnew,aynew,exnew,eynew);
			g.setColor(Color.yellow);
			g.drawLine(bxnew,bynew,fxnew,fynew);
			g.setColor(Color.cyan);
			g.drawLine(dxnew,dynew,hxnew,hynew);
			g.setColor(Color.GREEN);
			g.drawLine(cxnew,cynew,gxnew,gynew);
			g.setColor(Color.MAGENTA );
			g.drawLine(axnew,aynew,bxnew,bynew);
			g.drawLine(bxnew,bynew,cxnew,cynew);
			g.drawLine(cxnew,cynew,dxnew,dynew);
			g.drawLine(dxnew,dynew,axnew,aynew);
			g.setColor(Color.red);

			g.drawLine(250, 0, 250, 500);
			
		 
		 
		}		*/

		 	{
		 for(int i=0;i<numb;i++)
		{
			 if(lsorted[numb-1].z1<000)
			 {			
			g.setStroke(new BasicStroke(6));
			g.setColor(Color.red);
			g.drawLine(600,00,600,1000);
			g.drawLine(0,300,1500,300);
			g.setStroke(new BasicStroke(4));
			g.setColor(Color.black);
			g.drawLine(lsorted[i].x1,lsorted[i].y1,lsorted[i].x2,lsorted[i].y2);
			}
			
			else{
				 
					
			g.setStroke(new BasicStroke(4));
			g.setColor(Color.black);
			g.drawLine(lsorted[i].x1,lsorted[i].y1,lsorted[i].x2,lsorted[i].y2);
			g.setStroke(new BasicStroke(6));
			g.setColor(Color.red);
			g.drawLine(600,00,600,1000);
			g.drawLine(0,300,1500,300);
			}	
		}}
		
	}
	
	public cube() {
		// TODO Auto-generated method stub
		
		}
	public void update(int anglex,int angley,line[] l,int num){
		
		//while(true)
		{		
//			JOptionPane.showMessageDialog(null, "cnew= "+cxnew);
			/*for(int i=0;i<num;i++)
			{
			System.out.println("angle="+angle+"x1= "+l[i].x1+"y1= "+l[i].y1+"z1= "+l[i].z1+"x2= "+l[i].x2+"y2= "+l[i].y2+"z2= "+l[i].z2);
			}*/
			lnew=l;
					double degreex=anglex*(Math.PI/180);
					double degreey=angley*(Math.PI/180);
				degreey=0;
					for(int j=0;j<num;j++)
					{
					System.out.println("Values passed "+"x1= "+l[j].x1+" y1="+l[j].y1+" z1="+l[j].z1+" x2="+l[j].x2+" y2="+l[j].y2+" z2="+l[j].z2);

					}
					
					for(int i=0;i<num;i++)
					{	
						
					lnew[i].x1= (int) ((pivotx)+((l[i].x1-pivotx)*Math.cos(degreex))-((l[i].z1-pivotz)*Math.sin(degreex)));
					lnew[i].x2= (int) ((pivotx)+((l[i].x2-pivotx)*Math.cos(degreex))-((l[i].z2-pivotz)*Math.sin(degreex)));
					

					}
					for(int i=0;i<num;i++)
					{	
						
					lnew[i].y1= (int) ((pivoty)+((l[i].y1-pivoty)*Math.cos(degreey))-((l[i].x1-pivotx)*Math.sin(degreey)));
					lnew[i].y2= (int) ((pivoty)+((l[i].y2-pivoty)*Math.cos(degreey))-((l[i].x2-pivotx)*Math.sin(degreey)));
					

					}
					
					
					for(int i=0;i<num;i++) //to know which face is to be displayed as front face we need to calculate the value of z everytime
					{	
					lnew[i].z1= (int) ((pivotz)+(-(l[i].x1-pivotx)*Math.sin(degreex))+((l[i].z1-pivotz)*Math.cos(degreex)));
					lnew[i].z2= (int) ((pivotz)+(-(l[i].x2-pivotx)*Math.sin(degreex))+((l[i].z2-pivotz)*Math.cos(degreex)));
					}
					
					for(int i=0;i<num;i++) //to know which face is to be displayed as front face we need to calculate the value of z everytime
					{	
					lnew[i].z1= (int) ((pivotz)+(-(l[i].y1-pivoty)*Math.sin(degreey))+((l[i].z1-pivotz)*Math.cos(degreey)));
					lnew[i].z2= (int) ((pivotz)+(-(l[i].y2-pivoty)*Math.sin(degreey))+((l[i].z2-pivotz)*Math.cos(degreey)));
					}
					
					line temp;
					
					lsorted=lnew;
					for(int i=num;i>0;i--)
					{
						
						for(int j=0;j<(i-1);j++)
						{
							if(lsorted[j].z1>lsorted[j+1].z2)//check kun z thulo ho 
							{
								
								temp=lsorted[j];
								lsorted[j]=lsorted[j+1];
								lsorted[j+1]=temp;
								
							}
						}
					}	
					

					
						
					//lsorted=lnew;
					for(int j=0;j<num;j++)
					{
					System.out.println("x1= "+lsorted[j].x1+" y1="+lsorted[j].y1+" z1="+lsorted[j].z1+" x2="+lsorted[j].x2+" y2="+lsorted[j].y2+" z2="+lsorted[j].z2);

					
					}
		
					numb=num;
					repaint();
							

							
		}	
		
	}
	}

	
	

