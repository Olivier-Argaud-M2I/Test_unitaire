import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculTest {


    @Test
    void addition(){
        Double A = 2d;
        Double B = 3d;

        Double result = Calcul.addition(A,B);

        assertEquals(result,5d);
//        fail("erreur addition");
    }

    @Test
    void soustraction(){
        Double A = 2d;
        Double B = 3d;

        Double result = Calcul.soustraction(A,B);

        assertEquals(result,-1d);
//        fail("erreur soustraction");
    }

    @Test
    void division(){
        Double A = 2d;
        Double B = 4d;

        Double result = Calcul.division(A,B);

        assertEquals(result,0.5d);
//        fail("erreur division");
    }

    @Test
    void multiplication(){
        Double A = 2d;
        Double B = 4d;

        Double result = Calcul.multiplication(A,B);

        assertEquals(result,8d);
//        fail("erreur multiplication");
    }

    @Test
    void puissance(){
        Double A = 2d;
        Double B = 4d;

        Double result = Calcul.puissance(A,B);

        assertEquals(result,16d);
//        fail("erreur puissance");
    }

}
