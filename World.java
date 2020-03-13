/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class World extends JPanel{
    private Tile[][] tiles = new Tile[24][16];
    private Sprite[][][] sprites = new Sprite[24][16][4];
    Timer timer;
    Unit unit;
    
    public World() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/30);
        super.setSize((24 * 50) + 20, (16 * 50) + 50);
        
        unit = new Unit(12, 4, 0);
        sprites[16][8][3] = unit;
        
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 16; y++) {
                Tile tile;
                if (y <= 0 || y >= 15) {
                    tile = new Tile(x, y, "TERAIN_SNOW");
                }
                else if (y <= 2 || y >= 13) {
                    if (Math.random() < .33) {
                        tile = new Tile(x, y, "TERAIN_SNOW");
                    }
                    else {
                        tile = new Tile(x, y, "TERAIN_TUNDRA");
                    }
                }
                else if (x <= 3 || x >= 21) {
                    tile = new Tile(x, y, "TERAIN_OCEAN");
                }
                else if (y <= 5 || y >= 11) {
                    if (Math.random() < .25) {
                        tile = new Tile(x, y, "TERAIN_TUNDRA");
                    }
                    else {
                        if (Math.random() < .5) {
                            tile = new Tile(x, y, "TERAIN_PLAINS");
                        }
                        else {
                            tile = new Tile(x, y, "TERAIN_GRASS");
                        }
                    }
                }
                else if (x <= 5 || x >= 19) {
                    tile = new Tile(x, y, "TERAIN_OCEAN");
                }
                else {
                    if (Math.random() < .5) {
                        if (Math.random() < .66) {
                            tile = new Tile(x, y, "TERAIN_PLAINS");
                        }
                        else {
                            tile = new Tile(x, y, "TERAIN_MOUNTAINS");
                        }
                    }
                    else {
                        if (Math.random() < .5) {
                            tile = new Tile(x, y, "TERAIN_DESERT");
                        }
                        else {
                            tile = new Tile(x, y, "TERAIN_GRASS");
                        }
                    }
                }
                tiles[x][y] = tile;
                sprites[x][y][0] = tile;
            }
        }
        
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 16; y++) {
                fixCoasts(x, y);
                tiles[x][y].generateHills();
            }
        }
    }
    
    public void fixCoasts(int x, int y) {
        boolean nextTo = false;
        for (int i = -1; i < 2; i++) {
            if (x + i < 0 || x + i >= 24) continue;
            for (int ii = -1; ii < 2; ii++) {
                if (y + ii < 0 || y + ii >= 16) continue;
                if (tiles[x + i][y + ii].getTerain().equals("TERAIN_SNOW") || tiles[x + i][y + ii].getTerain().equals("TERAIN_TUNDRA") || tiles[x + i][y + ii].getTerain().equals("TERAIN_DESERT") || tiles[x + i][y + ii].getTerain().equals("TERAIN_PLAINS") || tiles[x + i][y + ii].getTerain().equals("TERAIN_MOUNTAINS") || tiles[x + i][y + ii].getTerain().equals("TERAIN_GRASS")) {
                    nextTo = true;
                }
            }
        }
        if (tiles[x][y].getTerain().equals("TERAIN_OCEAN") && nextTo) {
            Tile tile = new Tile(x, y, "TERAIN_COAST");
            tiles[x][y] = tile;
            sprites[x][y][0] = tile;
        }
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        super.setBackground(Color.BLACK);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 24 * 50, 16 * 50);
	
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 16; y++) {
                sprites[x][y][0].draw(g);
            }
        }
        
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 16; y++) {
        	g.setColor(new Color(140, 140, 140));
        	g.drawRect(x * 50, y * 50, 50, 50);
            }
        }
        sprites[16][8][3].draw(g);
    }
    
    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
        }
    }
    
    public void mousePressed(MouseEvent e) {
        Rectangle mousePos = new Rectangle(e.getX() - 8, e.getY() - 39, 1, 1);
        for (int x = 0; x < 24; x++) {
            for (int y = 0; y < 16; y++) {
                Rectangle bounds = new Rectangle(x * 50, y * 50, 50, 50);
                if (mousePos.intersects(bounds)) {
                    tiles[x][y].printInfo();
                }
            }
        }
    }
}
