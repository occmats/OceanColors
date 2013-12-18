/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.occ.plaf;

import java.awt.Color;
import javax.swing.UIDefaults;

/**
 *
 * @author T.Matsumura, OCC
 */
public interface OceanColor {
    public void addCustomEntriesToTable(UIDefaults table);
    public Color getBGColor();
    public OceanColor getInstance(String name);
}
