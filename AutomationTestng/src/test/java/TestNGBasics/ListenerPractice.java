package TestNGBasics;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerPractice implements ITestListener{
	public void onTestfailure(ITestResult result) {
		System.out.println("failed"+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped"+result.getName());
	}
	public void onTestStart(ITestResult result) {
		System.out.println("started"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("success"+result.getName());
	}
}
