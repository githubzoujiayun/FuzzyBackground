package com.qzs.android.fuzzybackground;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.qzs.android.fuzzybackgroundlibrary.Fuzzy_Background;

public class MainActivity extends AppCompatActivity {
    private ImageView  imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.imageView);
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.aaa);

        Bitmap finalBitmap = Fuzzy_Background.with(MainActivity.this)
                .bitmap(bitmap) //要模糊的图片
                .radius(20)//模糊半径
                .blur();
        imageView.setImageBitmap(finalBitmap);


    }
}
