import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParamTest{


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
    @ValueSource(ints = {1,2,4,8})
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

        assertEquals(resultat,resultatObtenu);
    }

    @DisplayName(value = "sous ensemble pour test")
    @Nested
    class monSousEnsemble{


        @DisplayName(value = "premier sous ensemble")
        @Test
        public void test1(){
            assertEquals( hw.coucou(),"coucou");
        }

        @DisplayName(value = "deuxieme sous ensemble")
        @Test
        public void test2(){
            assertEquals( hw.coucou(),"ah que coucou");
        }

        @DisplayName(value = "troisieme sous ensemble")
        @Test
        public void test3(){
            assertEquals( hw.coucou(),"ah que coucou...   coucou   mwahahahahaha");
        }
    }

}
