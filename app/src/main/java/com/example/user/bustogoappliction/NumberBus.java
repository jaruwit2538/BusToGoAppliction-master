package com.example.user.bustogoappliction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.bustogoappliction.Database.BusTale;

public class NumberBus extends AppCompatActivity {
    private BusTale objBusTale;

    //Explicit
    ListView listView;
    /*private int [] ints = new int[] {R.drawable.one,R.drawable.two,
            R.drawable.tree,R.drawable.four,R.drawable.six,
            R.drawable.seven};*/

    private String[]titlesStrings,detailStrings,shorStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_bus);
        //inital view
        /*listView = (ListView) findViewById(R.id.livBus);
        //Get volue
        titlesStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);
        //SubString detailString ตัดข้อความให้สั้นตามที่ต้องการ
        shorStrings = new String[detailStrings.length]; //จำลองพื้นที่
        for (int i = 0; i < detailStrings.length;i++){
            shorStrings [i] = detailStrings [i] .substring(0,29)+"...";

        } //end for*/
        //create ListView

        c();
        final String[] name = objBusTale.readAllBus(1);
        final String[] name2 = objBusTale.readAllBus(2);
        final String[] numberBus = objBusTale.readAllBus(3);

        Myadpter myadpter = new Myadpter(NumberBus.this, name, name2, numberBus);
        listView.setAdapter(myadpter);

        //active when click Live View ลิ้งค์ไปหน้า detail เมื่อเลือก item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NumberBus.this,detail.class);
                intent.putExtra("Title",titlesStrings[position]);
                intent.putExtra("Detail",detailStrings[position]);
                //intent.putExtra("Image",ints[position]);
                startActivity(intent);
            }
        });

    }//main Method onCreate

    private void c() {
        objBusTale = new BusTale(this);
    }

    public void button2 (View view) {
        Intent intent = new Intent(NumberBus.this,Mainmenu.class);
        startActivity(intent);
    }

}


