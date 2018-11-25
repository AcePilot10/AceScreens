package com.codygordon.acescreensframework;

import com.codygordon.acescreensframework.controller.BaseScreenController;

public class AceScreens {

	private static AceScreens instance;
	
	private BaseScreenController controller;
	
	public AceScreens(BaseScreenController controller) {
		this.controller = controller;
		instance = this;
	}
	
	public static AceScreens getInstance() {
		return instance;
	}
	
	public BaseScreenController getController() {
		return this.controller;
	}
}