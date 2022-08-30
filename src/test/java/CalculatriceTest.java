import models.DataModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import services.DataSourceImpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class CalculatriceTest {

    @Mock
    DataSourceImpl dataSource;



    @Test
    public void testAdd(){
        //GIVEN
        when(dataSource.getData()).thenReturn(new DataModel(1,2.7,1.8));


        //WHEN
        Double result = new Calculatrice(dataSource).retourOperation();


        //THEN
        verify(dataSource,times(3)).getData();
        assertThat(result).isEqualTo(4.5);

    }

    @Test
    public void testSous(){
        //GIVEN
        when(dataSource.getData()).thenReturn(new DataModel(2,2.7,1.8));


        //WHEN
        Double result = new Calculatrice(dataSource).retourOperation();


        //THEN
        verify(dataSource,times(3)).getData();
        assertThat(result).isEqualTo(0.9);

    }



    @ParameterizedTest(name =
            "valeur d operation {0} {1}, A {2} , B {3} , result{4}"
    )
    @CsvSource({
            "3,'division',2.0,4.0,0.5",
            "4,'multiplication',2.0,4.0,8.0",
            "5,'puissance',2.0,2.0,4.0"
    })
    public void testParam(Integer operation,String oper,Double A, Double B , Double resultAttendu ){
        //GIVEN
        when(dataSource.getData()).thenReturn(new DataModel(operation,A,B));


        //WHEN
        Double result = new Calculatrice(dataSource).retourOperation();


        //THEN
        verify(dataSource,times(3)).getData();
        assertThat(result).isEqualTo(resultAttendu);
    }
}
