/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.TemperaturaBean;
import DAL.Util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class TemperaturaDAO
{

    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();
    private Integer temperatura;
    public Integer pesquisarTemperatura()
    {
        try
        {
            TemperaturaBean t =  (TemperaturaBean) session.createQuery("from Temperatura ORDER BY cod_temperataura DESC").setMaxResults(1).uniqueResult();
            temperatura = t.getValorTemperatura();
            System.out.println("Deu certo !");
        }
        catch (Exception e)
        {
            this.mensagem = "erro de leitura no BD";
            System.out.println(e);
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
