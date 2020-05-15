import ddf.minim.*;             //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
  minim = new Minim(this);
PImage pictureOfRecord; 
int angle = 0;

void setup(){
                        
size(600,600);                                 
pictureOfRecord= loadImage("record.jpg.jpg");
pictureOfRecord.resize(600,600); 
song = minim.loadFile("AfterParty.mp3", 512);   
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
void draw(){
  rotateImage(pictureOfRecord, angle);
 image(pictureOfRecord, 0, 0);
if(mousePressed == true){
  angle+= 60;
  song.play();
}
else{
  song.pause();
}
    
    
}
