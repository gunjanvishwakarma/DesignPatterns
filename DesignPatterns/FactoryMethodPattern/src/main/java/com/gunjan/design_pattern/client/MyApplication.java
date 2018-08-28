package com.gunjan.design_pattern.client;

import com.gunjan.design_pattern.framework.Application;
import com.gunjan.design_pattern.framework.Document;

public class MyApplication extends Application {

	public Document createDocument() {
		return new MyDocument();
	}

}
