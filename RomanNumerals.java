// This program takes an input and determines the 
// roman numeral conversion for values in the range of 1-10. 
// Any other values give a message that the input is out of range for this program.

class RomanNumerals {
    public static void main(String[] args) {

        int myVar = TextIO.getInt();
        String romanVar;

        //Identify each number to a string of roman numeral
        if (myVar == 1) {
            romanVar = "I";
        } else if (myVar == 2) {
            romanVar = "II";
        } else if (myVar == 3) {
            romanVar = "III";
        } else if (myVar == 4) {
            romanVar = "IV";
        } else if (myVar == 5) {
            romanVar = "V";
        } else if (myVar == 6) {
            romanVar = "VI";
        } else if (myVar == 7) {
            romanVar = "VII";
        } else if (myVar == 8) {
            romanVar = "VIII";
        } else if (myVar == 9) {
            romanVar = "IX";
        } else if (myVar == 10) {
            romanVar = "X";

        //Out of range cases
        } else {
            romanVar = "invalid, please input a number from 1-10 for this program ";
        }

        //Final message 
        System.out.println("Your input " + myVar + " in roman numerals is " + romanVar);
    }
}