package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //paso 1 SIMULANDO EL CLIENTE PARA PEDIR DATOS
        Scanner leer = new Scanner(System.in);

        System.out.println("Digita el nombre completo del empleado: ");
        String nombre = leer.nextLine();

        System.out.println("Digita el numero de documento del empleado: ");
        String documento = leer.nextLine();

        System.out.println("Digita el correo del empleado: ");
        String correo = leer.nextLine();

        System.out.println("Digita la direccion del empleado: ");
        String direccion = leer.nextLine();

        System.out.println("Digita el numero de cuenta del empleado: ");
        String numeroCuenta = leer.nextLine();

        System.out.println("Salario mensual del empleado: ");
        double salarioMensual = leer.nextDouble();

        System.out.println("Valor hora extra: ");
        double valorHoraExtra = leer.nextDouble();
        ;

        System.out.println("cantidad horas extra: ");
        Integer cantidadHorasExtra = leer.nextInt();

        //LLAMANDO O SUBSCRIBIENDO CONTRATOS CON LAS FUNCIONES

        Double cesantias = calcular_Cesantias(salarioMensual, 360);
        Double interesesCesantias = calcular_intereses_cesantias(salarioMensual);
        Double primaDervicios = calcular_prima_servicios(salarioMensual, 360);
        Double vacaciones = calcular_vacaciones(salarioMensual);

        Double totalLiquidacion = cesantias + interesesCesantias + primaDervicios + vacaciones;

        System.out.println("Cesantias: $" + cesantias);
        System.out.println("Intereses de cesantias: $" + interesesCesantias);
        System.out.printf("Prima de servicios: $" + primaDervicios);
        System.out.println("Vacaciones: $" + vacaciones);
        System.out.println();


    }

    //FABRICA DE FUNCIONES
    public static Double calcular_Cesantias(Double salarioMensual, Integer diasTrabajados) {
        Double cesantias = salarioMensual * (diasTrabajados / 3600);
        return cesantias;
    }

    public static Double calcular_intereses_cesantias(Double salarioMensual) {
        Double intereses = salarioMensual * 0.12;
        return intereses;
    }

    public static Double calcular_prima_servicios(Double salarioMensual, Integer diasTrabajados) {
        Double prima = salarioMensual * (diasTrabajados / 360);
        return prima;
    }

    public static Double calcular_vacaciones(Double salarioMensual){
        Double vacaciones = salarioMensual*0.5;
        return vacaciones;
    }
}
