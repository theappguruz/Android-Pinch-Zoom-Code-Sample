package com.theappguruz.pinchzoom;

import java.util.ArrayList;
import java.util.Random;

import com.theappguruz.R;

public class ImageName {

	private Random randNo;
	private ArrayList<Integer> imageName;

	public ImageName() {
		imageName = new ArrayList<Integer>();
		imageName.add(R.drawable.a1);
		imageName.add(R.drawable.a2);
		imageName.add(R.drawable.a3);
		imageName.add(R.drawable.a4);
		imageName.add(R.drawable.a5);
	}

	public int getImageId() {
		randNo = new Random();
		return imageName.get(randNo.nextInt(imageName.size()));
	}
}
