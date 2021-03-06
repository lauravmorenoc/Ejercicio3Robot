package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio3
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 1, Direction.SOUTH,10);
            estudiante.move();
            countAndPick();
            esparcir();
            estudiante.move();
            countAndPick();
            esparcir();
            estudiante.move();
            countAndPick();
            esparcir();
            estudiante.move();
            countAndPick();
            esparcir();
           

	   /* //Mover una interseccion en el sentido al cual este apuntando el objeto.
            estudiante.move ();
            
            //Girar a la izquierda
            estudiante.turnLeft();
            
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            estudiante.frontIsClear();
            
            //Invocando una funcion
            creacionFuncion(4);
            
            //Toman un Thing
            estudiante.pickThing();
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        } */
}
        public static void turnRight(){
            estudiante.turnLeft(); estudiante.turnLeft(); estudiante.turnLeft();
        }
        public static void moverVariasVeces(int a){
            for(int n=0; n<a; n++){
                estudiante.move();
            }
        }
        public static int cantidad=0;
        public static void countAndPick(){
            while(estudiante.canPickThing()){
                cantidad++;
                estudiante.pickThing();
            }
        }
        
        public static void esparcir(){
            estudiante.turnLeft();
            int help=cantidad;
            while(cantidad>0){
            estudiante.move();
            estudiante.putThing();
            cantidad--;
            }
            estudiante.turnLeft();
            estudiante.turnLeft();
            moverVariasVeces(help);
            estudiante.turnLeft();
        }
      
}
