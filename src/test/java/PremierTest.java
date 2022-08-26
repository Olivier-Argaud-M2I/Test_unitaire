import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PremierTest {

    private HelloWorld hw;
    private static Instant debutTest;

    @BeforeEach
    public void init(){
        this.hw = new HelloWorld();
    }

    @AfterEach
    public void clean(){
        this.hw = null;
    }

    @BeforeAll
    public static void intiGlobal(){
        debutTest = Instant.now();
    }
    @AfterAll
    public static void finDesTests(){
        Instant fin = Instant.now();

        System.out.println("Les tests ont mis "+(Duration.between(debutTest,fin).toMillis())+"ms");
    }


    @Test
    void sayHelloTest(){

        //Organiser
        String resultatAttendu = "Hello world";


        //Agir
        String resultatObtenu = this.hw.sayHello();

        //verifier
        assertEquals(resultatAttendu,resultatObtenu);
//        fail("non fonctionnel");
    }









}
