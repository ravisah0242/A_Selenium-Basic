package ai_Micellaneous;

import org.openqa.selenium.os.WindowsUtils;

public class Kill_Window_Process {

	public static void main(String[] args) {
		WindowsUtils.killByName("Skype.exe");   //Always try go for name;
		WindowsUtils.killPID("");			//PID change in Few Minutes; <----not recommended;
		System.out.println(WindowsUtils.thisIsWindows());
	}

}
