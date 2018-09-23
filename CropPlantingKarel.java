/*
 * File: CropPlantingKarel.java
 * Karel plants crops according to a plan laid out using different 
 * colors in the left-hand column of the world.
 */

import stanford.karel.*;

public class CropPlantingKarel extends SuperKarel {
	public void run() { 
		while(true){
        decidePlant();
		goBack();
		turnRight();
		if(frontIsClear()){ 
		move();
		turnRight();
		}
		
		}
		
	}
    
   private void decidePlant(){
   	if(cornerColorIs(GREEN)){ 
   		plantSoyBeans();
   	}else if (cornerColorIs(YELLOW)){
       plantCorn();
   	}else{
      // do nothing 
   	}
   }
   private void plantSoyBeans(){
   	while (frontIsClear()){
   		putBeeper();
   		putBeeper();
   		move();
	   }
	   putBeeper();
	   putBeeper();
   }
   private void plantCorn(){
   	while (frontIsClear()){
   		putBeeper();
   		move();
	   }
	   putBeeper();
   }
   private void goBack(){
   	turnAround();
   	while(frontIsClear()){
   		move();
   	}
   }

}

