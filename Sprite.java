/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

import java.awt.Graphics;

public abstract class Sprite {
	private int x, y;
	
	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract void draw(Graphics g);
}
