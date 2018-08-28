package com.gunjan.design_pattern.framework;

abstract public class Application {
    public abstract Document createDocument();

    public void newDocument() {
        Document document = createDocument();
    }

    public void openDocument() {

    }
}
