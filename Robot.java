import java.awt.*;
  
  public class Robot{
String nom;
Point position;
int vitesse; 


public Robot(String MonRobot){
    nom=MonRobot;
    position=new Point(0,0);
     vitesse=0;

}

public Robot(String MonRobot,int x , int y, int vitesse){
     nom=MonRobot;
     position=new Point(x,y);
     vitesse=vitesse;

}


public void AllerAlEst(){
     position.translate(vitesse,0);
}

public void allerAlOuest(){
     position.translate(-vitesse,0);
}


public void allerAuNord(){
      position.translate(0,vitesse);
}


public void allerAuSud(){
     position.translate(0,-vitesse);
}

public void accelerer(){
    vitesse++;
}

public void decelerer(){
    vitesse--;
}

public void stop(){
   vitesse=0;
}

public Point getPosition(){
   return position;
}

public void sePresenter(){
   System.out.println("nom: "+ nom +"position:" +position);
}
this.nom=nom;
this.vitesse=vitesse;
this.position=newPoint(0,0);
this.niveau=100;
public void AllerAlEst(){
if(niveau>0){
position.x+=vitesse;
niveau--;
}else{
Sytem.out.println("je n'ai plus de combustible pour me deplacer!");
}
}
public void AllerAlOuest(){
if(niveau>0){
position.x-=vitesse;
niveau--;
}else{
Sytem.out.println("je n'ai plus de combustible pour me deplacer!");
}
}
public void AllerAuNord(){
if(niveau>0){
position.y+=vitesse;
niveau--;
}else{
Sytem.out.println("je n'ai plus de combustible pour me deplacer!");
}
}
public void AllerAuSud(){
if(niveau>0){
position.y-=vitesse;
}else{
Sytem.out.println("je n'ai plus de combustible pour me deplacer!");
}
}
public void accelerer(){
vitesse++;
}
public void decelerer(){
if(vitesse>0){
vitesse--;
}
}
public void stop(){
vitesse=0;
sePresenter();
}
public void Point getPosition(){
return position;
}

public void sePresenter(){
System.out.println("je suis le robot"+nom+"et ma position est ("+position.x+","+position.y+")");
}
public void setNiveau(int n){
niveau=n;
}
public int getNiveau(){
return niveau;
}
Math.random();
switch((int) (random*4)){
case 0;
AllerAlEsr();
break;
}
}





