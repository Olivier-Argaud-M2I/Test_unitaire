import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@ExtendWith(Log4jExtension.class)
public class CalculTest {

    private Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Test
    void addition(){
        Double A = 2d;
        Double B = 3d;

        Double result = Calcul.addition(A,B);

//        assertEquals(result,5d);

        assertThat(result).isEqualTo(5d);
        logger.info("on test l'addition");
//        fail("erreur addition");
    }

    @Test
    void soustraction(){
        Double A = 2d;
        Double B = 3d;

        Double result = Calcul.soustraction(A,B);

//        assertEquals(result,-1d);
        assertThat(result).isEqualTo(-1d);
//        fail("erreur soustraction");
    }

    @Test
    void division(){
        Double A = 2d;
        Double B = 4d;

        Double result = Calcul.division(A,B);

//        assertEquals(result,0.5d);
        assertThat(result).isEqualTo(0.5d);
//        fail("erreur division");
    }

    @Test
    void multiplication(){
        Double A = 2d;
        Double B = 4d;

        Double result = Calcul.multiplication(A,B);

//        assertEquals(result,8d);
        assertThat(result).isEqualTo(8d);
//        fail("erreur multiplication");
    }

    @Test
    void puissance(){
        Double A = 2d;
        Double B = 4d;

        Double result = Calcul.puissance(A,B);

//        assertEquals(result,16d);
        assertThat(result).isEqualTo(16d);
//        fail("erreur puissance");
    }



    @ParameterizedTest(name = "A {0} add B {1}  equals {2}")
    @CsvSource({
            "1.2,2.3,3.5",
            "2.2,,",
            ",2.3,",
            "4.2,2.3,6.5"
    }
    )
    void addParametrized(Double a,Double b ,Double result){

//        assertEquals(result, Calcul.addition(a,b));
        assertThat(result).isEqualTo( Calcul.addition(a,b));
    }


    @ParameterizedTest(name = "A {0} div by B {1}  equals {2}")
    @CsvSource({
            "1.2,2.3,0.5217391304347826",
            "2.2,,",
            ",2.3,",
            "5.3,0,Infinity",
            "4.2,2,2.1"
    }
    )
    void divParametrized(Double a,Double b ,Double result){

//        System.out.println(result);
//        result = Double.POSITIVE_INFINITY;
//
//        Integer test = Integer
//        assertEquals(result, Calcul.division(a,b));
        assertThat(result).isEqualTo( Calcul.division(a,b));

    }


}
