package lorena.u4_a15lorenaae;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
private static final int dialogo_multiple=1;
    AlertDialog.Builder venta;
    ArrayList<String> lista=new ArrayList<String>();
    EditText textoeditado;
    TextView texto;
    Button botondialogo;
    Button botondialogfragment;
    ArrayList<String>listapalabras=new ArrayList<String>();
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoeditado= (EditText) findViewById(R.id.editText);
        texto=(TextView)findViewById(R.id.textView2);
        list=(ListView)findViewById(R.id.list1);
        botondialogo=(Button)findViewById(R.id.btndialogo);
        botondialogfragment=(Button)findViewById(R.id.btndialogfragment);
    }
protected Dialog onCreateDialog(int id){

    venta=new AlertDialog.Builder(this);
    venta.setIcon(android.R.drawable.ic_dialog_info);
    venta.setTitle("Seleccionaches modos de transporte");
    Resources res=getResources();
    lista.add(textoeditado.getText().toString());
    listapalabras=lista;
    ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listapalabras);
    list.setAdapter(adaptador);
    venta.setMultiChoiceItems(new DialogInterface.OnMultiChoiceClickListener)
    }
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
