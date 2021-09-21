package DAL;

import modelo.Temperatura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class TemperaturaDAO
{

    private String mensagem;
    Conexao conexao = new Conexao();

    public void cadastrarTemperatura(Temperatura temperatura)
    {
        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "Insert into Estacao (Regiao, Celsius, Fahreint)"
                        + "values(?,?,?)";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setString(1, temperatura.getRegiao());
                stmt.setInt(2, temperatura.getCelsius());
                stmt.setInt(3, temperatura.getFahreint());
                stmt.execute();
                conexao.desconectar();
                this.mensagem = "Temperatura salva com sucesso!";
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void editarTemperatura(Temperatura temperatura)
    {

        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "Update Estacao "
                        + "set regiao = ?,"
                        + "celsius = ?,"
                        + "fahreint = ? "
                        + "where id = ?";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setString(1, temperatura.getRegiao());
                stmt.setInt(2, temperatura.getCelsius());
                stmt.setInt(3, temperatura.getFahreint());
                stmt.execute();
                conexao.desconectar();
                this.mensagem = "Temperatura editada com sucesso!";
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de gravação no BD";
        }
    }

    public void excluirTemperatura(Temperatura temperatura)
    {

    }

    public Temperatura pesquisarTemperatura(Temperatura temperatura)
    {
        this.mensagem = "";
        try
        {
            Connection con = conexao.conectar();
            if (conexao.getMensagem().equals(""))
            {
                String comSql = "select * from estacao where id = ?";
                PreparedStatement stmt = con.prepareStatement(comSql);
                stmt.setInt(1, temperatura.getId());
                ResultSet resultset = stmt.executeQuery();
                if (resultset.next())
                {
                    temperatura.setRegiao(resultset.getString("regiao"));
                    temperatura.setCelsius(resultset.getInt("celsius"));
                    temperatura.setFahreint(resultset.getInt("fahreint"));
                }
                else
                {
                    this.mensagem = "Não existe este dado";
                }

                conexao.desconectar();
//            this.mensagem = "Pessoa cadastrada com sucesso!";                
            }
            else
            {
                this.mensagem = conexao.getMensagem();
            }
        }
        catch (Exception e)
        {
//            this.mensagem = e.getMessage();
            this.mensagem = "Erro de leitura no BD";
        }
        return temperatura;
    }

    public List<Temperatura> pesquisarTemperaturaPorTipo(Temperatura temperatura)
    {
        return null;
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
