package DAL;

/**
 *
 * @author Usuario
 */
import Modelo.entidade.Precipitacao;
import DAL.Util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrecipitacaoDAO
{

    private String mensagem;
    Session session  = HibernateUtil.getSessionFactory().openSession();
    
    public Precipitacao pesquisarPrecipitacaoPorId(Precipitacao valorPrecipitacao)
    {
        try
        {
            Query q = session.createQuery("from Precipitacao p where p.cod_precipitacao = :cod_precipitacao");
            q.setParameter("id" , valorPrecipitacao.getCodPrecipitacao());
            valorPrecipitacao = (Precipitacao) q.list().get(0);
            System.out.println("Deu certo !");
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";                            
            System.out.println(e);                      
        }
        return valorPrecipitacao;
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
