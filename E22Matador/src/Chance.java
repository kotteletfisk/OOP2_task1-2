public class Chance extends Field {
    String option = "";
    public Chance(int id, String label, int cost, int income) {
        super(id, label, cost, income);
    }
    @Override
    public String onLand(Player p){
        option = "draw";
        String s = super.onLand(p);
               s+= "\n Træk et kort fra bunken. (Tast J): ";

        return s;
    }
    //Todo:implementer denne metode sådan at der bliver trukket et kort fra bunken (se Task 2.b)
    public String onAccept(Player p)
    {
        Chancecard c = Board.getChancecard();

        if (c.cost > 0)
        {
            p.pay(c.cost);
        }

        if (c.income > 0)
        {
            p.recieve(c.income);
        }

        return c.text;
    }

}
