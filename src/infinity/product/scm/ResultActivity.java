package infinity.product.scm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.widget.ImageView;

public class ResultActivity extends Activity {

	Intent intent;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout ll = new LinearLayout(this);
	    ll.setOrientation(LinearLayout.VERTICAL);
	    setContentView(ll);
	 
        //前の画面から送られてきた値を取得
        intent = getIntent();
        int result = intent.getIntExtra( "result", 0 );
	 
        
	    //送られてきた値を表示
        TextView tv = new TextView( this );
        tv.setText( "クックックッ、あなたのコミュ力は" + result + "です。" );
        ll.addView( tv );
        

        Button button = new Button(this);
	    button.setText("元のアクティビティに値を戻して終了します。");
	    ll.addView( button );
	    button.setOnClickListener( new ClickListener() );
	
	}

	
	
	class ClickListener implements OnClickListener{
		public void onClick( View v){
	
	        intent.putExtra("return", 104 );
	        setResult( RESULT_OK, intent );
	
	        finish();
	  
		}
	

	}

	
}
