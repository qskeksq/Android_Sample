package com.example.administrator.samples;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FontActivity extends AppCompatActivity {

    private TextView textView22;
    private TextView textView21;
    private TextView textView20;
    private TextView textView19;
    private TextView textView18;
    private TextView textView17;
    private TextView textView16;
    private TextView textView15;
    private TextView textView14;
    private TextView textView13;
    private TextView textView12;
    private TextView textView10;
    private TextView textView9;
    private TextView textView8;
    private TextView textView7;
    private TextView textView6;
    private TextView textView5;
    private TextView textView3;
    private TextView textView2;
    private TextView textView;
    private TextView textView26;
    private TextView textView28;
    private TextView textView27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_font);
        initView();
    }

    private void initView() {
        textView22 = (TextView) findViewById(R.id.textView22);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView18 = (TextView) findViewById(R.id.textView18);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView = (TextView) findViewById(R.id.textView);
        textView26 = (TextView) findViewById(R.id.textView26);
        textView28 = (TextView) findViewById(R.id.textView28);
        textView27 = (TextView) findViewById(R.id.textView27);


        Typeface binggrae = Typeface.createFromAsset(getAssets(), "Binggrae.ttf");
        Typeface bmdoyeon = Typeface.createFromAsset(getAssets(), "BMDOHYEON_ttf.ttf");
        Typeface bmhanna = Typeface.createFromAsset(getAssets(), "BMHANNA_11yrs_ttf.ttf");
        Typeface bmjua = Typeface.createFromAsset(getAssets(), "BMJUA_ttf.ttf");
        Typeface bmyeonsung = Typeface.createFromAsset(getAssets(), "BMYEONSUNG_ttf.ttf");
        Typeface busan = Typeface.createFromAsset(getAssets(), "busan.ttf");
        Typeface ebsHun = Typeface.createFromAsset(getAssets(), "ebsHun.ttf");
        Typeface goyang = Typeface.createFromAsset(getAssets(), "goyang.ttf");
        Typeface gyeonggi = Typeface.createFromAsset(getAssets(), "gyeonggi.ttf");
        Typeface hswind = Typeface.createFromAsset(getAssets(), "hsWind2.ttf");
        Typeface jejugothic = Typeface.createFromAsset(getAssets(), "JejuGothic.ttf");
        Typeface jejuhalla = Typeface.createFromAsset(getAssets(), "JejuHallasan.ttf");
        Typeface misang = Typeface.createFromAsset(getAssets(), "misang.ttf");
        Typeface round = Typeface.createFromAsset(getAssets(), "round.ttf");
        Typeface seoul = Typeface.createFromAsset(getAssets(), "seoul.ttf");
        Typeface swagger = Typeface.createFromAsset(getAssets(), "swagger.ttf");
        Typeface yanol = Typeface.createFromAsset(getAssets(), "yanol.ttf");
        Typeface yisoon = Typeface.createFromAsset(getAssets(), "yisoon.ttf");
        Typeface yisoon2 = Typeface.createFromAsset(getAssets(), "yisoon2.ttf");
        Typeface youth = Typeface.createFromAsset(getAssets(), "Youth.ttf");

        Typeface notosansLight = Typeface.createFromAsset(getAssets(), "NotoSansLight.otf");
        Typeface notosansRegular = Typeface.createFromAsset(getAssets(), "NotoSansRegular.otf");
        Typeface notosansThin = Typeface.createFromAsset(getAssets(), "NotoSansThin.otf");

        textView.setTypeface(binggrae);
        textView.setText("빙그레 빙그레 빙그레");
        textView2.setTypeface(bmdoyeon);
        textView2.setText("배민도연 배민도연 배민도연");
        textView3.setTypeface(bmhanna);
        textView3.setText("배민한나 배민한나 배민한나");
        textView5.setTypeface(bmjua);
        textView5.setText("배민주아 배민주아 배민주아");
        textView6.setTypeface(bmyeonsung);
        textView6.setText("배민연성 배민연성 배민연성");
        textView7.setTypeface(busan);
        textView7.setText("부산 부산 부산");
        textView8.setTypeface(ebsHun);
        textView8.setText("듀냐 듀냐 듀냐");
        textView9.setTypeface(goyang);
        textView9.setText("고양 고양 고양");
        textView10.setTypeface(gyeonggi);
        textView10.setText("경기 경기 경기");
        textView12.setTypeface(hswind);
        textView12.setText("바람 바람 바람");
        textView13.setTypeface(jejugothic);
        textView13.setText("제주고딕 제주고딕 제주고딕");
        textView14.setTypeface(jejuhalla);
        textView14.setText("제주한라 제주한라 제주한라");
        textView15.setTypeface(misang);
        textView15.setText("미생 미생 미생");
        textView16.setTypeface(round);
        textView16.setText("둥글 둥글 둥글");
        textView17.setTypeface(seoul);
        textView17.setText("서울 서울 서울");
        textView18.setTypeface(swagger);
        textView18.setText("스웨거 스웨거 스웨거");
        textView19.setTypeface(yanol);
        textView19.setText("야놀 야놀 야놀");
        textView20.setTypeface(yisoon);
        textView20.setText("이순신 이순신 이순신");
        textView21.setTypeface(yisoon2);
        textView21.setText("이순신2 이순신2 이순신2");
        textView22.setTypeface(youth);
        textView22.setText("청소년 청소년 청소년");

        textView26.setTypeface(notosansLight);
        textView26.setText("노토산 라이트 노토산 라이트");
        textView27.setTypeface(notosansRegular);
        textView27.setText("노토산 레귤러 노토산 레귤러");
        textView28.setTypeface(notosansThin);
        textView28.setText("노토산 씬 노토산 씬");
    }
}
