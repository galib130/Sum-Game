package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random2, random3, random4, random, flag,ki=0;
    int ji = 0;
     public TextView text1;
    public TextView text2;    public TextView text3;   public TextView text4;
    public TextView head;   public TextView text5;   public Button start;
    public TextView text6; public  TextView text7;
    /*TextView text2 = (TextView) findViewById(R.id.textView2);
     TextView text3 = (TextView) findViewById(R.id.textView3);
     TextView text4 = (TextView) findViewById(R.id.textView4);
     TextView head = (TextView) findViewById(R.id.header);
     TextView text5 = (TextView) findViewById(R.id.textView5);
     Button start = (Button) findViewById(R.id.button);*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         text1 = (TextView) findViewById(R.id.textView);
         text2 = (TextView) findViewById(R.id.textView2);
         text3 = (TextView) findViewById(R.id.textView3);
         text4 = (TextView) findViewById(R.id.textView4);
          head = (TextView) findViewById(R.id.header);
          text5 = (TextView) findViewById(R.id.textView5);
          start = (Button) findViewById(R.id.button);
        text6 = (TextView) findViewById(R.id.textView6);
        text7 = (TextView) findViewById(R.id.textView7);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag=1;
                ji=0;
                text5.setText(ji+"/"+ki);
                random = new Random().nextInt(4) + 1;
                int i = new Random().nextInt(90) + 1;
                int j = new Random().nextInt(90) + 1;
                int result = i + j;
                head.setText(i + "+" + j + "=");
                random2 = result;
                random3 = result;
                random4 = result;

                while (random2 == result || random3 == result || random4 == result) {
                    random2 = new Random().nextInt(100) + 1;
                    random3 = new Random().nextInt(100) + 1;
                    random4 = new Random().nextInt(100) + 1;
                }
                if (random == 1) {
                    text1.setText(Integer.toString(result));
                    text2.setText(Integer.toString(random2));
                    text3.setText(Integer.toString(random3));
                    text4.setText(Integer.toString(random4));
                } else if (random == 2) {
                    text1.setText(Integer.toString(random2));
                    text2.setText(Integer.toString(result));
                    text3.setText(Integer.toString(random3));
                    text4.setText(Integer.toString(random4));
                } else if (random == 3) {
                    text1.setText(Integer.toString(random3));
                    text2.setText(Integer.toString(random2));
                    text3.setText(Integer.toString(result));
                    text4.setText(Integer.toString(random4));
                } else if (random == 4) {
                    text1.setText(Integer.toString(random2));
                    text2.setText(Integer.toString(random4));
                    text3.setText(Integer.toString(random3));
                    text4.setText(Integer.toString(result));
                }
                new CountDownTimer(60000,1000) {
                    @Override
                    public void onTick(long l) {
                        int mac= (int) (l/1000);
                        text6.setText(Integer.toString(mac));
                    }

                    @Override
                    public void onFinish() {
                     text7.setText("Your Score is :"+ji);
                     start.setVisibility(View.VISIBLE);
                     flag=0;
                     ki=0;

                    }
                }.start();

            }

        });
    }


    public void play(View view)
    {
        if(flag==1)
        {start.setVisibility(View.INVISIBLE);
         random = new Random().nextInt(4) + 1;
        int i = new Random().nextInt(90) + 1;
        int j = new Random().nextInt(90) + 1;
        int result = i + j;
        head.setText(i + "+" + j + "=");
        random2 = result;
        random3 = result;
        random4 = result;

        while ( random2 == result ||  random3 == result ||  random4 == result) {
            random2 = new Random().nextInt(100) + 1;
            random3 = new Random().nextInt(100) + 1;
            random4 = new Random().nextInt(100) + 1;
        }
        if (random == 1) {
            text1.setText(Integer.toString(result));
            text2.setText(Integer.toString(random2));
            text3.setText(Integer.toString(random3));
            text4.setText(Integer.toString(random4));
        }
        else if (random == 2) {
            text1.setText(Integer.toString(random2));
            text2.setText(Integer.toString(result));
            text3.setText(Integer.toString(random3));
            text4.setText(Integer.toString(random4));
        } else if (random == 3) {
            text1.setText(Integer.toString(random3));
            text2.setText(Integer.toString(random2));
            text3.setText(Integer.toString(result));
            text4.setText(Integer.toString(random4));
        } else if (random == 4) {
            text1.setText(Integer.toString(random2));
            text2.setText(Integer.toString(random4));
            text3.setText(Integer.toString(random3));
            text4.setText(Integer.toString(result));
        }}

    }
    public void click(View view)
    {

        int id=view.getId();
        String ourId="";
        ourId=view.getResources().getResourceEntryName(id);
        ki++;
        if(random==1)
        {
            if(flag==1)
            {if(ourId.equals("textView")) {

                ji++;
                Log.i("click: ", ourId);
                Log.i("click: ", Integer.toString(ji));
                text5.setText(ji + "/" + ki);

                play(null);

            }


        else
                {
                    play(null);
                    text5.setText(ji + "/" + ki);
                }

        }}
        else if(random==2) {
          if(flag==1)
          {if(ourId.equals("textView2"))
            {

                Log.i( "click: ",ourId);
                ji++;
                text5.setText(ji + "/" + ki);
                Log.i( "click: ",Integer.toString(ji));


                    play(null);

                }

            else
            {
                play(null);
                text5.setText(ji + "/" + ki);
            }}
            }
        else if(random==3)
        {
            if(flag==1) {
                Log.i("click: ", ourId);

                if (ourId.equals("textView3")) {
                    ji++;
                    Log.i("click: ", Integer.toString(ji));
                    text5.setText(ji + "/" + ki);

                        play(null);

                } else {
                    play(null);
                    text5.setText(ji + "/" + ki);
                }

            }
        }
        else if(random==4)
        {
            if(flag==1) {
                Log.i("click: ", ourId);
                if (ourId.equals("textView4")) {
                    ji++;
                    Log.i("click: ", Integer.toString(ji));
                    text5.setText(ji + "/" + ki);

                        play(null);

                } else {
                    play(null);
                    text5.setText(ji + "/" + ki);
                }

            }
 }



    }

}
