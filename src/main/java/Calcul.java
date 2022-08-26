public class Calcul {


    public static Double addition(Double A, Double B){
        if(A==null || B==null){
            return null;
        }
        return A+B;
    }

    public static Double soustraction(Double A, Double B){
        return A-B;
    }

    public static Double division(Double A, Double B){
        if(A==null || B==null){
            return null;
        }
        return A/B;
    }

    public static Double multiplication(Double A, Double B){
        return A*B;
    }

    public static Double puissance(Double A,Double B){
        return Math.pow(A,B);
    }

    public static  Boolean pair(int a){
        try{
//            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("exception");
        }
        return a%2==0;
    }

}
