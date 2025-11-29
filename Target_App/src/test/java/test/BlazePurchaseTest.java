package test;

import org.testng.annotations.Test;

import base.BaseTest;
import workflow.PurchaseWorkflow;

public class BlazePurchaseTest extends BaseTest{
	 @Test
	    public void test1() {
	        new PurchaseWorkflow(driver).purchaseEndToEnd("Boston", "Berlin", 2);
	    }

	    @Test
	    public void test2() {
	        new PurchaseWorkflow(driver).purchaseEndToEnd(null, null, null);
	    }

	    @Test
	    public void test3() {
	        new PurchaseWorkflow(driver).purchaseEndToEnd("Boston", "Boston", 1);
	    }

	    @Test
	    public void test4() {
	        new PurchaseWorkflow(driver).purchaseEndToEnd("Paris", "Berlin", 0);
	    }

	    @Test
	    public void test5() {
	        new PurchaseWorkflow(driver).purchaseEndToEnd("Boston", "Rome", 2);
	    }
	}