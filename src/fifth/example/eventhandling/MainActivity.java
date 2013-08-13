package fifth.example.eventhandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener, OnLongClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(this);
		button.setOnLongClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		TextView text = (TextView)findViewById(R.id.textmessage);
		text.setText("BUTTON HAS BEEN CLICKED. EVENT PROCESSED");
	}

	@Override
	public boolean onLongClick(View arg0) {
		TextView text = (TextView)findViewById(R.id.textmessage);
		text.setText("BUTTON HAS BEEN HELD. OnLongClick EVENT PROCESSED");
		return true;
	}

}
