import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
public class mainframe extends JFrame{
	private static ServerSocket serverSocket;
	private static Socket clientSocket;
	private static InputStreamReader inputStreamReader;
	private static BufferedReader bufferedReader;
	private static String message;
	//static int angle=5;
	static int anglex=5,angley=5;

	static cube c=new cube();
	static int xtemp=0,ytemp=0;
	static int x,y;
	String s[]=new String[2];

	public mainframe()
	{}
	static line[] larray = new line[25]; // line ko array
	static line l;
	static String temp;
	static int edgeno=0;
	
	
	public static void main(String[] args)
	{
		
		temp= JOptionPane.showInputDialog("Enter Number of Edges");
		edgeno = Integer.parseInt(temp);
		System.out.println("Edge No.="+edgeno);
		initiate();		
		JFrame frame= new JFrame();
		mainframe Mainframe=new mainframe();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		String s[]=new String[2];
	
		
			try
				{
					serverSocket = new ServerSocket(4444);  //If you are programming a server, then this is how you open a socket:
			    }
			
			catch (IOException e)
				{
				
					System.out.println("Could not listen on port: 4440");
			    }
		
		System.out.println("Server started. Listening to the port 4440");
		
	
		while(true)
		{
			
			System.out.println("Infinte loop");
			
				try
						{
						
						clientSocket = serverSocket.accept();   //When implementing a server you also need to create a socket object from the ServerSocket in order to listen for and accept connections from clients
						inputStreamReader = new InputStreamReader(clientSocket.getInputStream());//On the server side, you can use DataInputStream to receive input from the client:
						bufferedReader = new BufferedReader(inputStreamReader); //get the client message
						message = bufferedReader.readLine();
						
						System.out.println(message);
						System.out.println("message received");
						inputStreamReader.close();
						clientSocket.close();
						s=message.split(",");
						x=Integer.parseInt(s[0]);
						y=Integer.parseInt(s[1]);
						//first conditions		
						/*	if(xtemp>x)
											{
												
												rotate(frame,5);
												xtemp=x;
												 System.out.println("anticlock");
											}
									
									else if(xtemp<x)
											{
												rotate(frame,-5);
												xtemp=x;
												System.out.println("clock");
											}
									
									
									else
											{
												
												rotate(frame,0);
												xtemp=x;
											}*/
						//modified
						if(xtemp<x && ytemp<y)
						{
							rotate(frame,-5,-5);
							xtemp=x;
							ytemp=y;
							System.out.println("anticlock");
						
							
						}
						else if(xtemp>x && ytemp<y)
						{
							rotate(frame,5,5);
							xtemp=x;
							ytemp=y;
							System.out.println("anticlock");
						
						}
						else if(xtemp<x && ytemp>y)
						{
							rotate(frame,-5,5);
							xtemp=x;
							ytemp=y;
					    	System.out.println("anticlock");
						
						}
						else if(xtemp>x && ytemp>y)
						{
							rotate(frame,5,5);
							xtemp=x;
							ytemp=y;
							System.out.println("anticlock");
						
						}
						else if(xtemp<x && ytemp== y)
						{
							rotate(frame,-5,0);
							xtemp=x;
							ytemp=y;
							System.out.println("anticlock");
						
						}
						else if(xtemp>x && ytemp==y)
						{
							rotate(frame,-5,0);
							xtemp=x;
							ytemp=y;
					    	System.out.println("anticlock");
						
						}
						else if(xtemp==x && ytemp<y)
						{
							rotate(frame,0,-5);
							xtemp=x;
							ytemp=y;
					    	System.out.println("anticlock");
						
						}
						else if(xtemp==x && ytemp>y)
						{
							rotate(frame,0,5);
							xtemp=x;
							ytemp=y;
					    	System.out.println("anticlock");
						
						}
							
					}


				catch (IOException ex)
						{
						
					//System.out.println("Problem in message reading");
				
						}
				
			
		}
			
		
	}
	public static void rotate(JFrame f,int a,int b)
			{
		
				System.out.println("angle="+anglex+"angley="+angley);
				 for(int i=0;i<edgeno;i++)
				  {
					  larray[i].x1=larray[i].X1;
					  larray[i].y1=larray[i].Y1;
					  larray[i].z1=larray[i].Z1;
					  larray[i].x2=larray[i].X2;
					  larray[i].y2=larray[i].Y2;
					  larray[i].z2=larray[i].Z2;
					  
					  
				  }	
				//first try
				 /*if(a>0)
				{
					f.add(c);
					c.update(angle,larray,edgeno);//calculating the new coordinate 
					angle+=5;
				}
				else
				{
					f.add(c);
					c.update(angle,larray,edgeno);
					angle-=5;
					//System.out.println("negative angle");
				}*/
				 
				 //modified
				 
				 if(a>0&&b>0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);//calculating the new coordinate 
						anglex+=1;
						angley+=1;
					}
					else if(a>0&&b<0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex+=1;
						angley-=1;
						//System.out.println("negative angle");
					}
					else if(a<0&&b>0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex-=1;
						angley+=1;
						//System.out.println("negative angle");
					}
					else if(a<0&&b<0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex-=1;
						angley-=1;
						//System.out.println("negative angle");
					}
					else if(a>0&&b==0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex+=1;
						angley+=0;
						//System.out.println("negative angle");
					}
					else if(a<0&&b==0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex-=1;
						angley+=0;
						//System.out.println("negative angle");
					}
					else if(a==0&&b>0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex+=0;
						angley+=1;
						//System.out.println("negative angle");
					}
					else if(a==0&&b<0)
					{
						f.add(c);
						c.update(anglex,angley,larray,edgeno);
						anglex+=0;
						angley-=1;
						//System.out.println("negative angle");
					}
				
			}	
	
	public static void initiate()
	{
		
		 for(int i=0;i<edgeno;i++)
		  {
			  larray[i]= new line();
			  
			  
		  }	
 for(int i=0;i<edgeno;i++)
		  {
			  System.out.println("X1="+larray[i].x1+" y1="+larray[i].x1+" z1="+larray[i].z1+" x2="+larray[i].x2+" y2="+larray[i].y2+" z2="+larray[i].z2);		
 
		  }
 
	}
		
}


