package com.jdk8.merlin.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


/**
 * 
 * 新的Base64API也支持URL和MINE的编码解码。(Base64.getUrlEncoder() / Base64.getUrlDecoder(), 
 * Base64.getMimeEncoder() / Base64.getMimeDecoder())。
 * @author Merlin
 *
 */
public class Base64s {
	
	public static void main(String[] args) {
		//对Base64编码的支持已经被加入到Java 8官方库中，这样不需要使用第三方库就可以进行Base64编码，例子代码如下：
		final String text = "Base64 finally in Java 8";
		
		final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
		
		System.out.println(encoded);
		
		final String decoded = new String( 
	            Base64.getDecoder().decode( encoded ),
	            StandardCharsets.UTF_8 );
	        System.out.println( decoded );
	}

}