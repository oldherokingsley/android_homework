package sysu.txx;  // my package is named sysu.txx XD 

import android.app.Activity;  // import android reference
import android.os.Bundle;

public class Ex02Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) { 
    	//Override this method.. To create a View which you draw in the main.xml  
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); // this sentence is associate with main.xml  
    }
}