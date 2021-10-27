package DAL;

/**
 *
 * @author Usuario
 */
import Bean.PrecipitacaoBean;
import DAL.Util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrecipitacaoDAO
{
    private String mensagem;
    public PrecipitacaoDAO()
    {
        PrecipitacaoBean precipitacao = new PrecipitacaoBean();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createSQLQuery("SELECT SCOPE_IDENTITY()");
        precipitacao.setValorPrecipitacao((int) q.list().get(0));
        System.out.println("opa bão precipitacaoDAO da uma OLHADA");
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
}
