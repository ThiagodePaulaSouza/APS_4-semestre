package arduinobd;
import Apresentacao.frmPrincipal;
import modelo.Serial;
public class ArduinoBD
{
    public static void main(String[] args)
    {
        Serial serial = new Serial();
        if (serial.iniciaSerial())
        {
            //chamar controle para cadastrar as info
            frmPrincipal frmp = new frmPrincipal(null, true);
            frmp.setVisible(true);
        }
        serial.close();
        System.exit(0);
    }
}
