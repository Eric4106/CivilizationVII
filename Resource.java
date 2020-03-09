/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

public class Resource {
	private String resource;
	private int x, y, amount;
	
	public Resource(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Resource(int x, int y, int resourceId) {
		this.x = x;
		this.y = y;
		this.resource = setResource(resourceId);
	}
	
	public Resource(int x, int y, String resource) {
		this.x = x;
		this.y = y;
		this.resource = resource;
		this.amount = 1;
	}
	
	public Resource(int x, int y, String resource, int amount) {
		this.x = x;
		this.y = y;
		this.resource = resource;
		this.amount = amount;
	}
	
	public String setResource(int resourceId) {
		String resource;
		switch(resourceId) {
		case 0:
			resource = "RESOURCE_IRON";
			break;
		case 1:
			resource = "RESOURCE_HORSE";
			break;
		case 2:
			resource = "RESOURCE_COAL";
			break;
		case 3:
			resource = "RESOURCE_OIL";
			break;
		case 4:
			resource = "RESOURCE_ALUMINUM";
			break;
		case 5:
			resource = "RESOURCE_URANIUM";
			break;
		case 6:
			resource = "RESOURCE_WHEAT";
			break;
		case 7:
			resource = "RESOURCE_COW";
			break;
		case 8:
			resource = "RESOURCE_SHEEP";
			break;
		case 9:
			resource = "RESOURCE_DEER";
			break;
		case 10:
			resource = "RESOURCE_BANANA";
			break;
		case 11:
			resource = "RESOURCE_FISH";
			break;
		case 12:
			resource = "RESOURCE_STONE";
			break;
		case 13:
			resource = "RESOURCE_WHALE";
			break;
		case 14:
			resource = "RESOURCE_PEARLS";
			break;
		case 15:
			resource = "RESOURCE_GOLD";
			break;
		case 16:
			resource = "RESOURCE_SILVER";
			break;
		case 17:
			resource = "RESOURCE_GEMS";
			break;
		case 18:
			resource = "RESOURCE_MARBLE";
			break;
		case 19:
			resource = "RESOURCE_IVORY";
			break;
		case 20:
			resource = "RESOURCE_FUR";
			break;
		case 21:
			resource = "RESOURCE_DYE";
			break;
		case 22:
			resource = "RESOURCE_SPICES";
			break;
		case 23:
			resource = "RESOURCE_SILK";
			break;
		case 24:
			resource = "RESOURCE_SUGAR";
			break;
		case 25:
			resource = "RESOURCE_COTTON";
			break;
		case 26:
			resource = "RESOURCE_WINE";
			break;
		case 27:
			resource = "RESOURCE_INCENSE";
			break;
		case 28:
			resource = "RESOURCE_JEWELRY";
			break;
		case 29:
			resource = "RESOURCE_PORCELAIN";
			break;
		case 30:
			resource = "RESOURCE_COPPER";
			break;
		case 31:
			resource = "RESOURCE_SALT";
			break;
		case 32:
			resource = "RESOURCE_CRAB";
			break;
		case 33:
			resource = "RESOURCE_TRUFFLES";
			break;
		case 34:
			resource = "RESOURCE_CITRUS";
			break;
		case 35:
			resource = "RESOURCE_COCOA";
			break;
		case 36:
			resource = "RESOURCE_NUTMEG";
			break;
		case 37:
			resource = "RESOURCE_CLOVES";
			break;
		case 38:
			resource = "RESOURCE_PEPPER";
			break;
		case 39:
			resource = "RESOURCE_BISON";
			break;
		default:
			System.out.println("Unknown Resource Id at (" + x + ", " + y + ") - Recived: " + resourceId);
			resource = null;
			break;
		}
		return resource;
	}
}
