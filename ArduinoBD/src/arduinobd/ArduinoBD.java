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
            //chamar controle para cadastrar as info
            frmPrincipal frmp = new frmPrincipal(null, true);
            frmp.setVisible(true);

            Controle controle = new Controle();
            //colocar timer caso o de cada classe pareça estar pesado
            controle.cadastrarPrecipitacao();
            controle.cadastrarTemperatura();
            controle.cadastrarUmidade();

        }
        serial.close();
        System.exit(0);
    }
}
