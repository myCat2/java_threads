package com.e.e01;

import java.util.Random;

public class MakerThread extends Thread{
	private final Random random;
	private final Table table;
	private static int id = 0;
	public MakerThread(String name, Table table, long seed){
		super(name);
		this.table = table;
		this.random = new Random(seed);
		
	}
	public void run(){
		try {
			while(true){
				Thread.sleep(random.nextInt(1000));
				String cake = "[ Cake No." + nextId() +" by " +getName() + " ] ";
				table.put(cake);
			}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	private static synchronized int nextId(){
		return id++;
	}

}
