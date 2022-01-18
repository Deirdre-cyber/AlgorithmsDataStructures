package lab1.q1;

import javax.swing.*;

public class TestMyMath {

    public static void main(String[] args) {

        int choice = 0;
        String choiceAsString = JOptionPane.showInputDialog("""
                Choose which test you would like to perform

                1 - Find Smallest Number
                2 - Calculate Power
                3 - Find sum of numbers from 1 to n
                4 - Calculate n!
                5 - Test if number if prime number""");

        if(!choiceAsString.isEmpty()){
            choice = Integer.parseInt(choiceAsString);
        }
        else {
            JOptionPane.showMessageDialog(null, "Must enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        switch (choice) {
            case 1 -> {
                //do error check
                int numX, numY, numZ;
                numX = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
                numY = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
                numZ = Integer.parseInt(JOptionPane.showInputDialog("Enter Third Number"));

                JOptionPane.showMessageDialog(null, "The answer is: " + MyMath.findSmallestOf(numX, numY, numZ), "Smallest Number", JOptionPane.INFORMATION_MESSAGE);
            }
            case 2 -> {
                String powerAsString, baseAsString;
                int base, power;

                baseAsString = JOptionPane.showInputDialog("Enter base number");
                powerAsString = JOptionPane.showInputDialog("Enter power number");

                if(powerAsString.isEmpty() || baseAsString.isEmpty()){
                    JOptionPane.showMessageDialog(null, "You must enter two valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {

                    base = Integer.parseInt(baseAsString);
                    power = Integer.parseInt(powerAsString);

                    if(power > 0){
                        JOptionPane.showMessageDialog(null, "The answer is: " + MyMath.powerOf(base, power), "Power", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Power number must be a positive number", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

            case 3 -> {
                String numAsString = JOptionPane.showInputDialog("Enter a number");//n must be >=1
                int num;

                if(!numAsString.isEmpty()){

                    num = Integer.parseInt(numAsString);

                    if(num >= 1){
                        JOptionPane.showMessageDialog(null, "The answer is: " + MyMath.sumOfNumbersFromOneTo(num));
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Number must be greater than or equal to 1", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Must enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
            case 4 -> {
                String numAsString = JOptionPane.showInputDialog("Enter a number");
                int num;

                if(!numAsString.isEmpty()){

                    num = Integer.parseInt(numAsString);

                    if(num >= 0){
                        JOptionPane.showMessageDialog(null, "The answer is: " + MyMath.getMultipleOf(num));
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Number must be greater than or equal to 0", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Must enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
            case 5 -> {

                String numAsString = JOptionPane.showInputDialog("Enter a number");
                int num;

                if(!numAsString.isEmpty()) {

                    num = Integer.parseInt(numAsString);

                    if(MyMath.isPrimeNumber(num)){
                        JOptionPane.showMessageDialog(null, "The number "  + num + " is a prime number");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "The number "  + num + " is not a prime number");
                }
                else
                    JOptionPane.showMessageDialog(null, "Must enter valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
            default -> JOptionPane.showMessageDialog(null, "You did not enter a choice", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
