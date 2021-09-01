package org.atomic.coder.design_pattern._2_structuralpattern._6_Flyweight_pattern.demo;

import java.awt.*;

/**
 * @author 80340897
 * @date 2021/8/23 18:55
 */
public class BlackPieces implements ChessPieces {

    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x, pt.y, 30, 30);
    }

}
