package com.d;

import java.io.IOException;

public class SaverThread extends Thread{

	private final Data data;
	public SaverThread(String name ,Data data){
		super(name);
		this.data = data;
	}
	public void run(){
			try {
				while(true){
					data.save();       //要求保存数据
					Thread.sleep(1000); //休眠约1s
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
