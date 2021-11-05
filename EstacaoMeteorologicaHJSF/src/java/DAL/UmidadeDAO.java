package DAL;

/**
 *
 * @author Usuario
 */
import Modelo.Umidade;
import org.hibernate.Query;
import org.hibernate.Session;

public class UmidadeDAO
{

    private String mensagem;
    Session session = HibernateUtil.getSessionFactory().openSession();
    
   public Umidade pesquisarUmidadePorId(Umidade valorUmidade)
    {
        try
        {
            Query q = session.createQuery("from Umidade u where u.cod_umidade = :cod_umidade");
            q.setParameter("id" , valorUmidade.getCodUmidade());
            valorUmidade = (Umidade) q.list().get(0);
            System.out.println("Deu certo !");
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";                            
            System.out.println(e);                      
        }
        return valorUmidade;
    }

    public void cadastrarUmidade(Umidade umidade)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.save(umidade);
            session.getTransaction().commit();
            session.close();
            this.mensagem = " Umidade Cadastrada com Sucesso ! ";
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void editarUmidade(Umidade umidade)
    {
        this.mensagem = "";
        try
        {
            session.beginTransaction();
            session.saveOrUpdate(umidade);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Umidade Editada com Sucesso !";
        }
        catch(Exception e)
        {
            this.mensagem = "Erro de gravação no BD";
        }
    }
//    
//    public void excluirUmidade(Umidade umidade)
//    {
//        this.mensagem = "";
//        try
//        {
//            session.getTransaction();
//            session.delete(umidade);
//            session.getTransaction().commit();
//            session.close();
//            this.mensagem = "Umidade Excluida com Sucesso !";
//        }
//        catch(Exception e)
//        {
//            this.mensagem = "Erro de gravação no BD";
//        }
//    }
    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

}
