package bean;

import DAL.EstadoDAO;
import entidade.Estado;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estadoMB")
@ViewScoped
public class EstadoMB
{

    private Estado estado;
    private List<Estado> lista;

    public String getNome()
    {
        return "Marcelo";
    }

    public void salvar()
    {
        EstadoDAO dao = new EstadoDAO();
        dao.salvar(estado);
        inicializar();
    }

    @PostConstruct
    public void inicializar()
    {
        EstadoDAO dao = new EstadoDAO();
        lista = dao.listar();
        estado = new Estado();
    }

    public Estado getEstado()
    {
        return estado;
    }

    public void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    public List<Estado> getLista()
    {
        return lista;
    }

    public void setLista(List<Estado> lista)
    {
        this.lista = lista;
    }

}
