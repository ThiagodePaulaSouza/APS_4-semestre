package DAL;

import Modelo.Temperatura;
import org.hibernate.Query;
import org.hibernate.Session;

public class TemperaturaDAO
{

    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public Temperatura pesquisarTemperatura()
    {
        this.mensagem = "";
        Temperatura temperatura = new Temperatura();
        try
        {
            Query q = session.createQuery("from Temperatura");
            temperatura = (Temperatura) q.list().get(q.list().size()-1);
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

}
