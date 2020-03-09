/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

import java.awt.Color;
import java.awt.Graphics;

public class Unit extends Sprite {
	private static final int width = 30;
	private static final int height = 30;
	private static final int curve = 20;
	private String unit;
	private Color color;
	
	public Unit(int x, int y, int unitId) {
		super(x, y);
	}
	
	public Unit(int x, int y, String unit) {
		super(x, y);
		this.unit = unit;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(180, 20, 20));
		g.fillRoundRect((super.getX() * 50) + 10, (super.getY() * 50) + 10, width, height, curve, curve);
	}
}
