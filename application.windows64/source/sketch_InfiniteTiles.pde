PImage nerd;
PGraphics nerdGraphics;

float ncx, ncy;

void setup() {
  size(1600, 900, P3D);

  noStroke();
  textureWrap(REPEAT);

  nerd = loadImage("sunglass_nerd.png");
  nerdGraphics = createGraphics(nerd.width, nerd.height, P3D);

  ncx = nerd.width * 0.5f;
  ncy = nerd.height * 0.5f;
}

float time() {
  return millis() * 0.1f;
}

void draw() {
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
