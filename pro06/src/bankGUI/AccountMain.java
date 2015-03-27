package bankGUI;

import dbUnit.DriverProvider;

public class AccountMain {
	public static void main(String[] args) {
		DriverProvider.getDriver();
		new AccountView();
	}
}
