package com.jdk8.merlin.typeinference;

public class TypeInference {

	public static void main(String[] args) {
		final Value<String> value = new Value<>();
		//Java 8编译器在类型推断方面有很大的提升，在很多场景下编译器可以推导出某个参数的数据类型，从而
		//参数Value.defaultValue()的类型由编译器推导得出，不需要显式指明。在Java 7中这段代码会有编译错误，除非使用Value.<String>defaultValue()。
		value.getOrDefault( "22", value.defaultValue() );
	}
}
