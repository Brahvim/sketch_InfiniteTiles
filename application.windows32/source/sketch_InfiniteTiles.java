import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_InfiniteTiles extends PApplet {

PImage nerd;
PGraphics nerdGraphics;

float ncx, ncy;

public void setup() {
  

  noStroke();
  textureWrap(REPEAT);

  nerd = loadImage("sunglass_nerd.png");
  nerdGraphics = createGraphics(nerd.width, nerd.height, P3D);

  ncx = nerd.width * 0.5f;
  ncy = nerd.height * 0.5f;
}

public float time() {
  return millis() * 0.1f;
}

public void draw() {
  background(0);

  beginShape();
  texture(nerdGraphics);

  nerdGraphics.beginDraw();
  nerdGraphics.imageMode(CENTER);
  nerdGraphics.translate(ncx, ncy);
  nerdGraphics.rotateZ(time() * 0.01f);
  nerdGraphics.image(nerd, 0, 0);
  nerdGraphics.endDraw();

  // For just infinite tiles (no scrolling!):

  //vertex(0, 0, 0, 0);
  //vertex(width, 0, width, 0);
  //vertex(width, height, width, height);
  //vertex(0, height, 0, height);

  vertex(0, 0, time(), time());
  vertex(width, 0, time() + width, time());
  vertex(width, height, time() + width, time() + height);
  vertex(0, height, time(), time() + height);

  endShape();
}
//PImage nerd;

//void settings() {
//  size(1600, 900, P3D);
//}

//void setup() {
//  noStroke();
//  //textureMode(NORMAL);
//  textureWrap(REPEAT);

//  nerd = loadImage("sunglass_nerd.png");
//}


//void draw() {
//  background(0);

//  beginShape();
//  texture(nerd);
//  vertex(0, 0, 0, 0);
//  vertex(width, 0, millis() % nerd.width + width, 0);
//  vertex(width, height, millis() % nerd.width +  width, millis() % nerd.height +  height);
//  vertex(0, height, 0, millis() % nerd.height +  height);
//  endShape();
//}

//int millis() {
//  return (int)(super.millis());
//}
//PImage nerd;

//void settings() {
//  size(1600, 900, P3D);
//}

//void setup() {
//  noStroke();
//  textureMode(NORMAL);
//  textureWrap(REPEAT);

//  nerd = loadImage("sunglass_nerd.png");
//}


//void draw() {
//  background(0);

//  beginShape();
//  texture(nerd);
//  vertex(0, 0, 0, 0);
//  vertex(width, 0, millis() / width, 0);
//  vertex(width, height, millis() / width, millis() / height);
//  vertex(0, height, 0, millis() / height);
//  endShape();
//}

//int millis() {
//  return (int)(super.millis());
//}
//PImage nerd;

//void settings() {
//  size(1600, 900, P3D);
//}

//void setup() {
//  noStroke();
//  textureMode(NORMAL);
//  textureWrap(REPEAT);

//  nerd = loadImage("sunglass_nerd.png");
//}


//void draw() {
//  background(0);

//  beginShape();
//  texture(nerd);
//  vertex(0, 0, 0, 0);
//  vertex(width, 0, millis() / nerd.width, 0);
//  vertex(width, height, millis() / nerd.width, millis() / nerd.height);
//  vertex(0, height, 0, millis() / nerd.height);
//  endShape();

//  //perspective();
//  //camera();
//}

//int millis() {
//  return (int)(super.millis());
//}
//PImage nerd;

//void settings() {
//  size(1600, 900, P3D);
//}

//void setup() {
//  noStroke();
//  textureMode(NORMAL);
//  textureWrap(REPEAT);

//  nerd = loadImage("sunglass_nerd.png");
//}


//void draw() {
//  background(0);

//  beginShape();
//  texture(nerd);
//  vertex(0, 0, 0, 0);
//  vertex(width, 0, millis() % nerd.width, 0);
//  vertex(width, height, millis() % nerd.width, millis() % nerd.height);
//  vertex(0, height, 0, millis() % nerd.height);
//  endShape();

//  //perspective();
//  //camera();
//}

//int millis() {
//  return (int)(super.millis() * 0.01f);
//}
//PImage nerd;

//void settings() {
//  size(1600, 900, P3D);
//}

//void setup() {
//  noStroke();
//  //textureMode(NORMAL);
//  textureWrap(REPEAT);

//  nerd = loadImage("sunglass_nerd.png");
//}


//void draw() {
//  background(0);

//  beginShape();
//  texture(nerd);
//  vertex(0, 0, 0, 0);
//  vertex(width, 0, millis() % width + width, 0);
//  vertex(width, height, millis() % width +  width, millis() % height +  height);
//  vertex(0, height, 0, millis() % height +  height);
//  endShape();
//}

//int millis() {
//  return (int)(super.millis());
//}
  public void settings() {  size(1600, 900, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_InfiniteTiles" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
