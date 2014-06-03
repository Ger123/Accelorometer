package horgan.gerard.accelerometer;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import android.os.Bundle;
import android.widget.TextView;
;

public class Main extends Activity implements SensorEventListener {
	
	Sensor accelerometer;
	SensorManager sm;
	TextView accleration;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		sm=(SensorManager) getSystemService(SENSOR_SERVICE);
		accelerometer=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		sm.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
		
		accleration=(TextView)findViewById(R.id.accelerometer);
		
		

		
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
		accleration.setText("X: " + event.values[0]+
							"\n Y: "+ event.values[1]+
							"\n Z:" + event.values[2]);
		
		
		
	}

	

}
