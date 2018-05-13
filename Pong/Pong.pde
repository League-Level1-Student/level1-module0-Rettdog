float x = 0;
float xSpeed = 2;
float y = 0;
float ySpeed = 2;
import ddf.minim.*;  
Minim minim;
AudioSample sound;

void setup(){
  size(500,500);
  background(100,100,100);
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);

}
void draw(){
  background(100,100,100);
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
  if(y>height){
    sound.trigger();
  }
  rect(mouseX-50, 490, 100, 10);
}