import java.util.Scanner;

public class AppV1 {
    public static void main(String[] args) throws Exception{
       Scanner entrada = new Scanner(System.in);
 
        Calc c = new Calc();
        double a, b;
        float percent, valor;
        int opc = 0;
          do {
             opc = Menu(entrada);
          
                switch (opc){
                    case 1:
                        System.out.print("Digite o primeiro valor da Soma: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite o segundo valor da Soma: ");
                        b = entrada.nextDouble();
                        System.out.printf("O Resultado é: %.1f\n\n" ,c.Som(a, b));
                            break;
                    case 2:
                        System.out.print("Digite o primeiro valor da Subtração: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite o segundo valor da Subtração: ");
                        b = entrada.nextDouble();
                        System.out.printf("O Resultado é: %.1f\n\n" ,c.Sub(a, b));
                            break;
                    case 3:
                        System.out.print("Digite o primeiro valor da Multiplicação: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite o segundo valor da Multiplicação: ");
                        b = entrada.nextDouble();
                        System.out.printf("O Resultado é: %.1f\n\n" ,c.Mul(a, b));
                        break;
                    case 4:
                        System.out.print("Digite o primeiro valor da Divisão: ");
                        a = entrada.nextDouble();
                        System.out.print("Digite o segundo valor da Divisão: ");
                        b = entrada.nextDouble();
                        if(b==0)
                        System.err.print("Divisor inválido \n\n");
                        else   
                        System.out.printf("O resultado  é: %.1f\n\n" ,c.Div(a, b));
                        break;
                    case 5:
                        System.out.print("Digite a da Porcentagem: ");
                        percent = entrada.nextFloat();
                        System.out.print("Digite o  valor a ser aplicada a Porcentagem: ");
                        valor = entrada.nextFloat();
                        System.out.printf("O Resultado é: %.1f\n\n" ,c.Perc(percent, valor));
                        break;
                    
                        case 6:
                        System.out.print("Até a próxima!");      
                } 
            } 
            while (opc !=6);
    } 
    public static int Menu(Scanner entrada){
        System.out.println("Digite '1' para Somar\n '2' Para subtrair \n '3' Para Multiplicar \n '4' Para Dividir \n '5' Para Porcentagem \n '6' Para Sair");
        int opc = entrada.nextInt();
        return opc;
    }
   }  
