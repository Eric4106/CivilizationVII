/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

public class Feature {
	private String feature, drawableFeature;
	private int x, y;
	
	public Feature(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Feature(int x, int y, int featureId) {
		this.x = x;
		this.y = y;
		this.feature = setFeature(featureId);
	}
	
	public Feature(int x, int y, String feature) {
		this.x = x;
		this.y = y;
		this.feature = feature;
	}
	
	public String setFeature(int featureId) {
		String feature;
		switch(featureId) {
		case 0:
			feature = "FEATURE_ICE";
			drawableFeature = "Ice";
			break;
		case 1:
			feature = "FEATURE_JUNGLE";
			drawableFeature = "Jungle";
			break;
		case 2:
			feature = "FEATURE_MARSH";
			drawableFeature = "Marsh";
			break;
		case 3:
			feature = "FEATURE_OASIS";
			drawableFeature = "Oasis";
			break;
		case 4:
			feature = "FEATURE_FLOOD_PLAINS";
			drawableFeature = "Flood Plains";
			break;
		case 5:
			feature = "FEATURE_FOREST";
			drawableFeature = "Forest";
			break;
		case 6:
			feature = "FEATURE_FALLOUT";
			drawableFeature = "Fallout";
			break;
		case 7:
			feature = "FEATURE_CRATER";
			drawableFeature = "Barringer Crater";
			break;
		case 8:
			feature = "FEATURE_FUJI";
			drawableFeature = "Mt. Fuji";
			break;
		case 9:
			feature = "FEATURE_MESA";
			drawableFeature = "Grand Mesa";
			break;
		case 10:
			feature = "FEATURE_REEF";
			drawableFeature = "Great Barier Reef";
			break;
		case 11:
			feature = "FEATURE_VOLCANO";
			drawableFeature = "Mt. Killimanjaro";
			break;
		case 12:
			feature = "FEATURE_GIBRALTAR";
			drawableFeature = "Gibraltar";
			break;
		case 13:
			feature = "FEATURE_GEYSER";
			drawableFeature = "Geyser";
			break;
		case 14:
			feature = "FEATURE_FOUNTAIN_YOUTH";
			drawableFeature = "Fountain of Youth";
			break;
		case 15:
			feature = "FEATURE_POTOSI";
			drawableFeature = "Potosi";
			break;
		case 16:
			feature = "FEATURE_EL_DORADO";
			drawableFeature = "El Dorado";
			break;
		case 17:
			feature = "FEATURE_ATOLL";
			drawableFeature = "Atoll";
			break;
		case 18:
			feature = "FEATURE_SRI_PADA";
			drawableFeature = "Sri Pada";
			break;
		case 19:
			feature = "FEATURE_MT_SINAI";
			drawableFeature = "Mt. Sinai";
			break;
		case 20:
			feature = "FEATURE_MT_KAILASH";
			drawableFeature = "Mt. Kilash";
			break;
		case 21:
			feature = "FEATURE_ULURU";
			drawableFeature = "Uluru";
			break;
		case 22:
			feature = "FEATURE_LAKE_VICTORIA";
			drawableFeature = "Lake Victoria";
			break;
		case 23:
			feature = "FEATURE_KILIMANJARO";
			drawableFeature = "Kilimanjaro";
			break;
		case 24:
			feature = "FEATURE_SOLOMONS_MINES";
			drawableFeature = "Solomon's Mines";
			break;
		default:
			System.out.println("Unknown Feature Id at (" + x + ", " + y + ") - Recived: " + featureId);
			feature = null;
			drawableFeature = "null";
			break;
		}
		return feature;
	}

	public void setYeilds() {
		switch(feature) {
		case "FEATURE_ICE":
			break;
		case "FEATURE_JUNGLE":
			break;
		case "FEATURE_MARSH":
			break;
		case "FEATURE_OASIS":
			break;
		case "FEATURE_FLOOD_PLAINS":
			break;
		case "FEATURE_FOREST":
			break;
		case "FEATURE_FALLOUT":
			break;
		case "FEATURE_CRATER":
			break;
		case "FEATURE_FUJI":
			break;
		case "FEATURE_MESA":
			break;
		case "FEATURE_REEF":
			break;
		case "FEATURE_VOLCANO":
			break;
		case "FEATURE_GIBRALTAR":
			break;
		case "FEATURE_GEYSER":
			break;
		case "FEATURE_FOUNTAIN_YOUTH":
			break;
		case "FEATURE_POTOSI":
			break;
		case "FEATURE_EL_DORADO":
			break;
		case "FEATURE_ATOLL":
			break;
		case "FEATURE_SRI_PADA":
			break;
		case "FEATURE_MT_SINAI":
			break;
		case "FEATURE_MT_KAILASH":
			break;
		case "FEATURE_ULURU":
			break;
		case "FEATURE_LAKE_VICTORIA":
			break;
		case "FEATURE_KILIMANJARO":
			break;
		case "FEATURE_SOLOMONS_MINES":
			break;
		default:
			System.out.println("Unknown Feature at (" + x + ", " + y + ") - Recived: " + feature);
			break;
		}
	}
    
    public String getFeature() {
        return feature;
    }
    
    public String getDrawableFeature() {
        return drawableFeature;
    }
}
