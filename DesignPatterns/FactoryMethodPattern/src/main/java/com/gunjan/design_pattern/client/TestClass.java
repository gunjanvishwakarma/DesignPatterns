package com.gunjan.design_pattern.client;

import com.gunjan.design_pattern.framework.Document;

public class TestClass {

	public static void main(String[] args) {
		MyApplication application = new MyApplication();
		Document document = application.createDocument();
		document.printDescription();
	}
}
