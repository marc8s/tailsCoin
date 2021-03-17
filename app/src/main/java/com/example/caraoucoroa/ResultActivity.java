package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private Button mButtonBack;
    private ImageView mImageCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle dados = getIntent().getExtras();
        int coin = dados.getInt("randon");

        mImageCoin = findViewById(R.id.imageView_result);

        if(coin == 0){
            mImageCoin.setImageResource(R.drawable.moeda_cara);
        }else{
            mImageCoin.setImageResource(R.drawable.moeda_coroa);
        }

        mButtonBack = findViewById(R.id.button_back);
        mButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}