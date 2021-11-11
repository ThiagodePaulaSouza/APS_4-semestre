package DAL;

import Modelo.Umidade;
import org.hibernate.Query;
import org.hibernate.Session;

public class UmidadeDAO
{
    private Umidade umidade;
    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public Umidade pesquisarUmidadePorId()
    {
        this.mensagem = "";
        try
        {
            Query q = session.createQuery("SELECT LAST_INSERT_ID(cod_umidade) from Umidade order by cod_umidade desc limit 1");
            umidade = (Umidade) q.list().get(0);
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

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

}
