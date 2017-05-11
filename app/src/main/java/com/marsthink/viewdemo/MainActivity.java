/*
 *     Copyright (c) 2016 Meituan Inc.
 *
 *     The right to copy, distribute, modify, or otherwise make use
 *     of this software may be licensed only pursuant to the terms
 *     of an applicable Meituan license agreement.
 *
 */

package com.marsthink.viewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    LinearLayout contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentView = (LinearLayout) findViewById(R.id.activity_main);

        // new一个view，并通过add方式添加这个view
        ClockSurfaceView clockSurfaceView = new ClockSurfaceView(this);
        contentView.addView(clockSurfaceView);


        /*
         * 通过inflate方式从layout文件中来添加一个新的view
         * */
        View imgLayout = LayoutInflater.from(this).inflate(R.layout.img, contentView, true);
        //在该view中找到子的textview，并给之赋值；
        TextView txt = (TextView) imgLayout.findViewById(R.id.txt);
        txt.setText("hello jamal");
        imgLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"this is layout",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
