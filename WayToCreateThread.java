package com.Multithreading.practice;

public class WayToCreateThread extends Thread{
	public void run()
	{
		System.out.println("My thread is in running state.");
	}
	public static void main(String[] args) {
		WayToCreateThread obj = new WayToCreateThread();
		obj.start();
		
	}

}
