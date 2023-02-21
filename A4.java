public class A4 {
    public static void main(String[] args) {
     
        int num1, num2;
        int iCnt=0;
      
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        
        if (num1 < 1 || num1 > 40 || num2 < 1 || num2 > 40) {
            System.out.println("Not Found");
            return;
        }
        else
        {
            for(int i=0;i<args.length;i++) {
                if(Integer.parseInt(args[i])==num1 || Integer.parseInt(args[i])==num2) {
                    iCnt++;
                    break;
                }
                
            }
            if(iCnt==1) {
                System.out.println("It's Bingo !!!");
            }
        }

    }
}


