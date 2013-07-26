package com.xperttech;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	String operationType;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		double firstNumber;
		double SecondNumber;
		double resultNumber;
		
		final Button addButton = (Button) findViewById(R.id.btnAdd);
		final Button minusButton = (Button) findViewById(R.id.btnMinus);
		final Button doneButton = (Button) findViewById(R.id.btnDone);
		final EditText firstNumberLabel = (EditText) findViewById(R.id.editText1);
		final EditText secondNumberLabel = (EditText) findViewById(R.id.editText2);
		final TextView resultText = (TextView) findViewById(R.id.lblResult);
		addButton.setOnClickListener(new Button.OnClickListener() {  
	 

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				operationType="add";
			}
	         
		});
		minusButton.setOnClickListener(new Button.OnClickListener() {  
			 
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				operationType="minus";
				 
			}
	         
		});
		doneButton.setOnClickListener(new Button.OnClickListener() {  
			 
			double firstNumber;
			double secondNumber;
			double resultNumber;
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				if(operationType=="add")
				{
					firstNumber = Double.parseDouble( firstNumberLabel.getText().toString());
					 secondNumber = Double.parseDouble( secondNumberLabel.getText().toString());
					 resultNumber = firstNumber+secondNumber;
					 resultText.setText(String.valueOf(resultNumber));
				}
				else if(operationType=="minus")
				{
					firstNumber = Double.parseDouble( firstNumberLabel.getText().toString());
					 secondNumber = Double.parseDouble( secondNumberLabel.getText().toString());
					 resultNumber = firstNumber-secondNumber;
					 resultText.setText(String.valueOf(resultNumber));
				}
			}
	         
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
