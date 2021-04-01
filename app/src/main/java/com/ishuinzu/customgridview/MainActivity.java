package com.ishuinzu.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridCategories;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridCategories = findViewById(R.id.gridCategories);

        loadCategories();
    }

    private void loadCategories() {
        categoryList = new ArrayList<>();

        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));
        categoryList.add(new Category(R.mipmap.ic_launcher, "Category Name", "Category Details"));

        categoryAdapter = new CategoryAdapter(MainActivity.this, categoryList);
        gridCategories.setAdapter(categoryAdapter);
    }
}