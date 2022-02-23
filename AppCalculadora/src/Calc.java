public class Calc {

    public double a;
    public double b;
    public float percent;
    public float valor;

    public double Som(double a, double b){
        
        return a + b; 
    }

    public double Sub(double a, double b){

        return a - b;
    }
    
    public double Mul(double a, double b){

        return a * b;
    }
    public double Div(double a, double b){

        return a / b;
    }
    public float Perc(float percent, float valor){
        return  (percent*valor) / 100 ;
    }

}
