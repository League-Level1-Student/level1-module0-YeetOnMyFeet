int Y = 0;
int randomNumber = (int) random(width);
int boxX= mouseX;
int score = 0;
void setup(){
  size(600,600);
}
void draw(){
  background(0,255,0);
   fill(0, 0, 125);
    stroke(0, 0, 255);
    ellipse(randomNumber,Y++, 10, 30);
    if(Y>= 600){
      Y= 0;
      randomNumber = (int) random(width); 
    }
    boxX = mouseX;
      rect(boxX,  500,  100,  200);
if(500<=Y ){
  checkCatch(randomNumber);
  Y=0;
}}
 
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
           
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
