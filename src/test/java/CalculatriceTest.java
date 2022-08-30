import models.DataModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
}
