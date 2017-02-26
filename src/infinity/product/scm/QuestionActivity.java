package infinity.product.scm;

import infinity.product.scm.R;
import infinity.product.scm.MainActivity.ClickListener;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.LinearLayout;

public class QuestionActivity extends Activity{

	int cospa;
	int toushi;
	int kensan;
	int hobby;
	int este;
	int sports;
	int communication;
	int chochiku;
	int gurume;
	int fassion;
	int adult;

	int shoudouFlag;
	int brandFlag;
	int toushiFlag;
	int netaFlag;
	int adultFlag;
	
	Intent intent;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		*/
		
		/*
		//送られてきた値を表示
		TextView tv = new TextView( this );
		tv.setText( "画面を遷移しました。" );

		ll.addView( tv );
		*/
		
		setContentView(R.layout.q1);
		
		View q1a1button = findViewById(R.id.q1a1button);
        q1a1button.setOnClickListener(new ClickListener());
		
        View q1a2button = findViewById(R.id.q1a2button);
        q1a2button.setOnClickListener(new ClickListener());
        
        View q1a3button = findViewById(R.id.q1a3button);
        q1a3button.setOnClickListener(new ClickListener());
        
        View q1a4button = findViewById(R.id.q1a4button);
        q1a4button.setOnClickListener(new ClickListener());
        
        View q1a5button = findViewById(R.id.q1a5button);
        q1a5button.setOnClickListener(new ClickListener());
        
        
	}
	
	
	class ClickListener implements OnClickListener{

		public void onClick( View v){

			switch (v.getId()) {
				//設問1回答処理
		        case R.id.q1a1button:
		        	cospa = cospa - 5;
		        	hobby = hobby + 3;
		        	chochiku = chochiku - 1;
		        	this.q1setting();
		           	break;
		            
		        case R.id.q1a2button:
		        	toushi = toushi - 1;
		        	chochiku = chochiku + 3;
		        	fassion = fassion + 5;
		        	this.q1setting();
		        	break;
		        	
		        case R.id.q1a3button:
		        	toushi = toushi + 5;
		        	gurume = gurume - 1;
		        	fassion = fassion - 3;
		        	this.q1setting();
		        	break;
		        	
		        case R.id.q1a4button:
		        	kensan = kensan + 5;
		        	sports = sports + 1;
		        	fassion = fassion + 3;
		        	this.q1setting();
		        	break;
		        	
		        case R.id.q1a5button:
		        	kensan = kensan -3;
		        	hobby = hobby + 1;
		        	communication = communication + 5;
		        	this.q1setting();
		        	break;
		        	
		        	
				//設問2回答処理		        	
		        case R.id.q2a1button:
		            toushi = toushi + 5;
		            communication = communication + 3;
		            chochiku = chochiku + 1;
		            this.q2setting();
		            break;
		            
		        case R.id.q2a2button:
		        	kensan = kensan + 5;
		        	sports = sports + 1;
		        	communication = communication - 3;
		        	this.q2setting();
		        	break;
		        	
		        case R.id.q2a3button:
		        	kensan = kensan + 5;
		        	communication = communication + 3;
		        	chochiku = chochiku + 1;
		        	this.q2setting();
		        	break;
		        	
		        case R.id.q2a4button:
		        	toushi = toushi - 1;
		        	communication = communication - 5;
		        	fassion = fassion + 3;
		        	this.q2setting();
		        	break;
		        	
		        case R.id.q2a5button:
		        	cospa = cospa + 3;
		        	communication = communication + 5;
		        	fassion = fassion + 1;
		        	this.q2setting();
		        	break;
		        	
		        	
				//設問3回答処理	
		        case R.id.q3a1button:
		            toushi = toushi + 3;
		            chochiku = chochiku + 5;
		            fassion = fassion - 1;
		        	this.q3setting();
		            break;
		            
		        case R.id.q3a2button:
		        	hobby = hobby + 3;
		        	este = este + 1;
		        	fassion = fassion + 5;
		        	this.q3setting();
		        	break;
		        	
		        case R.id.q3a3button:
		        	cospa = cospa + 5;
		        	kensan = kensan + 3;
		        	chochiku = chochiku + 1;
		        	this.q3setting();
		        	break;
		        	
		        case R.id.q3a4button:
		        	cospa = cospa + 3;
		        	toushi = toushi + 5;
		        	este = este + 1;
		        	this.q3setting();
		        	break;
		        	
		        case R.id.q3a5button:
		        	cospa = cospa + 3;
		        	sports = sports + 1;
		        	chochiku = chochiku + 5;
		        	this.q3setting();
		        	break;
		            
		        	
		        //設問4回答処理
		        case R.id.q4a1button:
		            hobby = hobby + 1;
		            communication = communication + 3;
		            fassion = fassion + 5;
		        	this.q4setting();
		            break;
		            
		        case R.id.q4a2button:
		        	cospa = cospa - 5;
		        	communication = communication + 3;
		        	chochiku = chochiku - 1;

		        	//衝動買いフラグ判定
		        	if(cospa <= 10) {
		        		shoudouFlag = shoudouFlag + 1;
		        		
		            } else;
		            
		        	this.q4setting();
		        	break;
		        	
		        case R.id.q4a3button:
		        	toushi = toushi + 3;
		        	kensan = kensan + 5;
		        	sports = sports + 1;
		        	this.q4setting();
		        	break;
		        	
		        case R.id.q4a4button:
		        	toushi = toushi + 3;
		        	communication = communication + 5;
		        	gurume = gurume + 1;
		        	this.q4setting();
		        	break;
		        	
		        case R.id.q4a5button:
		        	sports = sports + 3;
		        	chochiku = chochiku + 5;
		        	adult = adult + 1;
		        	this.q4setting();
		        	break;
		        	
		        	
		        //設問5回答処理
		        case R.id.q5a1button:
		            hobby = hobby + 3;
		            sports = sports + 1;
		            fassion = fassion + 5;
		        	this.q5setting();
		            break;
		            
		        case R.id.q5a2button:
		        	cospa = cospa + 1;
		        	toushi = toushi + 3;
		        	chochiku = chochiku + 5;
		        	this.q5setting();
		        	break;
		        	
		        case R.id.q5a3button:
		        	este = este + 1;
		        	sports = sports + 5;
		        	gurume = gurume + 3;
		        	this.q5setting();
		        	break;
		        	
		        case R.id.q5a4button:
		        	kensan = kensan + 1;
		        	este = este + 3;
		        	communication = communication + 5;
		        	this.q5setting();
		        	break;
		        	
		        case R.id.q5a5button:
		        	cospa = cospa + 3;
		        	sports = sports - 5;
		        	adult = adult + 1;
		        	this.q5setting();
		        	break;
		        	
		        	
		        //設問6回答処理
		        case R.id.q6a1button:
		            cospa = cospa - 1;
		            este = este + 3;
		            fassion = fassion + 5;
		            
		            //ブランドフラグ判定
		        	if(fassion >= 8) {
		        		brandFlag = brandFlag + 1;
		        		
		            } else;
		            
		        	this.q6setting();
		            break;
		            
		        case R.id.q6a2button:
		        	cospa = cospa - 5;
		        	toushi = toushi - 1;
		        	fassion = fassion + 3;
		        	
		        	//衝動買いフラグ判定
		        	if(cospa <= 15) {
		        		shoudouFlag = shoudouFlag + 1;
		        		
		            } else;
		        	
		        	this.q6setting();
		        	break;
		        	
		        case R.id.q6a3button:
		        	cospa = cospa + 5;
		        	toushi = toushi + 3;
		        	chochiku = chochiku + 1;
		        	this.q6setting();
		        	break;
		        	
		        case R.id.q6a4button:
		        	cospa = cospa + 1;
		        	communication = communication + 5;
		        	fassion = fassion + 3;
		        	this.q6setting();
		        	break;
		        	
		        case R.id.q6a5button:
		        	hobby = hobby + 5;
		        	communication = communication + 3;
		        	fassion = fassion + 1;
		        	this.q6setting();
		        	break;
		        	
		        	
		        //設問7回答処理
		        case R.id.q7a1button:
		            toushi = toushi + 3;
		            hobby = hobby + 1;
		            fassion = fassion + 5;
		        	this.q7setting();
		            break;
		            
		        case R.id.q7a2button:
		        	toushi = toushi + 1;
		        	hobby = hobby + 5;
		        	communication = communication + 3;
		        	this.q7setting();
		        	break;
		        	
		        case R.id.q7a3button:
		        	hobby = hobby + 1;
		        	este = este + 3;
		        	fassion = fassion + 5;
		        	this.q7setting();
		        	break;
		        	
		        case R.id.q7a4button:
		        	toushi = toushi + 3;
		        	este = este + 5;
		        	gurume = gurume + 1;
		        	this.q7setting();
		        	break;
		        	
		        case R.id.q7a5button:
		        	sports = sports + 5;
		        	gurume = gurume + 3;
		        	adult = adult + 1;
		        	this.q7setting();
		        	break;
		        	
		        
	        	//設問8回答処理
		        case R.id.q8a1button:
		            hobby = hobby + 3;
		            fassion = fassion + 5;
		            adult = adult + 1;
		        	this.q8setting();
		            break;
		            
		        case R.id.q8a2button:
		        	hobby = hobby + 3;
		        	sports = sports + 1;
		        	fassion = fassion + 5;
		        	this.q8setting();
		        	break;
		        	
		        case R.id.q8a3button:
		        	hobby = hobby + 5;
		        	communication = communication + 1;
		        	adult = adult + 3;
		        	
		        	//アダルトフラグ判定
		        	if(adult >= 4) {
		        		adultFlag = adultFlag + 1;
		        		
		            } else;
		        	
		        	this.q8setting();
		        	break;
		        	
		        case R.id.q8a4button:
		        	toushi = toushi + 3;
		        	kensan = kensan + 5;
		        	chochiku = chochiku + 1;
		        	this.q8setting();
		        	break;
		        	
		        case R.id.q8a5button:
		        	cospa = cospa + 1;
		        	toushi = toushi + 3;
		        	sports = sports + 5;
		        	this.q8setting();
		        	break;
		        	
		        	
		        //設問9回答処理
		        case R.id.q9a1button:
		            cospa = cospa + 3;
		            hobby = hobby + 5;
		            chochiku = chochiku + 1;
		        	this.q9setting();
		            break;
		            
		        case R.id.q9a2button:
		        	toushi = toushi + 5;
		        	chochiku = chochiku + 1;
		        	fassion = fassion + 3;
		        	
		        	//ブランドフラグ判定
		        	if((fassion >= 12) && (toushi >= 7)) {
		        		brandFlag = brandFlag + 1;
		        		
		            } else;
		        	
		        	this.q9setting();
		        	break;
		        	
		        case R.id.q9a3button:
		        	cospa = cospa + 5;
		        	hobby = hobby + 1;
		        	chochiku = chochiku + 3;
		        	this.q9setting();
		        	break;
		        	
		        case R.id.q9a4button:
		        	toushi = toushi + 1;
		        	chochiku = chochiku + 3;
		        	fassion = fassion + 5;
		        	this.q9setting();
		        	break;
		        	
		        case R.id.q9a5button:
		        	cospa = cospa + 3;
		        	toushi = toushi + 1;
		        	chochiku = chochiku + 5;
		        	this.q9setting();
		        	break;
		        	
		        	
	        	//設問10回答処理		        	
		        case R.id.q10a1button:
		            kensan = kensan + 5;
		            hobby = hobby + 3;
		            communication = communication + 1;
		        	this.q10setting();
		            break;
		            
		        case R.id.q10a2button:
		        	kensan = kensan + 3;
		        	sports = sports + 5;
		        	communication = communication + 1;
		        	this.q10setting();
		        	break;
		        	
		        case R.id.q10a3button:
		        	kensan = kensan + 3;
		        	hobby = hobby + 5;
		        	sports = sports + 1;
		        	this.q10setting();
		        	break;
		        	
		        case R.id.q10a4button:
		        	hobby = hobby + 1;
		        	sports = sports + 3;
		        	fassion = fassion + 5;
		        	this.q10setting();
		        	break;
		        	
		        case R.id.q10a5button:
		        	kensan = kensan + 3;
		        	sports = sports + 1;
		        	communication = communication + 5;
		        	this.q10setting();
		        	break;	
		        	
		        	
		       	//設問11回答処理	
		        case R.id.q11a1button:
		        	kensan = kensan + 1;
		        	hobby = hobby + 5;
		        	sports = sports + 3;
		        	this.q11setting();
		            break;
		            
		        case R.id.q11a2button:
		        	cospa = cospa + 1;
		        	hobby = hobby + 3;
		        	sports = sports + 5;
		        	this.q11setting();
		        	break;
		        	
		        case R.id.q11a3button:
		        	cospa = cospa + 5;
		        	kensan = kensan + 3;
		        	chochiku = chochiku + 1;
		        	this.q11setting();
		        	break;
		        	
		        case R.id.q11a4button:
		        	toushi = toushi + 1;
		        	hobby = hobby - 5;
		        	chochiku = chochiku + 3;
		        	this.q11setting();
		        	break;
		        	
		        case R.id.q11a5button:
		        	kensan = kensan + 5;
		        	sports = sports + 1;
		        	chochiku = chochiku + 3;
		        	this.q11setting();
		        	break;
		        	
		        	
		        //設問12回答処理	
		        case R.id.q12a1button:
		            hobby = hobby + 5;
		            este = este + 1;
		            fassion = fassion + 3;
		        	this.q12setting();
		            break;
		            
		        case R.id.q12a2button:
		        	cospa = cospa + 1;
		        	toushi = toushi + 5;
		        	kensan = kensan + 3;
		        	
		        	//投資フラグ判定
		        	if((toushi >= 20) && (chochiku >= 12)) {
		        		toushiFlag = toushiFlag + 1;
		        		
		            } else;
		        	
		        	this.q12setting();
		        	break;
		        	
		        case R.id.q12a3button:
		        	kensan = kensan + 1;
		        	sports = sports + 5;
		        	adult = adult + 3;
		        	this.q12setting();
		        	break;
		        	
		        case R.id.q12a4button:
		        	hobby = hobby + 3;
		        	communication = communication + 5;
		        	fassion = fassion + 1;
		        	this.q12setting();
		        	break;
		        	
		        case R.id.q12a5button:
		        	kensan = kensan + 5;
		        	sports = sports + 3;
		        	communication = communication + 1;
		        	this.q12setting();
		        	break;
		        	
		        	
		        //設問13回答処理	
		        case R.id.q13a1button:
		            kensan = kensan + 5;
		            chochiku = chochiku + 1;
		            gurume = gurume + 3;
		        	this.q13setting();
		            break;
		            
		        case R.id.q13a2button:
		        	kensan = kensan + 3;
		        	communication = communication + 5;
		        	adult = adult + 1;
		        	
		        	//ネタフラグ判定
		        	if(communication >= 15) {
		        		netaFlag = netaFlag + 1;
		        		
		            } else;
		        	
		        	this.q13setting();
		        	break;
		        	
		        case R.id.q13a3button:
		        	toushi = toushi + 5;
		        	communication = communication + 1;
		        	chochiku = chochiku - 3;
		        	this.q13setting();
		        	break;
		        	
		        case R.id.q13a4button:
		        	cospa = cospa - 5;
		        	communication = communication + 3;
		        	chochiku = chochiku + 1;
		        	this.q13setting();
		        	break;
		        	
		        case R.id.q13a5button:
		        	kensan = kensan - 3;
		        	communication = communication - 1;
		        	chochiku = chochiku + 5;
		        	this.q13setting();
		        	break;
		        	
		        	
		        //設問14回答処理	
		        case R.id.q14a1button:
		        	hobby = hobby + 5;
		        	chochiku = chochiku - 1;
		        	fassion = fassion + 3;
		        	this.q14setting();
		            break;
		            
		        case R.id.q14a2button:
		        	cospa = cospa + 1;
		        	chochiku = chochiku + 3;
		        	gurume = gurume + 5;
		        	this.q14setting();
		        	break;
		        	
		        case R.id.q14a3button:
		        	cospa = cospa + 3;
		        	hobby = hobby + 1;
		        	communication = communication + 5;
		        	this.q14setting();
		        	break;
		        	
		        case R.id.q14a4button:
		        	toushi = toushi - 3;
		        	sports = sports + 1;
		        	chochiku = chochiku + 5;
		        	this.q14setting();
		        	break;
		        	
		        case R.id.q14a5button:
		        	toushi = toushi - 1;
		        	este = este + 3;
		        	fassion = fassion + 5;
		        	this.q14setting();
		        	break;
		        	
		        	
		        
		        //設問15回答処理	
		        case R.id.q15a1button:
		            gurume = gurume + 3;
		            fassion = fassion + 1;
		            adult = adult + 5;
		            
		            //アダルトフラグ判定
		        	if(adult >= 10) {
		        		adultFlag = adultFlag + 1;
		        		
		            } else;
		            
		        	this.q15setting();
		            break;
		            
		        case R.id.q15a2button:
		        	este = este + 1;
		        	sports = sports + 5;
		        	adult = adult + 3;
		        	this.q15setting();
		        	break;
		        	
		        case R.id.q15a3button:
		        	kensan = kensan + 5;
		        	chochiku = chochiku + 3;
		        	adult = adult - 1;
		        	this.q15setting();
		        	break;
		        	
		        case R.id.q15a4button:
		        	toushi = toushi + 1;
		        	hobby = hobby + 5;
		        	communication = communication + 3;
		        	this.q15setting();
		        	break;
		        	
		        case R.id.q15a5button:
		        	kensan = kensan + 1;
		        	hobby = hobby + 3;
		        	communication = communication + 5;
		        	
		        	//ネタフラグ判定
		        	if((communication >= 35) && (hobby >= 15)){
		        		netaFlag = netaFlag + 1;
		        		
		            } else;
		        	
		        	this.q15setting();
		        	break;
		        	
		        	
		        //設問終了＆再開ボタン	
		        case R.id.nextButton:
		        	Intent intent = new Intent( QuestionActivity.this, MainActivity.class );
        	        startActivity( intent );
		        	
		        	break;
		        	
		        	
		        //例外処理
		        default:
		        	break;
		        	
		        	
	        }
			
		}
		
		
		
		public void q1setting(){
			
	        setContentView(R.layout.q2);
	        
			View q2a1button = findViewById(R.id.q2a1button);
	        q2a1button.setOnClickListener(new ClickListener());
			
	        View q2a2button = findViewById(R.id.q2a2button);
	        q2a2button.setOnClickListener(new ClickListener());
	        
	        View q2a3button = findViewById(R.id.q2a3button);
	        q2a3button.setOnClickListener(new ClickListener());
	        
	        View q2a4button = findViewById(R.id.q2a4button);
	        q2a4button.setOnClickListener(new ClickListener());
	        
	        View q2a5button = findViewById(R.id.q2a5button);
	        q2a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		
		public void q2setting(){
			
	        setContentView(R.layout.q3);
	        
			View q3a1button = findViewById(R.id.q3a1button);
	        q3a1button.setOnClickListener(new ClickListener());
			
	        View q3a2button = findViewById(R.id.q3a2button);
	        q3a2button.setOnClickListener(new ClickListener());
	        
	        View q3a3button = findViewById(R.id.q3a3button);
	        q3a3button.setOnClickListener(new ClickListener());
	        
	        View q3a4button = findViewById(R.id.q3a4button);
	        q3a4button.setOnClickListener(new ClickListener());
	        
	        View q3a5button = findViewById(R.id.q3a5button);
	        q3a5button.setOnClickListener(new ClickListener());
	        
	        
		}
    
		
		
		public void q3setting(){
			
	        setContentView(R.layout.q4);
	        
			View q4a1button = findViewById(R.id.q4a1button);
	        q4a1button.setOnClickListener(new ClickListener());
			
	        View q4a2button = findViewById(R.id.q4a2button);
	        q4a2button.setOnClickListener(new ClickListener());
	        
	        View q4a3button = findViewById(R.id.q4a3button);
	        q4a3button.setOnClickListener(new ClickListener());
	        
	        View q4a4button = findViewById(R.id.q4a4button);
	        q4a4button.setOnClickListener(new ClickListener());
	        
	        View q4a5button = findViewById(R.id.q4a5button);
	        q4a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q4setting(){
			
	        setContentView(R.layout.q5);
	        
			View q5a1button = findViewById(R.id.q5a1button);
	        q5a1button.setOnClickListener(new ClickListener());
			
	        View q5a2button = findViewById(R.id.q5a2button);
	        q5a2button.setOnClickListener(new ClickListener());
	        
	        View q5a3button = findViewById(R.id.q5a3button);
	        q5a3button.setOnClickListener(new ClickListener());
	        
	        View q5a4button = findViewById(R.id.q5a4button);
	        q5a4button.setOnClickListener(new ClickListener());
	        
	        View q5a5button = findViewById(R.id.q5a5button);
	        q5a5button.setOnClickListener(new ClickListener());
	        
	        
		}


		
		public void q5setting(){
			
	        setContentView(R.layout.q6);
	        
			View q6a1button = findViewById(R.id.q6a1button);
	        q6a1button.setOnClickListener(new ClickListener());
			
	        View q6a2button = findViewById(R.id.q6a2button);
	        q6a2button.setOnClickListener(new ClickListener());
	        
	        View q6a3button = findViewById(R.id.q6a3button);
	        q6a3button.setOnClickListener(new ClickListener());
	        
	        View q6a4button = findViewById(R.id.q6a4button);
	        q6a4button.setOnClickListener(new ClickListener());
	        
	        View q6a5button = findViewById(R.id.q6a5button);
	        q6a5button.setOnClickListener(new ClickListener());
	        
	        
		}


		public void q6setting(){
			
	        setContentView(R.layout.q7);
	        
			View q7a1button = findViewById(R.id.q7a1button);
	        q7a1button.setOnClickListener(new ClickListener());
			
	        View q7a2button = findViewById(R.id.q7a2button);
	        q7a2button.setOnClickListener(new ClickListener());
	        
	        View q7a3button = findViewById(R.id.q7a3button);
	        q7a3button.setOnClickListener(new ClickListener());
	        
	        View q7a4button = findViewById(R.id.q7a4button);
	        q7a4button.setOnClickListener(new ClickListener());
	        
	        View q7a5button = findViewById(R.id.q7a5button);
	        q7a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q7setting(){
			
	        setContentView(R.layout.q8);
	        
			View q8a1button = findViewById(R.id.q8a1button);
	        q8a1button.setOnClickListener(new ClickListener());
			
	        View q8a2button = findViewById(R.id.q8a2button);
	        q8a2button.setOnClickListener(new ClickListener());
	        
	        View q8a3button = findViewById(R.id.q8a3button);
	        q8a3button.setOnClickListener(new ClickListener());
	        
	        View q8a4button = findViewById(R.id.q8a4button);
	        q8a4button.setOnClickListener(new ClickListener());
	        
	        View q8a5button = findViewById(R.id.q8a5button);
	        q8a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q8setting(){
			
	        setContentView(R.layout.q9);
	        
			View q9a1button = findViewById(R.id.q9a1button);
	        q9a1button.setOnClickListener(new ClickListener());
			
	        View q9a2button = findViewById(R.id.q9a2button);
	        q9a2button.setOnClickListener(new ClickListener());
	        
	        View q9a3button = findViewById(R.id.q9a3button);
	        q9a3button.setOnClickListener(new ClickListener());
	        
	        View q9a4button = findViewById(R.id.q9a4button);
	        q9a4button.setOnClickListener(new ClickListener());
	        
	        View q9a5button = findViewById(R.id.q9a5button);
	        q9a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		
		public void q9setting(){
			
	        setContentView(R.layout.q10);
	        
			View q10a1button = findViewById(R.id.q10a1button);
	        q10a1button.setOnClickListener(new ClickListener());
			
	        View q10a2button = findViewById(R.id.q10a2button);
	        q10a2button.setOnClickListener(new ClickListener());
	        
	        View q10a3button = findViewById(R.id.q10a3button);
	        q10a3button.setOnClickListener(new ClickListener());
	        
	        View q10a4button = findViewById(R.id.q10a4button);
	        q10a4button.setOnClickListener(new ClickListener());
	        
	        View q10a5button = findViewById(R.id.q10a5button);
	        q10a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q10setting(){
			
	        setContentView(R.layout.q11);
	        
			View q11a1button = findViewById(R.id.q11a1button);
	        q11a1button.setOnClickListener(new ClickListener());
			
	        View q11a2button = findViewById(R.id.q11a2button);
	        q11a2button.setOnClickListener(new ClickListener());
	        
	        View q11a3button = findViewById(R.id.q11a3button);
	        q11a3button.setOnClickListener(new ClickListener());
	        
	        View q11a4button = findViewById(R.id.q11a4button);
	        q11a4button.setOnClickListener(new ClickListener());
	        
	        View q11a5button = findViewById(R.id.q11a5button);
	        q11a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q11setting(){
			
	        setContentView(R.layout.q12);
	        
			View q12a1button = findViewById(R.id.q12a1button);
	        q12a1button.setOnClickListener(new ClickListener());
			
	        View q12a2button = findViewById(R.id.q12a2button);
	        q12a2button.setOnClickListener(new ClickListener());
	        
	        View q12a3button = findViewById(R.id.q12a3button);
	        q12a3button.setOnClickListener(new ClickListener());
	        
	        View q12a4button = findViewById(R.id.q12a4button);
	        q12a4button.setOnClickListener(new ClickListener());
	        
	        View q12a5button = findViewById(R.id.q12a5button);
	        q12a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q12setting(){
			
	        setContentView(R.layout.q13);
	        
			View q13a1button = findViewById(R.id.q13a1button);
	        q13a1button.setOnClickListener(new ClickListener());
			
	        View q13a2button = findViewById(R.id.q13a2button);
	        q13a2button.setOnClickListener(new ClickListener());
	        
	        View q13a3button = findViewById(R.id.q13a3button);
	        q13a3button.setOnClickListener(new ClickListener());
	        
	        View q13a4button = findViewById(R.id.q13a4button);
	        q13a4button.setOnClickListener(new ClickListener());
	        
	        View q13a5button = findViewById(R.id.q13a5button);
	        q13a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q13setting(){
			
	        setContentView(R.layout.q14);
	        
			View q14a1button = findViewById(R.id.q14a1button);
	        q14a1button.setOnClickListener(new ClickListener());
			
	        View q14a2button = findViewById(R.id.q14a2button);
	        q14a2button.setOnClickListener(new ClickListener());
	        
	        View q14a3button = findViewById(R.id.q14a3button);
	        q14a3button.setOnClickListener(new ClickListener());
	        
	        View q14a4button = findViewById(R.id.q14a4button);
	        q14a4button.setOnClickListener(new ClickListener());
	        
	        View q14a5button = findViewById(R.id.q14a5button);
	        q14a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q14setting(){
			
	        setContentView(R.layout.q15);
	        
			View q15a1button = findViewById(R.id.q15a1button);
	        q15a1button.setOnClickListener(new ClickListener());
			
	        View q15a2button = findViewById(R.id.q15a2button);
	        q15a2button.setOnClickListener(new ClickListener());
	        
	        View q15a3button = findViewById(R.id.q15a3button);
	        q15a3button.setOnClickListener(new ClickListener());
	        
	        View q15a4button = findViewById(R.id.q15a4button);
	        q15a4button.setOnClickListener(new ClickListener());
	        
	        View q15a5button = findViewById(R.id.q15a5button);
	        q15a5button.setOnClickListener(new ClickListener());
	        
	        
		}
		
		
		public void q15setting(){
			
			/*
			//値を渡してintent遷移
			Intent intent = new Intent( QuestionActivity.this, ResultActivity.class );
			intent.putExtra("result", communication );
			startActivity( intent );
			*/
			
			setContentView(R.layout.result);
			TextView tv1 = (TextView)findViewById(R.id.affiliate_link1);
			TextView tv2 = (TextView)findViewById(R.id.affiliate_link2);
			TextView tv3 = (TextView)findViewById(R.id.affiliate_link3);
			
			if(adultFlag >= 2) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=dvd&keywords=%E3%82%A2%E3%83%80%E3%83%AB%E3%83%88%E3%80%80%E5%A5%B3%E5%84%AA&linkCode=ur2&tag=shin001-22" );		        
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=dvd&keywords=%E3%82%A2%E3%83%80%E3%83%AB%E3%83%88%E3%80%80%E4%BC%81%E7%94%BB&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=hpc&keywords=%E3%82%A2%E3%83%80%E3%83%AB%E3%83%88%E3%82%B0%E3%83%83%E3%82%BA&linkCode=ur2&tag=shin001-22" );	
				
			} else if((adultFlag >= 1) && (hobby >= 10)) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=dvd&keywords=%E3%82%A2%E3%83%80%E3%83%AB%E3%83%88%E3%80%80%E7%B4%A0%E4%BA%BA&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=dvd&keywords=%E3%82%A2%E3%82%A4%E3%83%89%E3%83%AB&linkCode=ur2#/ref=sr_kk_2?rh=i%3Advd%2Ck%3A%E3%82%B0%E3%83%A9%E3%83%93%E3%82%A2%E3%82%A2%E3%82%A4%E3%83%89%E3%83%AB&keywords=%E3%82%B0%E3%83%A9%E3%83%93%E3%82%A2%E3%82%A2%E3%82%A4%E3%83%89%E3%83%AB&ie=UTF8&qid=1341814634&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=dvd&keywords=%E3%82%A4%E3%83%A1%E3%83%BC%E3%82%B8%E3%83%93%E3%83%87%E3%82%AA&linkCode=ur2&tag=shin001-22" );
				
			} else if(shoudouFlag >= 2) {
		        tv1.setText( "http://user.auctions.yahoo.co.jp/jp/show/recommend" );		        		        
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=aps&keywords=オススメ&tag=shin001-22&linkCode=ur2&pct-off=70-" );
		        tv3.setText( "http://www.amazon.co.jp/%E3%82%BF%E3%82%A4%E3%83%A0%E3%82%BB%E3%83%BC%E3%83%AB/b/ref=topnav_deals?ie=UTF8&node=2221688051&tag=shin001-22" );
				
			} else if(netaFlag >= 2) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=aps&keywords=%E3%83%91%E3%83%BC%E3%83%86%E3%82%A3%E3%83%BC%E3%82%B0%E3%83%83%E3%82%BA&linkCode=ur2&tag=shin001-22" );		        
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=toys&keywords=%E3%83%91%E3%83%BC%E3%83%86%E3%82%A3%E3%83%BC%E3%82%B0%E3%83%83%E3%82%BA&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=hobby&keywords=%E3%83%91%E3%83%BC%E3%83%86%E3%82%A3%E3%83%BC%E3%82%B0%E3%83%83%E3%82%BA&linkCode=ur2&tag=shin001-22" );
				
			} else if(brandFlag >= 2) {				
		        tv1.setText( "http://www.lovelovenavi.jp/" );		        
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=watches&keywords=%E3%82%AA%E3%83%A1%E3%82%AC%E3%80%80%E3%83%AD%E3%83%AC%E3%83%83%E3%82%AF%E3%82%B9&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=jewelry&keywords=%E3%83%96%E3%83%A9%E3%83%B3%E3%83%89&linkCode=ur2&tag=shin001-22" );
				
			} else if(gurume >= 7) {		
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=food-beverage&keywords=%E3%82%B0%E3%83%AB%E3%83%A1%E3%80%80%E9%A3%9F%E5%93%81&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/%E3%81%8A%E9%85%92-%E3%83%AF%E3%82%A4%E3%83%B3-%E6%97%A5%E6%9C%AC%E9%85%92-%E7%84%BC%E9%85%8E/b/ref=sv_fb_5?ie=UTF8&node=71588051&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/%E3%82%B9%E3%82%A4%E3%83%BC%E3%83%84-%E3%81%8A%E8%8F%93%E5%AD%90/b/ref=sv_fb_3?ie=UTF8&node=71314051&tag=shin001-22" );
				
			} else if(este >= 8) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=beauty&keywords=%E3%82%A8%E3%82%B9%E3%83%86&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=beauty&keywords=%E3%82%AA%E3%82%B9%E3%82%B9%E3%83%A1&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/bestsellers/beauty/ref=sv_beauty_1&tag=shin001-22" );
				
			} else if(fassion >= 24) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=apparel&keywords=%E3%83%95%E3%82%A1%E3%83%83%E3%82%B7%E3%83%A7%E3%83%B3&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/bestsellers/dmusic/ref=sv_dmusic_2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=jewelry&keywords=%E3%83%96%E3%83%A9%E3%83%B3%E3%83%89&linkCode=ur2&tag=shin001-22" );
				
			} else if(toushi >= 19) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=watches&keywords=&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=jewelry&keywords=%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B5%E3%83%AA%E3%83%BC&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://kakaku.com/fund/" );
				
			} else if(chochiku >= 17) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=kitchen&keywords=%E3%82%A4%E3%83%B3%E3%83%86%E3%83%AA%E3%82%A2&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=kitchen&keywords=%E7%94%9F%E6%B4%BB%E7%94%A8%E5%93%81&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=jewelry&keywords=%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B5%E3%83%AA%E3%83%BC&linkCode=ur2&tag=shin001-22" );
				
			} else if(cospa >= 12) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=aps&keywords=オススメ&tag=shin001-22&linkCode=ur2&pct-off=70-" );
		        tv2.setText( "http://www.amazon.co.jp/%E3%82%BF%E3%82%A4%E3%83%A0%E3%82%BB%E3%83%BC%E3%83%AB/b/ref=topnav_deals?ie=UTF8&node=2221688051&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=jewelry&keywords=%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B5%E3%83%AA%E3%83%BC&linkCode=ur2&tag=shin001-22" );
				
			} else if(kensan >= 14) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=jewelry&keywords=%E3%82%A2%E3%82%AF%E3%82%BB%E3%82%B5%E3%83%AA%E3%83%BC&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=books&keywords=%E8%B3%87%E6%A0%BC%E3%80%80%E3%82%AA%E3%82%B9%E3%82%B9%E3%83%A1&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=office-products&keywords=%E3%82%AA%E3%82%B9%E3%82%B9%E3%83%A1&linkCode=ur2&tag=shin001-22" );
				
			} else if(sports >= 14) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=sporting&keywords=%E3%83%86%E3%83%8B%E3%82%B9&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=sporting&keywords=%E3%83%95%E3%83%83%E3%83%88%E3%82%B5%E3%83%AB&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=sporting&keywords=%E3%82%B9%E3%83%8E%E3%83%9C%E3%83%BC&linkCode=ur2&tag=shin001-22" );
				
			} else if(hobby >= 24) {
		        tv1.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=aps&keywords=%E3%83%80%E3%83%BC%E3%83%84%E3%80%80%E3%83%93%E3%83%AA%E3%83%A4%E3%83%BC%E3%83%89&linkCode=ur2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/search?ie=UTF8&camp=247&creative=1211&index=aps&keywords=%E8%B6%A3%E5%91%B3&linkCode=ur2&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/gp/bestsellers/hobby/ref=sv_hb_0&tag=shin001-22" );
				
			} else if((hobby >= 12) && (communication >= 15)) {
		        tv1.setText( "http://www.amazon.co.jp/gp/bestsellers/dmusic/ref=sv_dmusic_2&tag=shin001-22" );
		        tv2.setText( "http://www.amazon.co.jp/gp/bestsellers/dvd/ref=sv_d_3&tag=shin001-22" );		        
		        tv3.setText( "http://t.pia.jp/" );
				
			} else {
		        tv1.setText( "http://www.amazon.co.jp/gp/bestsellers/videogames/ref=sv_vg_3&tag=shin001-22" );     
		        tv2.setText( "http://www.amazon.co.jp/b/ref=amb_link_51398406_2?ie=UTF8&node=2278488051&pf_rd_m=AN1VRQENFRJN5&pf_rd_s=center-5&pf_rd_r=0AJK0BZYW2F4N13JB65G&pf_rd_t=101&pf_rd_p=116705109&pf_rd_i=465610&tag=shin001-22" );
		        tv3.setText( "http://www.amazon.co.jp/%E3%82%BF%E3%82%A4%E3%83%A0%E3%82%BB%E3%83%BC%E3%83%AB/b/ref=topnav_deals?ie=UTF8&node=2221688051&tag=shin001-22" );
				
			}
			
			
			View nextButton = findViewById(R.id.nextButton);
			nextButton.setOnClickListener(new ClickListener());
			
		}

	}
	
	
}