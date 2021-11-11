package arduinobd;

import Apresentacao.frmPrincipal;
import Controle.Controle;
import modelo.Serial;

public class ArduinoBD
{

    public static void main(String[] args)
    {
        Serial serial = new Serial();
        if (serial.iniciaSerial())
        {
            frmPrincipal frmp = new frmPrincipal(null, true);
            frmp.setVisible(true);
        }
        serial.close();
        System.exit(0);
    }
}
