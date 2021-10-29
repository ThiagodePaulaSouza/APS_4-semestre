/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Bean.TemperaturaBean;
import Modelo.Temperatura;
import DAL.Util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class TemperaturaDAO
{

    private String mensagem;
    private Session session = HibernateUtil.getSessionFactory().openSession();
    public Temperatura pesquisarTemperaturaPorId(Temperatura temperatura)
    {
        try
        {
            Query q = session.createQuery("from Temperatura t where t.cod_temperatura = :cod_temperatura");
            q.setParameter("cod_temperatura", temperatura.getCodTemperatura());
            temperatura =  (Temperatura) q.list().get(0);
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
