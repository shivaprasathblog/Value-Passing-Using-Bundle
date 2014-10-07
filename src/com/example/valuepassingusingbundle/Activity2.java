package com.example.valuepassingusingbundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity
{
TextView tv1,tv2,tv3;
	
@Override
protected void onCreate(Bundle savedInstanceState) 
{
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity2);
	
	tv1= (TextView) findViewById(R.id.textView1);
	tv2= (TextView) findViewById(R.id.textView2);
	tv3= (TextView) findViewById(R.id.textView3);
	
	//create a bundle object to store
	//the bundle we added to the intent
  	Bundle bundle=getIntent().getExtras();
  
  	//get the values out by key
  	String name=bundle.getString("key_name");
 	String place=bundle.getString("key_place");
 	String age = bundle.getString("key_age");
  
 	//set the text values of the text controls
 	tv1.setText("Your Name is: "+name );
  	tv2.setText("Your Place is: "+place );
  	tv3.setText("Your Age is: "+age );
}

}
