package com.gunjan.design_pattern;
public class MotifWidgetFactory implements WidgetFactory {

	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	public Window createWindow() {
		return new MotifWindow();
	}

}
