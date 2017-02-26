package infinity.product.scm;

import infinity.product.scm.R;
import infinity.product.scm.QuestionActivity.ClickListener;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.LayoutInflater;

public class MainActivity extends Activity {

	//LinearLayout ll;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		//LinerLayout(画面構成)作成
		setContentView(R.layout.activity_main);
		
		
		/*
        // ImageViewを取得して、holderに追加する(画像の追加)。
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.a0001_013868_m);
        ll.addView(iv);
        */
        
        /*
		//HorizontallyExpandingImagesViewのonSizeChanged()にてImageViewの拡縮が行われます。
		HorizontallyExpandingImagesView holder = new HorizontallyExpandingImagesView(this);
        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(R.layout.activity_main, holder);
        setContentView(holder);
 
        //ImageViewを取得して、holderに追加する。
        ImageView imageview = (ImageView)findViewById(R.id.iv);
        holder.addImageView(imageview);
		*/
        //ボタンの追加
        View start_button = findViewById(R.id.start_button);
      	
      	/*
      	button.setText("診断開始！！");
      	ll.addView( button );
        */
      	
		//クリックハンドラ
        start_button.setOnClickListener(new ClickListener());

	}


	class ClickListener implements OnClickListener{
		public void onClick( View v){

			//インテント生成
			Intent intent = new Intent( MainActivity.this, QuestionActivity.class );
			startActivity( intent );

		}
    
	}
	
}