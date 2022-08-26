import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PremierTest {


    @Test
    void sayHelloTest(){

        //Organiser
        String resultatAttendu = "Hello world";
        HelloWorld hw = new HelloWorld();

        //Agir
        String resultatObtenu = hw.sayHello();

        //verifier
        assertEquals(resultatAttendu,resultatObtenu);
//        fail("non fonctionnel");
    }









}
