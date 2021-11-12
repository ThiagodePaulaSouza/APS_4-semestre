package DAL;

import Modelo.Umidade;
import org.hibernate.Query;
import org.hibernate.Session;

public class UmidadeDAO
{

    private String mensagem;
    Session session = HibernateUtil.getSessionFactory().openSession();

    public Umidade pesquisarUmidade()
    {
        Umidade umidade = new Umidade();
        try
        {
            Query q = session.createQuery("from Umidade");
            umidade = (Umidade) q.list().get(q.list().size()-1);
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";
        }
        return umidade;
    }

    public String getMensagem()
    {
        return mensagem;
    }

}
