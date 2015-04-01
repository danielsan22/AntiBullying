package info.androidhive.slidingmenu.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import info.androidhive.slidingmenu.Entity.Registro;
import info.androidhive.slidingmenu.MainActivity;
import info.androidhive.slidingmenu.R;

/**
 * Created by Daniel on 30/03/15.
 */
public class RegistroActivity extends Activity implements View.OnClickListener {

    private EditText et_nombre, et_apellido_paterno, et_apellido_materno, et_correo, et_edad, et_grado, et_grupo, et_userR, et_passwordR, et_colonia, et_calle, et_noCasa;
    private RadioButton rb_h, rb_m;
    private Button btn_register;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et_nombre = (EditText)findViewById(R.id.et_nombre);
        et_apellido_paterno = (EditText)findViewById(R.id.et_apellido_paterno);
        et_apellido_materno = (EditText)findViewById(R.id.et_apellido_materno);
        et_correo = (EditText)findViewById(R.id.et_correo);
        et_edad = (EditText)findViewById(R.id.et_grado);
        et_grado = (EditText)findViewById(R.id.et_grado);
        et_grupo = (EditText)findViewById(R.id.et_grupo);
        et_userR = (EditText)findViewById(R.id.et_userR);
        et_passwordR = (EditText)findViewById(R.id.et_passwordR);
        rb_h = (RadioButton)findViewById(R.id.rb_h);
        rb_m = (RadioButton)findViewById(R.id.rb_m);
        et_colonia = (EditText)findViewById(R.id.et_colonia);
        et_calle = (EditText)findViewById(R.id.et_calle);
        et_noCasa = (EditText)findViewById(R.id.et_noCasa);





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
    private Registro guardarRegistro(){
        Registro r = new Registro();

        r.setApellido_paterno(et_apellido_paterno.getText().toString());
        r.setApellido_materno(et_apellido_materno.getText().toString());
        r.setCorreo(et_correo.getText().toString());
        r.setEdad(Integer.parseInt(et_edad.getText().toString()));
        r.setGrado(et_grado.getText().toString());
        r.setGrupo(et_grupo.getText().toString());
        r.setUser(et_userR.getText().toString());
        r.setPassword(et_passwordR.getText().toString());
        rb_h.getText();
        rb_m.getText();
        r.setColonia(et_colonia.getText().toString());
        r.setCalle(et_calle.getText().toString());
        r.setNo_calle(et_noCasa.getText().toString());
        r.setNombre(et_nombre.getText().toString());

        if(rb_h.isChecked()){
            r.setSexo(1);
        }else
        r.setSexo(0);


        return r;

    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_register:

                break;


        }
    }
}
