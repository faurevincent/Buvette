public enum Boisson {

    UNE_BIERE("leffe", 74),
    UN_CIDRE("gorvello", 103),
    UN_VRAI_CIDRE("fossey", 110),
    GT("gt", 115),
    SPECIAL_BACARDI("special bacardi", 128);

    private String nom;

    private int prix;

    Boisson(String nom, int prix){
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }
}
