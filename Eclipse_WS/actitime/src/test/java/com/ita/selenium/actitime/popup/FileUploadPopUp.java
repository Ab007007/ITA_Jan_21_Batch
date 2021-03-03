package com.ita.selenium.actitime.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class FileUploadPopUp {

	static {
		try 
		{
			Runtime.getRuntime().exec("D:\\ITA\\ITAutomation_Jan_21_Batch\\autoIT\\fileDownloadpopUp.exe");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/fileupload");
		ActitimeUtils.click("id", "file-upload-field");
		
		
	}
}
