package com.gunjan.design_pattern;
public class TestClass {

	
	public static void main(String[] args) {
		MotifWidgetFactory motifWidgetFactory = new MotifWidgetFactory();
		ScrollBar scrollBar = motifWidgetFactory.createScrollBar();
		Window window = motifWidgetFactory.createWindow();
		PMWidgetFactory pmWidgetFactory = new PMWidgetFactory();
		ScrollBar scrollBar2 =  pmWidgetFactory.createScrollBar();
		Window window2 =  pmWidgetFactory.createWindow();
		
	}

}
