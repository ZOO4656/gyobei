using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Fishing : MonoBehaviour {
	
	//todo:"fish"タグを持つオブジェクトを格納する箇所を作成する。
	public GameObject fish;


	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
		//
		if (Input.GetMouseButtonDown(0)){ FishDown();}
		if (Input.GetMouseButtonUp(0)){ FishOn();}
		if (Input.GetMouseButton(0)){ FishHold	();}
	}

	//todo:15 スマホ用のタッチ処理についても追加する

	//釣り竿を投げる
	public void FishDown () {
		Throw();
	}

	//釣り竿を引き上げる
	public void FishOn () {
		Pullin();

	}

	//釣り竿をホールド・魚が暴れている
	public void FishHold () {
		Debug.Log("魚が暴れている");
	}

	//釣り竿を投げた時の処理
	public void Throw () {
		Debug.Log("釣り竿を投げた");

	}

	//魚を釣り上げた時の処理
	public void Pullin() {
		Debug.Log("魚を釣った");
		Transform mypos = fish.transform;
		Vector3 pos = mypos.position;
		pos.y += 1f;
		mypos.position = pos;

		// fishpos.transform.position = new Vectore3(fishpos.x, fishpos.y + 10f,fishpos.z);
		// fish.transform.position = fishpos.transform.position;
	}

}
