package DAL;

import modelo.Temperatura;
import org.hibernate.Query;
import org.hibernate.Session;

public class TemperaturaDAO
{

    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public void cadastrarTemperatura(Temperatura temperatura)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.save(temperatura);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Temperatura Cadastrada Com Sucesso!";
        }
        catch (Exception e)
        {
            this.mensagem = "Erro de Gravação no BD";
        }
    }

    public Temperatura pesquisarTemperaturaPorId(Temperatura temperatura)
    {
        this.mensagem = "";
        try
        {
            Query q = session.createQuery("from Temperatura t where t.codTemperatura = :codTemperatura");
            q.setParameter("codTemperatura", temperatura.getCodTemperatura());
            temperatura = (Temperatura) q.list().get(0);
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

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

}
