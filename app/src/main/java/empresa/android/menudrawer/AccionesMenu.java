package empresa.android.menudrawer;

import android.content.Context;
import android.widget.Toast;

public class AccionesMenu {
    DesMenuActivity mi;
    Context contexto;
    public AccionesMenu(DesMenuActivity i){
        mi = i;
    }

    public boolean seleccionado (int id){
        if(mi != null)
            contexto = mi.getApplicationContext();

        if (id == R.id.action_salir) {
            mi.finish();
            return true;
        }else if (id == R.id.opA){
            Toast.makeText(contexto, "opcion A", Toast.LENGTH_LONG).show();
            return true;
        }else if (id == R.id.opB){
            Toast.makeText(contexto, "opcion B", Toast.LENGTH_LONG).show();
            return true;
        }else if (id == R.id.opC){
            Toast.makeText(contexto, "opcion C", Toast.LENGTH_LONG).show();
            return true;
        }else
            return true;
    }
}
