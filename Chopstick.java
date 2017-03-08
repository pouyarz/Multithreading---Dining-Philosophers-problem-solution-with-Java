/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pouya
 */
class Chopstick{
    private boolean[] taking={false,false,false,false,false};
    public synchronized void release(){
	Philosopher phi=(Philosopher) Thread.currentThread();
	int Num=phi.Num;
	System.out.format("Philosopher\t%d\treleases Chopstick\n", Num);
	taking[Num]=false;
	taking[((Num+1)%5)]=false;
	notifyAll();
    }
    public synchronized void take(){
	Philosopher phi=(Philosopher) Thread.currentThread();
	int Num=phi.Num;
	while(taking[((Num+1)%5)] || taking[Num]){
            try {wait();} catch (InterruptedException e){}
        }
        System.out.format("Philosopher\t%d\ttakes Chopstick\n", Num);
        taking[Num]=true;
        taking[((Num+1)%5)]=true;
    }
}
