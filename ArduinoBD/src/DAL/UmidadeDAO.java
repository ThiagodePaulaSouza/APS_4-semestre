package DAL;

import modelo.Umidade;
import org.hibernate.Query;
import org.hibernate.Session;

public class UmidadeDAO
{

    private String mensagem;
    Session session = HibernateUtil.getSessionFactory().openSession();

    public void cadastrarUmidade(Umidade umidade)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.save(umidade);
            session.getTransaction().commit();
            session.close();
            this.mensagem = " Umidade Cadastrada com Sucesso!";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public Umidade pesquisarUmidadePorId(Umidade valorUmidade)
    {
        try
        {
            Query q = session.createQuery("from Umidade u where u.codUmidade = :codUmidade");
            q.setParameter("codUmidade", valorUmidade.getCodUmidade());
            valorUmidade = (Umidade) q.list().get(0);
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";
        }
        return valorUmidade;
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
