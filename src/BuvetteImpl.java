public class BuvetteImpl implements Buvette {

    @Override
    public int calculerPrix(Boisson boisson, boolean etudiant, int combien) {
        if(boisson == null){
            throw new BoissonInexistanteException();
        }
        if (combien > 2 && (boisson.equals(Boisson.GT) || boisson.equals(Boisson.SPECIAL_BACARDI))) {
            throw new TropAlcoolException();
        }

        return etudiant && (boisson.equals(Boisson.UN_VRAI_CIDRE) || boisson.equals(Boisson.UN_CIDRE)
                || boisson.equals(Boisson.UNE_BIERE)) ? boisson.getPrix() / 2 * combien
                : boisson.getPrix() * combien;
    }
}
