package org.atomic.coder.design_pattern._2_structuralpattern._6_Flyweight_pattern.demo;

import java.util.ArrayList;

/**
 * @author 80340897
 * @date 2021/8/23 18:55
 */
public class WeiqiFactory {

    private ArrayList<ChessPieces> qz;

    public WeiqiFactory() {
        qz = new ArrayList<ChessPieces>();

        ChessPieces w = new WhitePieces();
        qz.add(w);

        ChessPieces b = new BlackPieces();
        qz.add(b);
    }

    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return qz.get(1);
        } else {
            return null;
        }
    }

}
