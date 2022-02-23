
public class App {
    public static void main(String[] args) throws Exception{
       
       Calc c = new Calc();

       System.out.println("A soma é: " + c.Som(1, 2));
       System.out.println("A subtração é: " + c.Sub(2, 2));
       System.out.println("A multiplicação é: " + c.Mul(2, 3));
       System.out.println("A divisao é: " + c.Div(10, 2));
       System.out.println(" A porcentagem é: " + c.Perc(35, 750));
    }    
}  

