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

		
		//LinerLayout(��ʍ\��)�쐬
		setContentView(R.layout.activity_main);
		
		
		/*
        // ImageView���擾���āAholder�ɒǉ�����(�摜�̒ǉ�)�B
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.a0001_013868_m);
        ll.addView(iv);
        */
        
        /*
		//HorizontallyExpandingImagesView��onSizeChanged()�ɂ�ImageView�̊g�k���s���܂��B
		HorizontallyExpandingImagesView holder = new HorizontallyExpandingImagesView(this);
        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(R.layout.activity_main, holder);
        setContentView(holder);
 
        //ImageView���擾���āAholder�ɒǉ�����B
        ImageView imageview = (ImageView)findViewById(R.id.iv);
        holder.addImageView(imageview);
		*/
        //�{�^���̒ǉ�
        View start_button = findViewById(R.id.start_button);
      	
      	/*
      	button.setText("�f�f�J�n�I�I");
      	ll.addView( button );
        */
      	
		//�N���b�N�n���h��
        start_button.setOnClickListener(new ClickListener());

	}


	class ClickListener implements OnClickListener{
		public void onClick( View v){

			//�C���e���g����
			Intent intent = new Intent( MainActivity.this, QuestionActivity.class );
			startActivity( intent );

		}
    
	}
	
}