package com.example.valuepassingusingbundle;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends Activity {

	EditText et1,et2,et3;
	
	Button b;
	
	String name;
	String place;
	String age;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		et3=(EditText)findViewById(R.id.editText3);
		
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				   	
					name=et1.getText().toString();
					place=et2.getText().toString();
					age=et3.getText().toString();
					int age_coversion_to_Integer = Integer.parseInt(age);
					
			  	 	 //create a bundle object to store the values
			  	 	 Bundle bundle = new Bundle();
			  	 	 
			      	//assign the values (key, value pairs)
			  	 	 bundle.putString("key_name", name);
			  	 	 bundle.putString("key_place", place);
			  	 	 bundle.putString("key_age", age);
			      
			  	 	 //create the intent
			     	 //this is different than we did it before
			  	  	 Intent i = new Intent(Activity1.this,Activity2.class);
			     	 //assign the bundle to the intent
			     	 i.putExtras(bundle);
			     	 //start the new activity
			     	 startActivity(i);
				
			}
		});
		
	}

	

}
