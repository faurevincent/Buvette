import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BuvetteTest {

    private static BuvetteImpl buvette;

    @BeforeAll
    static void beforeAll() {
        buvette = new BuvetteImpl();
    }

    @Test
    void calculerPrix_boissonInexistante() {
        assertThrows(BoissonInexistanteException.class, () -> {
            buvette.calculerPrix(null, true, 1);
        });
    }

    @Test
    void calculerPrix_tropAlcool(){
        assertThrows(TropAlcoolException.class, () -> {
            buvette.calculerPrix(Boisson.GT, true, 3);
        });
    }

    @Test
    void calculerPrix(){
        assertEquals(Boisson.UN_CIDRE.getPrix() * 2, buvette.calculerPrix(Boisson.UN_CIDRE, false, 2));
    }
}