package com.gunjan.design_pattern;
public class TestClass {

	
	public static void main(String[] args) {
		MotifWidgetFactory motifWidgetFactory = new MotifWidgetFactory();
		motifWidgetFactory.createScrollBar();
		motifWidgetFactory.createWindow();
		PMWidgetFactory pmWidgetFactory = new PMWidgetFactory();
		pmWidgetFactory.createScrollBar();
		pmWidgetFactory.createWindow();
		
	}

}
