void setup(){
  size(600,600);
  background(0,255,0);
  noStroke();
}
void draw(){
  makeMagical();
  for(int i=0; i<=300; i++){
    fill(#F70C0C);
   float x = random(600);
   float y = random(600);
    ellipse(getWormX(i), getWormY(i), 10,10);
  }
}
  float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
