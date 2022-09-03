package Week2;

import java.util.Scanner;

public class ReadKetBoardTest {

    static Scanner scan = new Scanner(System.in);

    public static void main (String[] args){

    }

    private static String readKeyBoard(int limit , boolean blankReturn){
        String line = " ";

        while(scan.hasNextLine()){
            line = scan.nextLine();
            if(line.length() == 0){
                if(blankReturn){
                    return line;
                }

                if(line.length() < 1 || line.length() > limit){
                    System.out.println("Too long!");
                    continue;
                }

                break;
            }

        }
        return line;
    }
}
