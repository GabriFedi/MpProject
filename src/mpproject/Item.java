/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import visitor.MyVisitor;

/**
 *
 * @author work
 */
public interface Item {
    public String getName();
    public double getPrice();
    public Image getImage();
    public void add(Item... items);
    public void accept(ItemVisitor v);
    public int getQty();
    public void setQty(int i);
    public String getSerialNumber();
}
