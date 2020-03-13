/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Sprite {
	public class Yeilds {
		private int food, production, gold, science, faith, tourism, culture, happiness;
	}
	
	private static final int width = 50;
	private static final int height = 50;
	private String terain;
	private boolean hill;
	private Color color;
	private Feature feature;
	private Resource resource;
	
	public Tile(int x, int y) {
		super(x, y);
		this.terain = "TERAIN_GRASS";
		this.hill = false;
		this.color = setColor();
        this.feature = createFeature();
        this.resource = createResource();
	}

	public Tile(int x, int y, int terainId) {
		super(x, y);
		this.terain = setTerain(terainId);
		this.color = setColor();
        this.feature = createFeature();
        this.resource = createResource();
	}
	
	public Tile(int x, int y, String terain) {
		super(x, y);
		this.terain = terain;
		this.color = setColor();
        this.feature = createFeature();
        this.resource = createResource();
	}
	
	public String setTerain(int terainId) {
		String terain;
		switch(terainId) {
		case 0:
			terain = "TERAIN_GRASS";
			break;
		case 1:
			terain = "TERAIN_PLAINS";
			break;
		case 2:
			terain = "TERAIN_DESERT";
			break;
		case 3:
			terain = "TERAIN_TUNDRA";
			break;
		case 4:
			terain = "TERAIN_SNOW";
			break;
		case 5:
			terain = "TERAIN_COAST";
			break;
		case 6:
			terain = "TERAIN_OCEAN";
			break;
		case 7:
			terain = "TERAIN_MOUNTAINS";
			break;
		default:
			System.out.println("Unknown Terain Id at (" + super.getX() + ", " + super.getY() + ") - Recived: " + terainId);
			terain = null;
			break;
		}
		return terain;
	}
	
	public Color setColor() {
		Color color;
		switch(terain) {
		case "TERAIN_GRASS":
			color = new Color(20, 200, 60);
			break;
		case "TERAIN_PLAINS":
			color = new Color(180, 220, 60);
			break;
		case "TERAIN_DESERT":
			color = new Color(240, 240, 140);
			break;
		case "TERAIN_TUNDRA":
			color = new Color(120, 120, 120);
			break;
		case "TERAIN_SNOW":
			color = new Color(220, 240, 255);
			break;
		case "TERAIN_COAST":
			color = new Color(100, 200, 255);
			break;
		case "TERAIN_OCEAN":
			color = new Color(20, 0, 140);
			break;
		case "TERAIN_MOUNTAINS":
			color = new Color(140, 80, 0);
			break;
		default:
			System.out.println("Unknown Terain at (" + super.getX() + ", " + super.getY() + ") - Recived: " + terain);
			color = new Color(0, 0, 0);
			break;
		}
		return color;
	}

	public String getTerain() {
		return terain;
	}
	
	public void generateHills() {
		if (!(getTerain().equals("TERAIN_OCEAN") || getTerain().equals("TERAIN_COAST") || getTerain().equals("TERAIN_MOUNTAINS"))) {
			if (Math.random() < .2) {
				if (getTerain().equals("TERAIN_SNOW")) {
					if (Math.random() < .33) {
						this.hill = true;
					}
					else {
						this.hill = false;
					}
				}
				else {
					this.hill = true;
				}
			}
			else {
				this.hill = false;
			}
		}
		else {
			this.hill = false;
		}
	}
    
    public Feature createFeature() {
        Feature feature = null;
		switch(terain) {
		case "TERAIN_GRASS":
            if (Math.random() < .40) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_FOREST");
            }
            else if (Math.random() < .33) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_JUNGLE");
            }
            else if (Math.random() < .25) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_MARSH");
            }
			break;
		case "TERAIN_PLAINS":
            if (Math.random() < .5) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_FOREST");
            }
			break;
		case "TERAIN_DESERT":
            if (Math.random() < .1) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_OASIS");
            }
            else if (Math.random() < .37) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_FLOOD_PLAINS");
            }
			break;
		case "TERAIN_TUNDRA":
            if (Math.random() < .66) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_FOREST");
            }
			break;
		case "TERAIN_SNOW":
            feature = null;
			break;
		case "TERAIN_COAST":
            if (Math.random() < .15) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_ATOLL");
            }
			break;
		case "TERAIN_OCEAN":
            if (Math.random() < .1) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_ATOLL");
            }
            else if (Math.random() < .17) {
                feature = new Feature(super.getX(), super.getY(), "FEATURE_ATOLL");
            }
			break;
		case "TERAIN_MOUNTAINS":
            feature = null;
			break;
		default:
			System.out.println("Unknown Terain at (" + super.getX() + ", " + super.getY() + ") - Recived: " + terain);
            feature = null;
			break;
		}
        return feature;
    }
    
    public Resource createResource() {
        Resource resource = null;
        if (hill) {
            switch(terain) {
            case "TERAIN_GRASS":
                break;
            case "TERAIN_PLAINS":
                break;
            case "TERAIN_DESERT":
                break;
            case "TERAIN_TUNDRA":
                break;
            case "TERAIN_SNOW":
                break;
            case "TERAIN_COAST":
                break;
            case "TERAIN_OCEAN":
                break;
            case "TERAIN_MOUNTAINS":
                break;
            default:
                System.out.println("Unknown Terain at (" + super.getX() + ", " + super.getY() + ") - Recived: " + terain);
                resource = null;
                break;
            }
        }
        else {
            switch(terain) {
            case "TERAIN_GRASS":
                break;
            case "TERAIN_PLAINS":
                break;
            case "TERAIN_DESERT":
                break;
            case "TERAIN_TUNDRA":
                break;
            case "TERAIN_SNOW":
                break;
            case "TERAIN_COAST":
                break;
            case "TERAIN_OCEAN":
                break;
            case "TERAIN_MOUNTAINS":
                break;
            default:
                System.out.println("Unknown Terain at (" + super.getX() + ", " + super.getY() + ") - Recived: " + terain);
                resource = null;
                break;
            }
        }
        return resource;
    }

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(super.getX() * width, super.getY() * height, width, height);
		
		if (getTerain().equals("TERAIN_MOUNTAINS")) {
			g.setColor(new Color(0, 0, 0));
			int sideMargin = 10;
			int topMargin = 10;
			int bottomMargin = 5;
			int[] xPoints = new int[3];
			xPoints[0] = (super.getX() * width) + sideMargin;
			xPoints[1] = (super.getX() * width) + width / 2;
			xPoints[2] = (super.getX() * width) + width - sideMargin;
			int[] yPoints = new int[3];
			yPoints[0] = (super.getY() * height) + height - bottomMargin;
			yPoints[1] = (super.getY() * height) + topMargin;
			yPoints[2] = (super.getY() * height) + height - bottomMargin;
			g.fillPolygon(xPoints, yPoints, 3);
		}
		if (hill) {
			g.setColor(new Color(0, 0, 0));
			int sideMargin = 10;
			int topMargin = 25;
			int bottomMargin = 3;
			int[] xPoints = new int[3];
			xPoints[0] = (super.getX() * width) + sideMargin;
			xPoints[1] = (super.getX() * width) + width / 2;
			xPoints[2] = (super.getX() * width) + width - sideMargin;
			int[] yPoints = new int[3];
			yPoints[0] = (super.getY() * height) + height - bottomMargin;
			yPoints[1] = (super.getY() * height) + topMargin;
			yPoints[2] = (super.getY() * height) + height - bottomMargin;
			g.fillPolygon(xPoints, yPoints, 3);
		}
        
        if (feature != null) {
            g.setColor(new Color(0, 0, 0));
            try {
            g.drawString(feature.getFeature(), (super.getX() * width) + 5, (super.getY() * height) + 25);
            }
            catch(Exception NullPointerException) {}
        }
	}
	
	public void printInfo() {
		System.out.print("(" + super.getX() + ", " + super.getY() + ")");
        System.out.print(" - Type: " + terain);
        System.out.print(" - Hill: " + hill);
        if (feature != null) {
            System.out.print(" - Feature: " + feature.getFeature());
        }
        else {
            System.out.print(" - Feature: null");
        }
        if (resource != null) {
            System.out.print(" - Feature: " + resource.getResource());
        }
        else {
            System.out.print(" - Feature: null");
        }
        System.out.println();
	}
}
