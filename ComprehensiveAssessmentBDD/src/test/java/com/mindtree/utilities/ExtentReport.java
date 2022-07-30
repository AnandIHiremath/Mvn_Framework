package com.mindtree.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	public void extentReport() {
		htmlReporter = new ExtentSparkReporter(new File(System.getProperty("user.dir") + "/Reports/Report"+ ScreenShotCapture.getCurrentDataTime() + ".html"));
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("Mindtree");

	}
}
