PImage player_iswait;		//待ち状態のプレイヤー画像用変数
PImage player_isFishing;		//釣り上げ時のプレイヤー画像用変数
boolean key_isPressed = false;	//スペースキーが押されているかどうか
int counter;
boolean  counterStopper = false;


void setup() {
size(500, 500);
player_iswait = loadImage("human1.png");
player_isFishing = loadImage("human2.png");

}

void draw() {
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


void keyPressed() {if (keyCode == ' ') key_isPressed = true;}

void keyReleased() {if (keyCode == ' ') key_isPressed = false;}