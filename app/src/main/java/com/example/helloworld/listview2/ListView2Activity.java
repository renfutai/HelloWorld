package com.example.helloworld.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.helloworld.R;

import java.util.ArrayList;
import java.util.List;

public class ListView2Activity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(ListView2Activity.this, R.layout.fruit_item,fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Fruit fruit= fruitList.get(i);
            Toast.makeText(ListView2Activity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
        });
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("苹果", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("香蕉", R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("橘子", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("西瓜", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("梨", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("葡萄", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pinapple = new Fruit("菠萝", R.drawable.pineapple_pic);
            fruitList.add(pinapple);
            Fruit strawberry = new Fruit("草莓", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("樱桃", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("芒果", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }
}
