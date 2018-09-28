﻿using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TouchStageSelect : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		if (Input.GetMouseButtonDown(0)) {
		    Debug.Log("ステージセレクトをクリックした瞬間");
		}

		if (Input.GetMouseButtonUp(0)) {
		    Debug.Log("ステージセレクトを離した瞬間");
		}

		if (Input.GetMouseButton(0)) {
		    Debug.Log("ステージセレクトをクリックしっぱなし");
		}

	}
}
