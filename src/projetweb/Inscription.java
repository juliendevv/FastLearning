package projetweb;

public class Inscription
{
    private Liste_utilisateurs Liste_utilisateurs;

    public Liste_utilisateurs getListe_utilisateurs ()
    {
        return Liste_utilisateurs;
    }

    public void setListe_utilisateurs (Liste_utilisateurs Liste_utilisateurs)
    {
        this.Liste_utilisateurs = Liste_utilisateurs;
    }

    @Override
    public String toString()
    {
        return "Liste_utilisateurs = "+Liste_utilisateurs+"";
    }
}
