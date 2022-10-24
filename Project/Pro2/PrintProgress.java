package Pro2;

public class PrintProgress {
    static int maxIndex = 50;

    public void begin(){
        StringBuffer kg = new StringBuffer();
        for(int i = 0 ; i < maxIndex ; i++){
            kg.append(" ");
        }
        System.out.print("Calculating:00%[>" + kg.toString() + "]");
        int c = 0;
        while (c < 101){
            printCurrentNum(c++);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void focusGoto(){
        for(int i=maxIndex+6;i>0;i--){
            System.out.print('\b');
        }
    }

    private static void printCurrentNum(int i) {
        String num = "000"+i;
        num = num.substring(num.length()-3);
        StringBuffer s = new StringBuffer(num+"%[");
        focusGoto();
        int prec = (i*100)/100;
        for(int index=0;index<maxIndex;index++){
            int c = (index*100)/maxIndex;
            if(c<prec){
                s.append("■");
            }else{
                s.append(" ");
            }
        }
        s.append("]");
        System.out.print(s.toString());
    }
}
