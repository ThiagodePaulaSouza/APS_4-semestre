package DAL;

import Modelo.Temperatura;
import org.hibernate.Query;
import org.hibernate.Session;

public class TemperaturaDAO
{
    private Temperatura temperatura;
    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public Temperatura pesquisarTemperatura()
    {
        this.mensagem = "";
        try
        {
            Query q = session.createQuery("SELECT LAST_INSERT_ID(cod_temperatura) from Temperatura order by cod_temperatura desc limit 1");
            temperatura = (Temperatura) q.list().get(0);
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";
        }
        return temperatura;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

}
