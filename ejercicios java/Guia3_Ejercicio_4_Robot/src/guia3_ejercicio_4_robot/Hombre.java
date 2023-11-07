package guia3_ejercicio_4_robot;

import java.util.Scanner;

public class Hombre {

    private Robot robot1;

    public Hombre(Robot robot1) {
        this.robot1 = robot1;
    }

    public Robot getRobot1() {
        return robot1;
    }

    public void setRobot1(Robot robot1) {
        this.robot1 = robot1;
    }

    public void jugarConRobot(Robot robot) {
        if (!robot.getReposo()){
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println("La energía actual del robot es: " + robot.energiaActual());
        robot.dormir();
        }
    }
    
    public void jugarConRobot(Robot robot, int pasos,String letra) {
       switch (letra.toUpperCase())
       {
        case "A":
            robot.avanzar(pasos);
            break;
        case "R":
            robot.retroceder(pasos);
            break;
        case "D":
            robot.dormir();
            break;
        default:
            System.out.println("Acción inválida");
    }
    System.out.println("La energía actual del robot es: " + robot.energiaActual());
    
}
}
// jugarConRobot(robot1, 100, R)