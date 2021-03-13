/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pressevery.n.time;

import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 *
 * @author abdularahman
 */
public class PressEveryNTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
     try {
      while (true) {
        raduis(3.5);
        Thread.sleep(3 * 1000); // every 3 seconds
        break;
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  
    }
    public static void raduis(double circumference) {
	  Robot bot = null;
  try {
   bot = new Robot();
  } catch (Exception failed) {
   System.err.println("Failed instantiating Robot: " + failed);
  }
  int mask = InputEvent.BUTTON1_DOWN_MASK;
  bot.mouseMove(100, 500);
  bot.mousePress(mask);
  bot.mouseRelease(mask);
  
}
 
}
