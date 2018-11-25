package com.codygordon.acescreensframework.controller;

import com.codygordon.acescreensframework.view.AceContainer;
import com.codygordon.acescreensframework.view.AceScreen;

public class BaseScreenController {
	
	private AceContainer container;
	private AceScreen currentScreen;
	
	public BaseScreenController(AceContainer container) {
		this.container = container;
	}
	
	public void showScreen(AceScreen screen) {
		container.getContentPane().removeAll();
		container.getContentPane().add(screen);
		container.getContentPane().repaint();
		container.getContentPane().revalidate();
		if(!container.isVisible()) container.setVisible(true);
		screen.setVisible(true);
		this.currentScreen = screen;
	}
	
	public AceScreen getCurrentScreen() {
		return this.currentScreen;
	}
	
	public AceContainer getContainer() {
		return this.container;
	}
}