package com.demo.tests;

import com.demo.base.BaseTest;
import com.demo.pages.AmazonHomePage;
import com.demo.utils.ExcelUtil;
import org.testng.annotations.*;

public class AmazonSearchTest extends BaseTest {

    @DataProvider
    public Object[][] getData() throws Exception {
        return ExcelUtil.getData("TestData.xlsx", "Sheet1");
    }

    @Test(dataProvider = "getData")
    public void searchTest(String product) {

        AmazonHomePage page = new AmazonHomePage(driver);
        page.search(product);
    }
}
