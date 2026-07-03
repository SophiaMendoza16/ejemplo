//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int opcion = 0;

    while (opcion != 5) {

        IO.println("===== CALCULADORA =====");
        IO.println("1. Sumar");
        IO.println("2. Restar");
        IO.println("3. Multiplicar");
        IO.println("4. Dividir");
        IO.println("5. Salir");

        opcion = Integer.parseInt(IO.readln("Seleccione una opción: "));

        if (opcion >= 1 && opcion <= 4) {

            int numero1 = Integer.parseInt(IO.readln("Ingrese el primer valor: "));
            int numero2 = Integer.parseInt(IO.readln("Ingrese el segundo valor: "));

            int resultado;

            switch (opcion) {

                case 1:
                    resultado = numero1 + numero2;
                    IO.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = numero1 - numero2;
                    IO.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = numero1 * numero2;
                    IO.println("Resultado: " + resultado);
                    break;

                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        IO.println("Resultado: " + resultado);
                    } else {
                        IO.println("No se puede dividir para cero.");
                    }
                    break;
            }

        } else if (opcion == 5) {

            IO.println("Gracias por usar la calculadora.");

        } else {

            IO.println("Opción inválida.");
        }

    }
}
