package com.example.androidexamplejoypad2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.example.androidexamplejoypad2.R;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity  {
	Socket client;
	PrintWriter printwriter;
	int x;
	int y;
	String serverIp="192.168.1.122";
	  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	

	@Override
	public boolean onTouchEvent( MotionEvent event) {
		// TODO Auto-generated method stub
		  x=(int)event.getX();
		  y=(int)event.getY();
	
		     //Toast.makeText(this ,"X= "+x+"Y= "+y,Toast.LENGTH_SHORT).show();
	    	//if(event.getAction()==MotionEvent.ACTION_DOWN){
		  	
		     try {
				client = new Socket(serverIp,4444); //connect to server
				 printwriter = new PrintWriter(client.getOutputStream(),true);
				 printwriter.write(""+x+","+y);  //write the message to output stream
				 printwriter.flush();
				 printwriter.close();
				 client.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
				   
		  return (true);
	
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
