//Activity A.java:
package com.example.SP;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
  @Override    
  protected void onCreate(Bundle savedInstanceState) {  
  super.onCreate(savedInstanceState);       
  setContentView(R.layout.activity_main);    }   
  public void loadActivityB(View v){      
  Intent i=new Intent(MainActivity.this, ActivityB.class);       
  startActivity(i);
  }
  }


//Activity B.java:
package com.example.SP;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends PreferenceActivity {
@Override    
protected void onCreate(Bundle savedInstanceState) {        
super.onCreate(savedInstanceState);        
//setContentView(R.layout.activity_layout_b);        
addPreferencesFromResource(R.xml.mypreferences);    }
}


/**Mypreferences.xml:
<PreferenceScreen   
xmlns:android="http://schemas.android.com/apk/res/android">    
<CheckBoxPreference        
android:key=“mypreference_checkbox"        
android:title="Checkbox"       
android:defaultValue=“false"       
android:summary="Change The CheckBox Status here, it will be saved in Preference"/>
</PreferenceScreen>
**/


