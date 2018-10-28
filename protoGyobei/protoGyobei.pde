	PImage player_isWait;
	PImage player_isFishing;
	boolean key_isPressed = false;

	int pressed_Number;
	boolean pressed_countLock = false;

void setup() {
	size(500,500);
	player_isWait = loadImage("human1.png");
	player_isFishing = loadImage("human2.png");
}

void draw() {
	background(255);
	if (key_isPressed) {
		image(player_isFishing, 100, 100, 300, 300);
		if(pressed_countLock == false) {
			int random = int(random(1,6));
			pressed_Number = random;
			pressed_countLock = true;
		}
	}else{
		image(player_isWait, 100, 100, 300, 300);
		if (pressed_countLock == true) {
			pressed_countLock = false;
		}
	}

	fill(0);
	text(pressed_Number,100,70);
}

void keyPressed() {
	if(keyCode == ' ') {
		key_isPressed = true;
	}
}

void keyReleased() {
	if(keyCode == ' ') {
		key_isPressed = false;
	}
}
