float x = 300;
float xSpeed = 1;
float y = 0;
float ySpeed = 1;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;

void setup(){
  size(500,500);
  background(100,100,100);
  backgroundImage = loadImage("starwars.jpg");
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);

}
void draw(){
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
  //background(100,100,100);
  fill(0,255,0);
  noStroke();
  ellipse(x,y,20,20);
  x+=xSpeed;
  if(x>width||x<0){
    xSpeed*=-1;
  }
  y+=ySpeed;
  if(y<0){
    ySpeed*=-1;
  }
  
  rect(mouseX-50, height-10, 100, 10);
  
  if(intersects(x,y,mouseX-50,height-10,100) ){
    ySpeed*=-1.1;
    sound.trigger();
    if(xSpeed<0){
      x-=.5;
    }else{
      x+=.5;
    }
    
  }
}
boolean intersects(float ballX, float ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
