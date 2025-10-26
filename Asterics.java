
public class Asterics {
    public static void main(String[] args) {
    
        int i,j;
        for(i=1;i<=5;i++){            //for row
            for(j=i;j<=5;j++){       // for column             
                System.out.print("  ");
            }    
            for(j=1;j<=i;j++){       // for column             
                System.out.print("* ");                        
            }
            System.out.println();
       

    }
    
}
}