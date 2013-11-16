package com.webssky.jcseg.test;

import com.webssky.jcseg.util.dic.STConverter;

public class STConverterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Jcseg中文分词器, java是一门很好的编程语言.";
		System.out.println("str = " + str);
		
		String tra = STConverter.SimToTraditional(str);
		System.out.println("Simplified to traditional: " + tra);
		
		String sim = STConverter.TraToSimplified(tra);
		System.out.println("Traditional to simplified: " + sim);
	}
}
