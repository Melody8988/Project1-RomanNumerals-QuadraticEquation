public class QuadraticRoots {
    public static void main (String[] args) {
        double valUnderRoot, valOfRoot, x; 

        double valueA = TextIO.getDouble();
        double valueB = TextIO.getDouble();
        double valueC = TextIO.getDouble();

        // valUnderRoot =  (Math.pow(valueB,2) - (4 * valueA * valueC));


        System.out.println("a = " + valueA + ", " + "b = " + valueB + ", " + "c = " + valueC);

        valUnderRoot =  Math.pow(valueB,2) - (4 * valueA * valueC);

        valOfRoot =  Math.sqrt(valUnderRoot);


        if (valUnderRoot < 0 ){
            System.out.println("The equation has 0 real roots because value under root is " + valUnderRoot);
        }
        else if (valUnderRoot > 0 ){
            System.out.println("Value under root is: " + valUnderRoot);
            x = ((-1 * valueB) + valOfRoot)/(2 * valueA);
            System.out.println("Root = " + x);
        }

        else if (valUnderRoot > 0 && valOfRoot < 0 ) {
            x = ((-1 * valueB) - valOfRoot)/(2 * valueA);
            System.out.println("Root = " + x);
        }

       

    }
}