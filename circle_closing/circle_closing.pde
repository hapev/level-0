



int x2 = 940;
int x = 340;
int speed = 3;
void setup() {
  
size (1280,720);

noFill();
}


void draw(){
 if (x<1280){
  x+=speed;
    x2-=speed;
 }
 else{
 x-=speed;
    x2+=speed;
 }
  int size = 2;
  int size2 = 2;
  background (165,0251,123);
for (int p=0;p<50;p++){
  ellipse (x,340,size,size);
  size = size+10;


  
}


for (int i=0;i<50;i++){
  ellipse (x2,340,size2,size2);
  size2 = size2+10;

  
}

 








 
  }



