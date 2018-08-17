using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Touch : MonoBehaviour {

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		// if (Input.GetButtonDown("Fire1")) {
		// 	Debug.Log("PushMouseButtn");
		// }	//入力の検知
		if (Input.GetMouseButtonDown(0)) {
		    Debug.Log("クリックした瞬間");
		}

		if (Input.GetMouseButtonUp(0)) {
		    Debug.Log("離した瞬間");
		}

		if (Input.GetMouseButton(0)) {
		    Debug.Log("クリックしっぱなし");
		}

	}

}
