package EstadosFinancieros;

import Otros.Cuenta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alexis Lopez
 */
public class BalanceDeComprobacionTableModel extends AbstractTableModel{
        public List<Cuenta> cuentas = new ArrayList<Cuenta>();

    @Override
    public int getRowCount() {
        return cuentas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cuenta cuenta = cuentas.get(rowIndex);
        Object valor = null;
        
        switch(columnIndex) {
            case 0: valor = cuenta.getCodigo();
                break;
            case 1: valor = cuenta.getNombre();
                break;
            case 2: valor = cuenta.getSaldoDeudor();
                break;
            case 3: valor = cuenta.getSaldoAcreedor();
        }
        return valor;
    }
    
    public void totales(String debe, String haber){
        
    }
}
