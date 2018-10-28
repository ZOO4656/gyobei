	PImage player_isWait;
	PImage player_isFishing;
	PImage[] fishers;
	boolean key_isPressed = false;
	boolean show_fish = false;
	int latestFishNumber;

	int[] pressed_Number = {1,2,3,4,5,6,7,8,9,10};
	int[] pressed_Number2 = new int[2000];
	boolean pressed_countLock = false;
	int counter = 0;
	boolean is_duplicated = false;

void setup() {
	size(500,500);
	player_isWait = loadImage("human1.png");
	player_isFishing = loadImage("human2.png");
	fishers = new PImage[10];
	fishers[0] = loadImage("fish1.png");
	fishers[1] = loadImage("fish2.png");
	fishers[2] = loadImage("fish3.png");
	fishers[3] = loadImage("fish4.png");
	fishers[4] = loadImage("fish5.png");
	fishers[5] = loadImage("fish6.png");
	fishers[6] = loadImage("fish7.png");
	fishers[7] = loadImage("fish8.png");
	fishers[8] = loadImage("fish9.png");
	fishers[9] = loadImage("fish10.png");
}

void draw() {
	background(255);
	if (key_isPressed) {
		image(player_isFishing, 100, 100, 300, 300);
		if(pressed_countLock == false) {
			int random = int(random(10));
			latestFishNumber = random;
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

			show_fish = true;
			pressed_countLock = true;
		}
			if(show_fish == true) {
				image(fishers[pressed_Number[latestFishNumber] -1], 310, 220, 70, 70);
			}
	}else{
		image(player_isWait, 100, 100, 300, 300);
		if (pressed_countLock == true) {
			pressed_countLock = false;
		}
		show_fish = false;
	}

	fill(0);
	for (int i = 0; i <pressed_Number2.length; i++ ) {
		if(pressed_Number2[i] != 0) {
			image(fishers[pressed_Number2[i]-1], i*30, 20, 50, 50);
		}
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
