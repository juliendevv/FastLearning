package projetweb;

public class Liste_utilisateurs
{
    private Utilisateur Utilisateur;

    public Utilisateur getUtilisateur ()
    {
        return Utilisateur;
    }

    public void setUtilisateur (Utilisateur Utilisateur)
    {
        this.Utilisateur = Utilisateur;
    }

    @Override
    public String toString()
    {
        return "Utilisateur = "+Utilisateur+"";
    }
}
