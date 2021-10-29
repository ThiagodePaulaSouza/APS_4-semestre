package Modelo;


public class Protocolo
{
    public static String temperatura;
    public static String umidade;
    public static String precipitacao;
    
    private String leituraComando;

    private void interpretaComando()
    {
        String aux[] = leituraComando.split(",");
        if (aux.length == 3)
        {
            this.umidade = aux[0];
            this.temperatura = aux[1];
            this.precipitacao = aux [2];
        }
        
        //Chama 3 metodos para Cadastrar no Banco de Dados
    }
    public String getLeituraComando()
    {
        return leituraComando;
    }

    public void setLeituraComando(String leituraComando)
    {
        this.leituraComando = leituraComando;
        interpretaComando();
    }
    
    
}
