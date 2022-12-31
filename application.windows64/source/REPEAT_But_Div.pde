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
