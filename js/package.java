package com.example.aesting;

import android.app.Activity;
import android.os.Bundle;
public class MainActivity extends Activity implements OnClickListener {
		Button pesantoast;
		Button keluar;
		Button tampillist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pesantoast = (Button)findViewById(R.id.pesantoast);
        pesantoast.setOnClickListener((android.view.View.OnClickListener) this);
        tampillist = (Button)findViewById(R.id.tampillist);
        tampillist.setOnClickListener((android.view.View.OnClickListener) this);
        keluar = (Button)findViewById(R.id.keluar);
        keluar.setOnClickListener((android.view.View.OnClickListener) this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onClick(View arg0){
    	if(arg0==pesantoast){
    		Toast.makeText(getBaseContext(), "Anda Memilih Toast", Toast.LENGTH_SHORT).show();
    	}
    	else if(arg0==keluar){
    		AlertDialog.Builder builder=new AlertDialog.Builder(this);
    		builder.setMessage("Apakah Anda Ingin Keluar ?").setCancelable(false)
    		.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) 
				{ MainActivity.this.finish();
					// TODO Auto-generated method stub
					
				}
			}
    		).setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1)
				{arg0.cancel();
					// TODO Auto-generated method stub
					
				}
			}).show();
    			
    	}
    	else if (arg0==tampillist){
    		final CharSequence[]item={"Jeruk","Jambu","Nangka","Nanas"};
    		AlertDialog.Builder builder=new AlertDialog.Builder(this);
    		builder.setTitle("Pilih Minuman");
    		builder.setItems(item, new DialogInterface.OnClickListener()
    		{
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					Toast.makeText(getBaseContext(), item[arg1], Toast.LENGTH_SHORT).show();
					// TODO Auto-generated method stub
					
				}
			}).show();
    	}
    }

	@Override
	public void onPointerCaptureChanged(boolean hasCapture) {
		// TODO Auto-generated method stub
		
	}

	public void onClick1(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}
}
