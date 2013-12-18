/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 
package jp.co.occ.plaf;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.OceanTheme;


public class OceanBlue extends OceanTheme implements OceanColor {
    private Color background = new ColorUIResource(194, 239, 255);
    
    private static final ColorUIResource PRIMARY1 = new ColorUIResource(99, 130, 191);
    private static final ColorUIResource PRIMARY2 = new ColorUIResource(163, 184, 204);
    private static final ColorUIResource PRIMARY3 = new ColorUIResource(184, 207, 229);
    private static final ColorUIResource SECONDARY1 = new ColorUIResource(112, 128, 153);
    private static final ColorUIResource SECONDARY2 = new ColorUIResource(184, 207, 229);
    private static final ColorUIResource SECONDARY3 = new ColorUIResource(240, 250, 255);
    
    protected ColorUIResource getPrimary1() { return PRIMARY1; }
    protected ColorUIResource getPrimary2() { return PRIMARY2; }
    protected ColorUIResource getPrimary3() { return PRIMARY3; }
    protected ColorUIResource getSecondary1() { return SECONDARY1; }
    protected ColorUIResource getSecondary2() { return SECONDARY2; }
    protected ColorUIResource getSecondary3() { return SECONDARY3; }
    
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        
        Color dadada = new ColorUIResource(218, 218, 218);
        Object[] defaults = new Object[] {
            "TabbedPane.borderHightlightColor", getPrimary1(),
            "TabbedPane.contentAreaColor", background,
            "TabbedPane.contentBorderInsets", new Insets(4, 2, 3, 3),
            "TabbedPane.selected", background,
            "TabbedPane.tabAreaBackground", dadada,
            "TabbedPane.tabAreaInsets", new Insets(2, 2, 0, 6),
            "TabbedPane.unselectedBackground", dadada,
        };
        table.putDefaults(defaults);
    }
    
    public Color getBGColor(){
        return background;
    }
}
