package DAL;

import Modelo.Precipitacao;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrecipitacaoDAO
{
    private Precipitacao precipitacao;
    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public Precipitacao pesquisarPrecipitacaoPorId()
    {
        this.mensagem = "";
        try
        {
            Query q = session.createQuery("SELECT LAST_INSERT_ID(cod_precipitacao) from Precipitacao order by cod_precipitacao desc limit 1");
            precipitacao = (Precipitacao) q.list().get(0);
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

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }
    
}
