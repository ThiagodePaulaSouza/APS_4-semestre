package DAL;

import entidade.Estado;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

public class EstadoDAO
{
    public void salvar(Estado estado){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.persist(estado);
        sessao.getTransaction().commit();
        sessao.close();
    }
    public List<Estado> listar(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Estado> lista = sessao.getNamedQuery("Estado.findAll").list();
        sessao.close();
        return lista;
    }
}
