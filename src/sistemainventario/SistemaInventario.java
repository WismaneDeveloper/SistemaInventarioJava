package sistemainventario;

import ConexionBaseDatos.sqlConexionBD;
import java.util.ArrayList;
import java.util.Iterator;
import vistaFormularios.frmPrincipales.MenuPrincipal;
import vistaFormularios.frmPrincipales.accesoUsuarios;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaClientes;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaInventario;
import vistaFormularios.frmPrincipales.frmDesarrollo.frm_EntidadesRegistradas.vistaProveedores;
import vistaFormularios.frmPrincipales.frmDesarrollo.registrarMarca;
import vistaFormularios.frmPrincipales.frmDesarrollo.registrarProducto;
import vistaFormularios.frmPrincipales.frmDesarrollo.registroProveedores;

public class SistemaInventario {

    public static void main(String[] args) {
      new accesoUsuarios().setVisible(true); 
        int id = 1;
        int id2 = 2;
        int vector[] = {10};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(vector.length);

        Integer next = 0;
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            next = iterator.next();
            System.out.println("next:" + next);

        }

        int vector2[] = {next};
        for (int i = 0; i < vector2.length; i++) {
            System.out.println(i);
        }
    }

}
