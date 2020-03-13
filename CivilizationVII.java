/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization.vii;

//@author 710568

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class CivilizationVII extends JFrame{
    public static void main(String[] args) {
        JFrame jm = new CivilizationVII();
        World m = new World();
        jm.add(m);
        jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jm.setSize((24 * 50) + 16, (16 * 50) + 40);//20,50
        jm.setVisible(true);
        jm.setLocationRelativeTo(null);
        jm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                m.mousePressed(e);
            }
        });
        /*JFrame jt = new CivilizationVII();
        World t = new World();
        jt.add(t);
        jt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jt.setSize((24 * 50) + 16, (16 * 50) + 40);//20,50
        jt.setVisible(true);
        jt.setLocationRelativeTo(null);
        jt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                t.mousePressed(e);
            }
        });
        JFrame jc = new CivilizationVII();
        World c = new World();
        jc.add(c);
        jc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jc.setSize((24 * 50) + 16, (16 * 50) + 40);//20,50
        jc.setVisible(true);
        jc.setLocationRelativeTo(null);
        jc.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                c.mousePressed(e);
            }
        });*/
    }
}
