import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class reProtoGyobei extends PApplet {

PImage player_iswait;		//待ち状態のプレイヤー画像用変数
PImage player_isFishing;		//釣り上げ時のプレイヤー画像用変数
boolean key_isPressed = false;	//スペースキーが押されているかどうか
int counter;
boolean  counterStopper = false;


public void setup() {

player_iswait = loadImage("human1.png");
player_isFishing = loadImage("human2.png");

}

public void draw() {
background(255);
text(counter, 200, 200);


	if (key_isPressed == true) {

		image(player_isFishing, 200, 200, 300, 300);
		if(counterStopper == true) {
			counter++;
			counterStopper = false;
		}
	}


	if(key_isPressed == false) {
		image(player_iswait, 200, 200, 300, 300);
		counterStopper = true;
	}

fill(0);
}


public void keyPressed() {if (keyCode == ' ') key_isPressed = true;}

public void keyReleased() {if (keyCode == ' ') key_isPressed = false;}
  public void settings() { 
size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "reProtoGyobei" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
