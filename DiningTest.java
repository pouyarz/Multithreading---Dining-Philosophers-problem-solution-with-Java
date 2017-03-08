/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pouya
 */
public class DiningTest {
    public static void main(String[] args){
		
        Chopstick CH = new Chopstick();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
    }
}
