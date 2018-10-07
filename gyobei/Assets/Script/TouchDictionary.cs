using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class TouchDictionary : MonoBehaviour {

public GameObject movedictionary;

	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		// if (Input.GetMouseButtonDown(0)) {
		//     Debug.Log("図鑑をクリックした瞬間");
		// }

		// if (Input.GetMouseButtonUp(0)) {
		//     Debug.Log("図鑑を離した瞬間");
		// }

		// if (Input.GetMouseButton(0)) {
		//     Debug.Log("図鑑をクリックしっぱなし");
		// }
	}

	public void OnClick() {
		Debug.Log("図鑑をクリックした瞬間");
		movedictionary.SetActive(true);
	}
}
