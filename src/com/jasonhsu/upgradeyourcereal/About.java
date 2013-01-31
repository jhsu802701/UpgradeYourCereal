package com.jasonhsu.upgradeyourcereal;

import java.util.Random;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;


public class About extends SherlockActivity {
	
    String[] slogan_array; // Initialize slogan_array (string array)
	String slogan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu sub = menu.addSubMenu("CEREAL");
        sub.add(0, R.id.option_applejacks, 0, "Apple Jacks");
        sub.add(0, R.id.option_cocoapuffs, 0, "Cocoa Puffs");
        sub.add(0, R.id.option_frankenberry, 0, "Frankenberry");
        sub.add(0, R.id.option_frostedflakes, 0, "Frosted Flakes");
        sub.add(0, R.id.option_goldencrisp, 0, "Golden Crisp");
        sub.add(0, R.id.option_honeycombs, 0, "Honeycombs");
        sub.add(0, R.id.option_luckycharms, 0, "Lucky Charms");
        sub.add(0, R.id.option_specialk, 0, "Special K");
        sub.add(0, R.id.option_total, 0, "Total");
        sub.add(0, R.id.option_trix, 0, "Trix");
        sub.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Resources res = getResources();
    	switch (item.getItemId()) {
    	    case R.id.option_applejacks:
    	    	slogan_array = res.getStringArray (R.array.slogans_applejacks);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_cocoapuffs:
    	    	slogan_array = res.getStringArray (R.array.slogans_cocoapuffs);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_frankenberry:
    	    	slogan_array = res.getStringArray (R.array.slogans_frankenberry);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_frostedflakes:
    	    	slogan_array = res.getStringArray (R.array.slogans_frostedflakes);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_goldencrisp:
    	    	slogan_array = res.getStringArray (R.array.slogans_goldencrisp);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_honeycombs:
    	    	slogan_array = res.getStringArray (R.array.slogans_honeycombs);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_luckycharms:
    	    	slogan_array = res.getStringArray (R.array.slogans_luckycharms);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_specialk:
    	    	slogan_array = res.getStringArray (R.array.slogans_specialk);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_total:
    	    	slogan_array = res.getStringArray (R.array.slogans_total);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;
    	    case R.id.option_trix:
    	    	slogan_array = res.getStringArray (R.array.slogans_trix);
    	    	slogan = StringFromArray (slogan_array);
    	    	PrintResult (slogan);
    	    	return true;

    	}
    	return(super.onOptionsItemSelected(item));
    }
    
    private void PrintResult (String string_local) {
    	setContentView (R.layout.result);
    	TextView TextViewResult = (TextView)findViewById (R.id.textViewResult);
    	TextViewResult.setText (string_local);
    	
    }
    
    private String StringFromArray (String[] array_local) {
    	// If there is more than one possible slogan,
        // one of them is chosen at random.
    	Random generator = new Random();
    	int n_slogan = array_local.length;
        int n_chosen = generator.nextInt(n_slogan);
        
        String slogan_chosen = array_local[n_chosen];
        return slogan_chosen;
    }
}
