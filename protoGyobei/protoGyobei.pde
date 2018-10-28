	PImage player_isWait;
	PImage player_isFishing;
	boolean key_isPressed = false;

	String[] pressed_Number = {"A", "B", "C", "D", "E", "F", "G"};
	String[] pressed_Number2 = new String[2000];
	boolean pressed_countLock = false;
	int counter = 0;
	boolean is_duplicated = false;

void setup() {
	size(500,500);
	player_isWait = loadImage("human1.png");
	player_isFishing = loadImage("human2.png");

	for (int i = 0; i < pressed_Number2.length; i++) {
		pressed_Number2[i] = "";
	}
}

void draw() {
	background(255);
	if (key_isPressed) {
		image(player_isFishing, 100, 100, 300, 300);
		if(pressed_countLock == false) {
			int random = int(random(7));
			is_duplicated = false;

			for (int i = 0; i < pressed_Number2.length; i++) {
				if (pressed_Number2[i] == pressed_Number[random]) {
					is_duplicated = true;
				}
			}

			if (is_duplicated == false) {
				pressed_Number2[counter] = pressed_Number[random];
				counter++;
			}


			pressed_countLock = true;
		}
	}else{
		image(player_isWait, 100, 100, 300, 300);
		if (pressed_countLock == true) {
			pressed_countLock = false;
		}
	}

	fill(0);
	for (int i = 0; i <pressed_Number2.length; i++ ) {
		text(pressed_Number2[i],100 + i*10,70);
	}
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
