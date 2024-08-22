package Voluntarios;
import java.util.Scanner;
public class volun1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int altura;

        System.out.println("ESCRIBE  UNA ALTURA");
        altura=sc.nextInt();

        for(int i=1; i<=altura; i++){
            if (i<altura){
                System.out.println("*");    
            }else {
                for(int j=1; j<=altura/2+1; j++){
                System.out.print("*");}
            }
        }
             sc.close();
        }

        
    
}
