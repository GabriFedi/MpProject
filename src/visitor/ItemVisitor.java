/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import mpproject.ItemsPack;
import mpproject.Product;

/**
 *
 * @author work
 */
public interface ItemVisitor {
    public void visit(Product p);
    public void visit(ItemsPack p);
}
