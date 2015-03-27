package info.androidhive.slidingmenu.Activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.androidhive.slidingmenu.MainActivity;
import info.androidhive.slidingmenu.R;

public class Main2Activity extends Activity implements View.OnClickListener{

    private Button btn_login, btn_p;
    private EditText et_user, et_password;
    private SharedPreferences pref;
    public static final String PREFS_NAME = "MyPreferencesFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_login = (Button)findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
        btn_p = (Button)findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);
        et_user     = (EditText)findViewById(R.id.et_user);
        et_password = (EditText)findViewById(R.id.et_password);


        pref = getSharedPreferences(PREFS_NAME, 0);

        if(pref.getString("User", "admin").equals("admin")){

        }else{
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_login:
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                SharedPreferences.Editor editor = settings.edit();
                editor.putString("User", et_user.getText().toString());
                editor.putString("Password", et_password.getText().toString());
                editor.commit();
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.btn_p:
                Toast toast = Toast.makeText(getApplicationContext(),pref.getString("User", "Potato") ,Toast.LENGTH_SHORT);
                toast.show();

                break;

        }
    }
}
