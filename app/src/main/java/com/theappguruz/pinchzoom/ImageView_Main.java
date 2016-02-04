package com.theappguruz.pinchzoom;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.theappguruz.R;
import com.theappguruz.imagezoom.ImageViewTouch;

public class ImageView_Main extends Activity {

	private ImageViewTouch ivLargeImage;
	private Bitmap myBitmap;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_view);
		ivLargeImage = (ImageViewTouch) findViewById(R.id.ivLargeImageView);
		ImageName imageId = new ImageName();

		//if image size is too large. scale image.
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		myBitmap = BitmapFactory.decodeResource(getResources(),
				imageId.getImageId(),options);
		if (options.outWidth > 3000 || options.outHeight > 2000) {
			options.inSampleSize = 4;
		} else if (options.outWidth > 2000 || options.outHeight > 1500) {
			options.inSampleSize = 3;
		} else if (options.outWidth > 1000 || options.outHeight > 1000) {
			options.inSampleSize = 2;
		}
		options.inJustDecodeBounds = false;
		myBitmap = BitmapFactory.decodeResource(getResources(),
				imageId.getImageId(),options);
		ivLargeImage.setImageBitmapReset(myBitmap, 0, true);

	}
}
