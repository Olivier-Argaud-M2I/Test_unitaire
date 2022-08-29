import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParamTest{

    Set<Integer> monSet;

    private HelloWorld hw;

    @BeforeEach
    public void init(){
        this.hw = new HelloWorld();
    }

    @AfterEach
    public void clean(){
        this.hw = null;
    }





    @ParameterizedTest(name = "{0} est pair")
    @ValueSource(ints = {0,2,4,8})
    public void pair(int a){

        Boolean result = Calcul.pair(a);

        assertEquals(result,true);
    }






    @Timeout(1)// si le test prend plus de 1s le test echou
    @ParameterizedTest(name =
        "valeur d entree {0},valeur de sortie {1}"
    )
    @CsvSource({
            "'hello','hello'",
            "'coucou','coucou'",
            "'maxime','boulet'",
            "'olivier','olivier'",
            "'melvin','melvin'",
    })
    public void testParam(String input, String resultat ){
        String resultatObtenu= this.hw.sayHello(input);

        assertEquals(resultat,resultatObtenu);
    }

    @ParameterizedTest(name =
            "valeur d entree {0},valeur de sortie {1}"
    )
    @CsvFileSource(resources = "file.csv")
    public void testParam2(String input, String resultat ){
        String resultatObtenu= this.hw.sayHello(input);

//        assertEquals(resultat,resultatObtenu);
//        assertTrue(resultat.equals(resultatObtenu));
        assertThat(resultatObtenu).isEqualTo(resultat);
//        assertThat(monSet).containsExactlyInAnyOrder(1,2,3,4,5,6);
    }

    @DisplayName(value = "sous ensemble pour test")
    @Nested
    class monSousEnsemble{


        @DisplayName(value = "premier sous ensemble")
        @Test
        public void test1(){
//            assertEquals( hw.coucou(),"coucou");
            assertThat(hw.coucou()).isInstanceOf(String.class);
        }

        @DisplayName(value = "deuxieme sous ensemble")
        @Test
        public void test2(){
            assertEquals( hw.coucou(),"ah que coucou");
        }

        @DisplayName(value = "troisieme sous ensemble")
        @Test
        public void test3(){
//            assertEquals( hw.coucou(),"ah que coucou...   coucou   mwahahahahaha");
            assertThat(hw.coucou()).isInstanceOf(String.class);
        }
    }

}
