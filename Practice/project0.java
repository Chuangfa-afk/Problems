package Practice;

import javax.swing.JOptionPane;
public class project0 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String input=null;
        int EAmount=0;
        int eAmount=0;
        char ch;


        input=JOptionPane.showInputDialog(null, "Please enter a sentence: ");

        while(!input.equalsIgnoreCase("Stop")){

            for(int checkchar=0;checkchar<input.length();checkchar++) {

                ch=input.charAt(checkchar);

                if(ch=='e') {
                    eAmount++;

                }
                else if(ch=='E')

                    EAmount++;

            }
            
        }
        JOptionPane.showMessageDialog(null," The number of lower case e is: " +eAmount+ "The number of Upper case E is: " + EAmount++);
        input=JOptionPane.showInputDialog(null, "Please enter a sentence or Stop to shut down the program: ");

    }
}