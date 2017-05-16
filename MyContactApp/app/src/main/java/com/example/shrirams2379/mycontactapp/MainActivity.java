package com.example.shrirams2379.mycontactapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Logger;


public class MainActivity extends ActionBarActivity {

    DatabaseHelper myDb;
    EditText editName;
    EditText editAge;
    EditText editPhone;
    Button btnAddData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper (this);

        editName = (EditText) findViewById(R.id.editText_name);
        editAge = (EditText) findViewById(R.id.editText_age);
        editPhone = (EditText) findViewById(R.id.editText_Phone);

    }

    public void addData (View v) {
        boolean ifInsertedName = myDbyDb.insertData(editName.getText().toString());
        boolean ifInsertedAge = myDb.insertData(editAge.getText().toString());
        boolean ifInsertedPhone = myDb.insertData(editPhone.getText().toString());

        if (isInsertedName && isInsertedAge && isInsertedPhone == true){
           Log.d("MyContact", "Data insertion successful");
            Toast.makeText(getApplicationContext(), "Data insertion sucessful", Toast.LENGTH_LONG).show();

            //Create toast message to user indicating data inserted correctly
        }
        else{
            Log.d("MyContact", "Data insertion NOT successful");
            Toast.makeText(getApplicationContext(), "Data insertion NOT successful", Toast.LENGTH_LONG).show();

            //Create toast message to user indicating data inserted incorrectly
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
