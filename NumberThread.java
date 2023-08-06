package threadprojec;
import java.util.*;
import java.io.*;
import java.lang.Thread;
public class NumberThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep((int)Math.random()*10000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
