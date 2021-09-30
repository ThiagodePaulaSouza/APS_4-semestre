package modelo;

public class Temperatura
{
    private int id;
    private String Regiao;
    private int Celsius;
    private int Fahreint;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getRegiao()
    {
        return Regiao;
    }

    public void setRegiao(String regiao)
    {
        this.Regiao = regiao;
    }

    public int getCelsius()
    {
        return Celsius;
    }

    public void setCelsius(int celsius)
    {
        this.Celsius = celsius;
    }

    public int getFahreint()
    {
        return Fahreint;
    }

    public void setFahreint(int fahreint)
    {
        this.Fahreint = fahreint;
    }
}
