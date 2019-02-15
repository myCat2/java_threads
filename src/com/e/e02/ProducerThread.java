package com.e.e02;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Exchanger;

public class ProducerThread extends Thread{
	private final Exchanger<char[]> exchanger; //交换方法
	private char[] buffer = null; //模仿 缓冲区
	private char index = 0;       //从A 递增的
	private final Random random;   //随机数生成器
	public ProducerThread(Exchanger<char[]> exchanger,char[] buffer, long seed) {
		super("ProducerThread");
		this.exchanger = exchanger;
		this.buffer = buffer;
		this.random = new Random(seed);
	}
	@Override
	public void run() {
		try {
			while(true){
				//向缓冲区填充字符
				for(int i = 0; i<buffer.length; i++){
					
					buffer[i] = nextChar();
					System.out.println(Thread.currentThread().getName() + ": "+buffer[i] +" -> ");
				} 
				//交换缓冲区
				System.out.println(Thread.currentThread().getName() + ": BEFORE exchange");
				buffer = exchanger.exchange(buffer);
				System.out.println(Thread.currentThread().getName() + ": AFTER exchange");
			}	
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	//生成字符
	private char nextChar() throws InterruptedException{
		char c = (char) ('A' + index % 26);
		index ++;
		Thread.sleep(random.nextInt(1000));
		return c;
	}
}
