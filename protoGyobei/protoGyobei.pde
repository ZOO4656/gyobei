	PImage player_isWait;
	PImage player_isFishing;
	PImage[] fishers;
	PImage[] back;
	boolean key_isPressed = false;
	boolean show_fish = false;
	int latestFishNumber;

	int[] allFish = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};	//釣った魚を格納
	int[] dictionary = new int[2000];		//すべての魚を格納する図鑑
	int[] currentPool = new int[0];
	boolean pressed_countLock = false;		//連続入力防止のための変数
	int counter = 0;						//現在の番号を確認するための変数
	int timeCounter = 0;
	boolean is_duplicated = false;			//釣り上げた魚が現在すでに釣っていないか確認をする。

	int[][] fishPool= {
		{1, 5, 6},			//プール0
		{2, 14, 10},		//プール1
		{3, 8, 9},			//プール2
		{4, 12, 13},		//プール3
		{7, 11}				//プール4
	};

void setup() {
	size(500,500);
	player_isWait = loadImage("human1.png");
	player_isFishing = loadImage("human2.png");
	fishers = new PImage[15];				//魚の画像を配列に格納
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
	fishers[10] = loadImage("fish11.png");
	fishers[11] = loadImage("fish12.png");
	fishers[12] = loadImage("fish13.png");
	fishers[13] = loadImage("fish14.png");
	fishers[14] = loadImage("fish15.png");

	back = new PImage[5];								//背景画像の設定
	back[0] = loadImage("b_0.jpg");
	back[1] = loadImage("b_1.jpg");
	back[2] = loadImage("b_2.jpg");
	back[3] = loadImage("b_3.jpg");
	back[4] = loadImage("b_4.jpg");

}

void draw() {
	background(255);									//背景を白色に初期化
	int time = millis()/10000;							//ゲームが開始してからの時間を計測
	int time_id = time % 5;
	image(back[time_id], 0, 0, 500, 500);				//ゲーム開始時間に変動し背景画像を変更

	currentPool = fishPool[time_id];

	if (key_isPressed) {								//スペースキーが押されているかどうかを判定する
		image(player_isFishing, 100, 150, 300, 300);	//釣り上げた際のキャラクターを描写
		if(pressed_countLock == false) {				//ボタンの連続入力受付を行っていないか確認
			int random = currentPool[int(random(currentPool.length))];			//プールの中から指定の数字をランダムで生成
			latestFishNumber = random;					//最後に釣った魚の番号を変数に記憶
			is_duplicated = false;						//ランダムで出た数字を今格納している数字がdictionaryに登録されているかどうかを判定するためのboolean変数
			for (int i = 0; i < dictionary.length; i++) {
				if (dictionary[i] == allFish[random]) {
					is_duplicated = true;
				}
			}

			if (is_duplicated == false) {
				dictionary[counter] = allFish[random];
				counter++;
			}

			show_fish = true;
			pressed_countLock = true;
		}
			if(show_fish == true) {
				image(fishers[allFish[latestFishNumber] -1], 315, 250, 70, 70);	//釣り上げた魚を見せる
			}
		}else{
		image(player_isWait, 100, 150, 300, 300);
		if (pressed_countLock == true) {
			pressed_countLock = false;
		}
		show_fish = false;
	}

	fill(0);
	for (int i = 0; i <dictionary.length; i++ ) {
		if(dictionary[i] != 0) {
			image(fishers[dictionary[i]-1], i*30, 20, 50, 50);
		}
	}
}

void keyPressed() {					//スペースキーを押しているかの判定
	if(keyCode == ' ') {
		key_isPressed = true;
	}
}

void keyReleased() {				//スペースキーを離しているかの判定
	if(keyCode == ' ') {
		key_isPressed = false;
	}
}
