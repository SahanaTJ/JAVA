package com.xworkz.incomplete.impl;


public class TubeLightImpl implements Switch {

	
	@Override
	public void sOn() {
		System.out.println("TubeLight is Turned Onn....");
	}
	
	@Override
	public void sOff() {
      System.out.println("TubeLight is Turned Off....");
	}
}

