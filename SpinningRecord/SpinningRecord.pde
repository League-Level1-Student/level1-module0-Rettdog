int i = 0;
int j = 0;
import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;  //as member variable
void setup(){
  pictureOfRecord= loadImage("pictureOfRecord.png");  //in setup method  
  size(792, 800);
  minim = new Minim(this);  //in the setup method
song = minim.loadFile("awesomeTrack.mp3", 512);//in the setup method
}

void draw(){
  
  rotateImage(pictureOfRecord,i);//work on step 5
 image(pictureOfRecord, 0, 0);//in draw method 

 if(mousePressed){
   j++;
   i+=j;
   song.play();
 }else{
   song.pause();
 }
 
 
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}