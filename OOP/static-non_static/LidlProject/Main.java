class Main
{
	private static Lidl lidl = new Lidl();

	public static void main(String[] args) 
	{
		lidl.branch = "rodelheim";
		lidl.branchCode = "R1";
		lidl.address = "Lorscher str.47";
		lidl.openTimings = "8-9";

		lidl.product = new Products();

		lidl.product.veg = new Vegitable[1];
		lidl.product.veg[0] = new Vegitable();
		lidl.product.veg[0].name = "palak";
		lidl.product.veg[0].code = "p14466864";
		lidl.product.veg[0].expDate = "07.sept.2022";
		lidl.product.veg[0].isBio = true;
		lidl.product.veg[0].pricesPerKg=2.89;
		lidl.product.veg[0].pricePerStuk=0.02;
		lidl.product.veg[0].price=1.23;
		lidl.product.veg[0].weight=500;
		lidl.product.veg[0].type="green veg";
		
		lidl.product.dairyP = new DairyProducts[1];
		lidl.product.dairyP[0] = new DairyProducts();
		lidl.product.dairyP[0].name = "milk";
		lidl.product.dairyP[0].type = "3.5fat";
		lidl.product.dairyP[0].code = "m3445";
		lidl.product.dairyP[0].expDate ="19.09.2022";
		lidl.product.dairyP[0].bio = false;
		lidl.product.dairyP[0].price = 1.45;
		lidl.product.dairyP[0].weight = 1;
		lidl.product.dairyP[0].maxTepToMaintainInCelcious = 4;
		lidl.product.dairyP[0].minTepToMaintainInCelcious = 1;
		lidl.product.dairyP[0].haltungFarm = 1;

		System.out.println("lidl Info:"+lidl);
		System.out.println("lidLBranch: \t\t\t"+lidl.branch);
		System.out.println("lidlBranchCode: \t\t"+lidl.branchCode);
		System.out.println("lidlAddress>\t\t\t"+lidl.address);
		System.out.println("lidlTimings: \t\t\t"+lidl.openTimings);

		System.out.println("LidlProduct Info :");
		System.out.println("lidlProductName: \t\t"+lidl.product.veg[0].name);
		System.out.println("lidlProductVegCode: \t\t"+lidl.product.veg[0].code);
		System.out.println("lidlProductVegExpDate: \t\t"+lidl.product.veg[0].expDate);
		System.out.println("lidlProductVegIsBio: \t\t"+lidl.product.veg[0].isBio);
		System.out.println("lidlProductVegPricesPerKg: \t"+lidl.product.veg[0].pricesPerKg);
		System.out.println("lidlProductVegPricePerStuk: \t"+lidl.product.veg[0].pricePerStuk);
		System.out.println("lidlProductVegPrice: \t\t"+lidl.product.veg[0].price);
		System.out.println("lidlProductVegWeight: \t\t"+lidl.product.veg[0].weight);
		System.out.println("lidlProductVegType: \t\t"+lidl.product.veg[0].type);

		System.out.println();
		System.out.println("lidlDairyProductName: \t\t\t\t"+lidl.product.dairyP[0].name);
		System.out.println("lidlDairyProduct Type: \t\t\t\t"+lidl.product.dairyP[0].type);
		System.out.println("lidlDairyProduct Code: \t\t\t\t"+lidl.product.dairyP[0].code);
		System.out.println("lidlDairyProduct ExpDate: \t\t\t"+lidl.product.veg[0].expDate);
		System.out.println("lidlDairyProduct IsBio: \t\t\t"+lidl.product.dairyP[0].bio);
		System.out.println("lidlDairyProduct Price: \t\t\t"+lidl.product.dairyP[0].price);
		System.out.println("lidlDairyProduct Weight: \t\t\t"+lidl.product.dairyP[0].weight);
		System.out.println("lidlDairyProduct MaxTepToMaintainInCelcious:\t"+lidl.product.dairyP[0].maxTepToMaintainInCelcious);
		System.out.println("lidlDairyProduct MinTepToMaintainInCelcious:\t"+lidl.product.dairyP[0].minTepToMaintainInCelcious);
		System.out.println("lidlDairyProduct haltungFarm"+lidl.product.dairyP[0].haltungFarm);
		//System.out.println(""+);

	}
}
	