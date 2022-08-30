import services.DataSourceImpl;
import utils.Affichage;
import utils.SaisieConsole;

public class Calculatrice {

    private Integer operation;
    private Double a;
    private Double b;

    public Calculatrice(DataSourceImpl dataSource) {
        this.operation = dataSource.getData().getOperation();
        this.a = dataSource.getData().getA();
        this.b = dataSource.getData().getB();
    }

    public Double retourOperation(){

        switch (operation){
            case 1:{
                return Calcul.addition(a,b);
            }
            case 2:{
                return Calcul.soustraction(a,b);
            }
            case 3:{
                return Calcul.division(a,b);
            }
            case 4:{
                return Calcul.multiplication(a,b);
            }
            case 5:{
                return Calcul.puissance(a,b);
            }
        }

        return null;
    }




}
