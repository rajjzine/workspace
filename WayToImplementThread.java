package com.Multithreading.practice;

public class WayToImplementThread implements Runnable{
	public void run()
	{
		System.out.println("My thread is in running state");
	}
	public static void main(String[] args) {
		WayToImplementThread obj = new WayToImplementThread();
		Thread obj1 = new Thread(obj);
		obj1.start();
		
	}

}
