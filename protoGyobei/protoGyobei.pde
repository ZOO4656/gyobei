	PImage player;

void setup() {
	size(500,500);
	player = loadImage("human1.png");
	print("Hello World");
}

void draw() {
	image(player, 200, 250, 100, 100);
}