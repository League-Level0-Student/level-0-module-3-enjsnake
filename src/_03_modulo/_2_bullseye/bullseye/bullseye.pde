
void setup() {
 
  // set the size of your sketch
  
size(600,600);
}
void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=10;i>1;i--){
    if(i%2==0){
      fill(#DE1B1B);
    }
    else{
      fill(#FFFFFF);
    } 
      ellipse(300,300, 60*i, 60*i);
  //Use an if statement and modulo to alternate the color of your rings.
    
  
}
}
