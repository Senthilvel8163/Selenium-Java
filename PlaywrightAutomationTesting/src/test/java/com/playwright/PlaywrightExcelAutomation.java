package com.playwright;

import com.microsoft.playwright.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.awt.*;

public class PlaywrightExcelAutomation {
	public static void main(String[] args) throws IOException {
		// Read Excel file
		String filePath = "D:\\senthilvel_backup\\data.xlsx";
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {

			Sheet sheet = workbook.getSheetAt(0);
			Row row = sheet.getRow(1);

			if (row == null || row.getCell(0) == null || row.getCell(1) == null) {
				System.out.println("Invalid or missing data in Excel.");
				return;
			}

		
			String username = row.getCell(0).toString();
			String password = row.getCell(1).toString();

			// Get screen size
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

			// Playwright automation
			try (Playwright playwright = Playwright.create()) {
				Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
				Page page = browser.newPage();
				page.setViewportSize((int) screenSize.getWidth(), (int) screenSize.getHeight());

				page.navigate("https://practicetestautomation.com/practice-test-login/");
				page.fill("#username", username);
				page.fill("#password", password);
				page.click("#submit");

				// Keep the browser open
				System.out.println("Press Enter to close the browser.");
				System.in.read();

				browser.close();
			}
		}
	}
}
