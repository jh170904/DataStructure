package com.doit.ds.chapter01;

public class TimeUtil {
	private long startTime;
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void end() {
		System.out.println("소요시간 : " + (System.currentTimeMillis()-startTime));
	}
}
