package DAL;

import Modelo.Precipitacao;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrecipitacaoDAO
{

    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();
 
    public Precipitacao pesquisarPrecipitacao()
    {
        this.mensagem = "";
        Precipitacao precipitacao = new Precipitacao();
        try
        {
            Query q = session.createQuery("from Precipitacao");
            precipitacao = (Precipitacao) q.list().get(q.list().size()-1);
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";
        }
        return precipitacao;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
}
