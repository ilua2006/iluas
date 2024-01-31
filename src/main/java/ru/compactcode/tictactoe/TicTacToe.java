/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.compactcode.tictactoe;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author dim
 */
public class TicTacToe extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
    }
    
    void drawGrid(Graphics g){
        //получим текущие занчения игрового поля
        int w = getWidth();
        int h = getHeight();
        
        //разобьем на клетки. Получим размер одной клетки игрового поля
        int dw = w/3;
        int dh = h/3;
        g.setColor(Color.BLUE);
        for (int i = 1; i < 3; i++) {
            g.drawLine(0, dh*i, w, dh*i);
            g.drawLine(dw*i, 0, dw*i, h);
        }
    }
    
}
