package com.app.pagexe;

import com.app.base.Base;
import com.app.locator.LoginPage_Locator;

public class LoginPageExe extends LoginPage_Locator {

	public static void username(String data) {
		Base.input_text(LoginPage_Locator.getusername(), data);
	}
}
