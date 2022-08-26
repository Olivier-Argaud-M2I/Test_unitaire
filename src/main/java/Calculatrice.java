import utils.Affichage;
import utils.SaisieConsole;

public class Calculatrice {

    public Calculatrice(){


        SaisieConsole saisieConsole = new SaisieConsole();
        Affichage.formatLigne("choissez votre operation");
        Affichage.formatLigne(" 1 --- addition");
        Affichage.formatLigne(" 2 --- soustraction");
        Affichage.formatLigne(" 3 --- division");
        Affichage.formatLigne(" 4 --- multiplication");
        Affichage.formatLigne(" 5 --- puissance");
        Integer operation = saisieConsole.entier();

        switch (operation){
            case 1:{
                Double a = saisie("Veuillez saisir votre premier nombre");
                Double b = saisie("Veuillez saisir votre deuxieme nombre");
                afficheResult("addition",Calcul.addition(a,b));
                break;
            }
            case 2:{
                Double a = saisie("Veuillez saisir votre premier nombre");
                Double b = saisie("Veuillez saisir votre deuxieme nombre");
                afficheResult("soustraction",Calcul.soustraction(a,b));
                break;

            }
            case 3:{
                Double a = saisie("Veuillez saisir votre premier nombre");
                Double b = saisie("Veuillez saisir votre deuxieme nombre");
                afficheResult("division",Calcul.division(a,b));
                break;

            }
            case 4:{
                Double a = saisie("Veuillez saisir votre premier nombre");
                Double b = saisie("Veuillez saisir votre deuxieme nombre");
                afficheResult("multiplication",Calcul.multiplication(a,b));
                break;

            }
            case 5:{
                Double a = saisie("Veuillez saisir votre premier nombre");
                Double b = saisie("Veuillez saisir votre deuxieme nombre");
                afficheResult("puissance",Calcul.puissance(a,b));
                break;

            }
        }





    }

    public Double saisie(String text){
        SaisieConsole saisieConsole = new SaisieConsole();
        Affichage.formatLigne(text);
        return saisieConsole.monDouble();
    }


    public void afficheResult(String operation, Double result){
        Affichage.formatLigne("Le resultat de votre "+operation+ " est "+result);
    }

}
