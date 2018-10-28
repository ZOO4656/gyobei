	PImage player;
	boolean key_isPressed = false;

void setup() {
	size(500,500);
	player = loadImage("human1.png");
}

void draw() {
	background(255);
	if (key_isPressed){
	image(player, 200, 250, 100, 100);
	}else{
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
