

//ESTRUCTURAS DE CONTROL

//if (1), else if (los que quieras), else (1)
//< > <= >= == 
//Si hay dos condiciones usamos ==

public class apuntes {

    public static void main(String[] args) {
        
        //if (condicionales o estructuras de seleccion)

        int numero = Integer.parseInt(System.console().readLine("Introduce un numero: "));

        if (numero<=100) {
            System.out.println("El numero es menor o igual que 100");
        }

        //El signo & significa and Y SIEMPRE SE PONEN DOS.
        else if (numero>100 && numero<200) {
            System.out.println("El número está entre 100 y 200");
        }

        //En caso de que no se cumpla la condicion, se pone else.
        else {
            System.out.println("El número es mayor que 200");
        }
    }
}