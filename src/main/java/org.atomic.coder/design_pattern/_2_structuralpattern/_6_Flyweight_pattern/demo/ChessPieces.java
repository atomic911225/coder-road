package org.atomic.coder.design_pattern._2_structuralpattern._6_Flyweight_pattern.demo;

import java.awt.*;

/**
 * @author 80340897
 * @date 2021/8/23 18:53
 * <p>
 * 棋子，抽象享元
 */
public interface ChessPieces {

    /**
     * 下子
     *
     * @param g
     * @param pt
     */
    public void DownPieces(Graphics g, Point pt);

}
