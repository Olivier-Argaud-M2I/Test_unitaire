import models.DataModel;
import services.DataSourceImpl;
import utils.Affichage;
import utils.SaisieConsole;

public class Main {

    public static void main(String[] arg){


        while(true){


            SaisieConsole saisieConsole = new SaisieConsole();
            Affichage.formatLigne("choissez votre operation");
            Affichage.formatLigne(" 1 --- addition");
            Affichage.formatLigne(" 2 --- soustraction");
            Affichage.formatLigne(" 3 --- division");
            Affichage.formatLigne(" 4 --- multiplication");
            Affichage.formatLigne(" 5 --- puissance");
            Integer operation = saisieConsole.entier();

            Affichage.formatLigne("Veuillez saisir votre premier nombre");
            Double a =  saisieConsole.monDouble();
            Affichage.formatLigne("Veuillez saisir votre premier nombre");
            Double b =  saisieConsole.monDouble();

            DataSourceImpl dataSource = new DataSourceImpl(new DataModel(operation,a,b));

            Double result = new Calculatrice(dataSource).retourOperation();

            Affichage.formatLigne("Le resultat de votre "+operation+ " est "+result);

        }




    }



}
