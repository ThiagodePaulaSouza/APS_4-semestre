package DAL;

/**
 *
 * @author Usuario
 */
import Modelo.Precipitacao;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrecipitacaoDAO
{

    private String mensagem;

    Session session = HibernateUtil.getSessionFactory().openSession();
    Query q = session.createSQLQuery("SELECT SCOPE_IDENTITY()");
    private int valorPrecipitacao  = (int) q.list().get(0);

    public void PrecipitacaoDAO()
    {
    
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    //.uniqueResult()).longValue();
    //Long lastId = ((BigInteger) session.createSQLQuery("SELECT LAST_INSERT_ID()").uniqueResult()).longValue();

    public int getValorPrecipitacao()
    {
        return valorPrecipitacao;
    }
}
