package com.gunjan.design_pattern;
public class PMWidgetFactory implements WidgetFactory {

	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

	public Window createWindow() {
		return new PMWindow();
	}

}
