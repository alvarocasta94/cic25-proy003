package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;

    @BeforeEach
    public void setUp() {
        cut = new Coche();
    }

    @Disabled
    @Test
    void testAcelerar() {
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);

        assertEquals(57, velocidadFinal);
    }

    @Test
    void testFrenar() {

    }

    @Test
    void testGetConsumo() {

    }

    @Test
    void testGetVelocidad() {

    }
}
