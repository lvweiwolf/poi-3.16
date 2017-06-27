package org.apache.poi.sl.draw;

import java.awt.RenderingHints;

class DrawableHint extends RenderingHints.Key {
    public DrawableHint(int id) {
        super(id);
    }

    public boolean isCompatibleValue(Object val) {
        return true;
    }

    public String toString() {
        switch (intKey()) {
            case 1: return "DRAW_FACTORY";
            case 2: return "GROUP_TRANSFORM";
            case 3: return "IMAGE_RENDERER";
            case 4: return "TEXT_RENDERING_MODE";
            case 5: return "GRADIENT_SHAPE";
            case 6: return "PRESET_GEOMETRY_CACHE";
            case 7: return "FONT_HANDLER";
            case 8: return "FONT_FALLBACK";
            case 9: return "FONT_MAP";
            case 10: return "GSAVE";
            case 11: return "GRESTORE";
            default: return "UNKNOWN_ID "+intKey();
        }
    }
}
