public class Calculadora {
    public static double numeroUno = 10;
    public static double numeroDos = 0;
    public static int contador = 0;

    public static double sumar(){
        return numeroUno + numeroDos;
    }

    public static double restar(int n1, int n2){
        return n1 - n2;
    }

    public static void multiplcar(){
        System.out.println(numeroUno * numeroDos);
    }

    public static double dividir(){
        if(numeroDos == 0){
            System.out.println("No se puede dividir entre cero");
            return 0;
        }else{
            return numeroUno / numeroDos;
        }
    }

    public static int contar(){
        contador++;
        return contador;
    }

    public void saludar (){
        System.out.println("Carlos");
    }
}
