package temperatura_loop;
import java.util.Scanner;
public class Temperatura_Loop {
    public static void main(String[] args) {
        Scanner entrada;
        
        double c, f, i;
        
        entrada = new Scanner(System.in);
        System.out.print("Digite sua temperatura em Celsius: ");
        c = entrada.nextDouble();
        
        f = c *1.8 + 32;
        System.out.println("A temperatura em fahreinheit é: " + f);
        i = f;
        
       while(i<=100)
       {
           i += 10;
           if(i<=100)
           System.out.println(i);
       }
        
    }
    
}
