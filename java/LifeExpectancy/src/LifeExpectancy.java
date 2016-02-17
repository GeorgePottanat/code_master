/**
 * Created by George on 9/30/2015.
 */

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.mapdisplay.OpenGLMapDisplay;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.*;
import processing.opengl.*;

public class LifeExpectancy extends PApplet {

    UnfoldingMap map;
    @Override
    public void setup() {

        size(800, 600, OPENGL);
        map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
        MapUtils.createDefaultEventDispatcher(this, map);
    }

    public void draw(){
        map.draw();
    }

    public static void main(String[] args){

    }
}
