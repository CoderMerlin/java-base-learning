package com.jdk8.merlin.defaultmethod;

public class MethodTest {

	/**
	 * 由于JVM上的默认方法的实现在字节码层面提供了支持，因此效率非常高。
	 * 默认方法允许在不打破现有继承体系的基础上改进接口。
	 * 该特性在官方库中的应用是：给java.util.Collection接口添加新方法，
	 * 如stream()、parallelStream()、forEach()和removeIf()等等。尽管默认方法有这么多好处，
	 * 但在实际开发中应该谨慎使用：在复杂的继承体系中，默认方法可能引起歧义和编译错误。
	 * @param args
	 */
	public static void main(String[] args) {
		//下面的代码片段整合了默认方法和静态方法的使用场景：
		Defaultable defaultable = DefaultFactory.create(DefaultableImpl::new); 
		System.out.println( defaultable.notRequired());
		
		defaultable = DefaultFactory.create( OverridableImpl::new );
		System.out.println( defaultable.notRequired());
	}
}
