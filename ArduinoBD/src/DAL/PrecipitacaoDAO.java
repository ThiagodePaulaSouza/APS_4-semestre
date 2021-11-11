package DAL;

import modelo.Precipitacao;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrecipitacaoDAO
{

    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public void cadastrarPrecipitacao(Precipitacao precipitacao)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.save(precipitacao);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Temperatura Cadastrada Com Sucesso!";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de Gravação no BD";
        }
    }
    
    public Precipitacao pesquisarPrecipitacaoPorId(Precipitacao precipitacao)
    {
        this.mensagem = "";
        try
        {
            Query q = session.createQuery("from Precipitacao t where t.codPrecipitacao = :codPrecipitacao");
            q.setParameter("codPrecipitacao", precipitacao.getCodPrecipitacao());
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
