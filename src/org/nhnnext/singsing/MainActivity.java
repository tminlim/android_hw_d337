package org.nhnnext.singsing;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button btn;
	private ImageButton imgbtn;
	private TextView txtview;
	private int clickCont = 0;
	
	private ImageView imageView1;
	private boolean changeimg = true;
	private String imgPath = "";
	
	private Button btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(this);
		
		imgbtn = (ImageButton) findViewById(R.id.imageButton1);
		imgbtn.setOnClickListener(this);

		txtview = (TextView) findViewById(R.id.textView1);	

		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Toast.makeText(MainActivity.this, txtview.getText().toString() + "",Toast.LENGTH_SHORT).show();
			Log.i("message01" , txtview.getText().toString() + "" );
			break;
		case R.id.imageButton1:
			++clickCont;
			txtview.setText(clickCont + "press");
			Toast.makeText(MainActivity.this, "PRESS THE IMGBTN",Toast.LENGTH_SHORT).show();
			Log.i("message02" , "PRESS THE IMGBTN" );
			break;
	
		}		
	}

}
