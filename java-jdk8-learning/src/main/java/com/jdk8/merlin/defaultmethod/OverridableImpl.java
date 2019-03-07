package com.jdk8.merlin.defaultmethod;

public class OverridableImpl implements Defaultable{

	@Override
	public String notRequired(){
		return "Overridden implementation";
	}
}
