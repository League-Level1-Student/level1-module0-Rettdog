PImage pictureOfRecord;  //as member variable
void setup(){
  pictureOfRecord= loadImage("pictureOfRecord.png");  //in setup method  
  size(792, 800);
}
void draw(){
  rotateImage(pictureOfRecord,90);//work on step 5
 image(pictureOfRecord, 0, 0);//in draw method 
 
 
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}