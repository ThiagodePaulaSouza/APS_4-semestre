package br.com.thigas.estacaometereologica.bean.estudante;

import br.com.thigas.estacaometereologica.model.Estudante;
import java.io.Serializable;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.el.LambdaExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class EstudanteRegistrarBean implements Serializable
{

    private Estudante estudante = new Estudante();
    private String[] nomesArray =
    {
        "to", "aprendendo", "saporra"
    };
    private List<String> nomesList = asList("mas", "parece", "que nao");
    private Set<String> nomesSet = new HashSet<>(asList("sim", "nao", "talvez"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;

    public void exibirNotas()
    {
        this.mostrarNotas = true;
    }

    public void esconderNotas()
    {
        this.mostrarNotas = false;
    }

    public boolean isMostrarNotas()
    {
        return mostrarNotas;
    }
    
    public void calcularCubo(LambdaExpression le, long value){
        long result = (long)le.invoke(FacesContext.getCurrentInstance().getELContext(),value);
    }

    public void setMostrarNotas(boolean mostrarNotas)
    {
        this.mostrarNotas = mostrarNotas;
    }

    public void executar(String param)
    {
        System.out.println("Fazendo uma buscazinha no BD com meu mano " + param);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public Map<String, String> getNomesMap()
    {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap)
    {
        this.nomesMap = nomesMap;
    }

    public List<String> getNomesList()
    {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList)
    {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray()
    {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray)
    {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante()
    {
        return estudante;
    }

    public void setEstudante(Estudante estudante)
    {
        this.estudante = estudante;
    }

    public Set<String> getNomesSet()
    {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet)
    {
        this.nomesSet = nomesSet;
    }

}
