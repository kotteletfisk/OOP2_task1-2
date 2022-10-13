public class Chancecard
{
    String text;
    int income;
    int cost;

    public Chancecard(String text, int income, int cost)
    {
        this.text = text;
        this.income = income;
        this.cost = cost;
    }

    public String getText()
    {
        return text;
    }

    public int getIncome()
    {
        return income;
    }

    public int getCost()
    {
        return cost;
    }



}
