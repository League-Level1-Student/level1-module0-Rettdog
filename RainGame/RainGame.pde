float rainY = 0;
float rainChange=.1;
int randomNumber;
int score=0;
PImage kitty;
void setup(){
  size(700,700);
  randomNumber=random();
  kitty = loadImage("kitty.jpg");
  kitty.resize(40,20);
}
void draw(){
  background(130,200,250);
  fill(12,14,108);
  noStroke();
  
  image(kitty,randomNumber, rainY);
  rainY+=rainChange;
  rainChange+=.4;
  fill(100,100,100);
  rect(mouseX,680,50,20);
  textSize(50);
  text(score,0,50);
  if(rainY>700){
    if(randomNumber+20>mouseX&&randomNumber+20<mouseX+50){
      score++;
    }else if(score>0){
      score--;
    }
  }
  if(rainY>700){
    rainY=0;
    rainChange=.1;
    randomNumber=random();
  }
}
int random(){
  return (int) random(width);
}