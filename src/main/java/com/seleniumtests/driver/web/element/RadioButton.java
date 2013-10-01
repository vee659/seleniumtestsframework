package com.seleniumtests.driver.web.element;

import org.openqa.selenium.By;

import com.seleniumtests.controller.Logging;

public class RadioButton extends HtmlElement {

	public RadioButton(String label, By by) {
		super(label, by);
	}

	public RadioButton(String label, String locator) {
		super(label, locator);
	}

	public void check() {
		Logging.logWebStep(null, "check " + toHTML(), false);
		super.click();
	}

	@Override
	public void click() {
		Logging.logWebStep(null, "click on " + toHTML(), false);
		super.click();
	}

	//TODO this code is repeated in other objects (like CheckBox)--there should be an AbstractClickable
	// and an IClickable where this gets specified and implemented
	public boolean isSelected() {
		findElement();
		return element.isSelected();
	}
}