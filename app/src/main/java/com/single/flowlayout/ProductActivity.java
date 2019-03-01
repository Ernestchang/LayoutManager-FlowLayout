package com.single.flowlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiangcheng on 17/9/26.
 */

public class ProductActivity extends AppCompatActivity {
    private static final String TAG = ProductActivity.class.getSimpleName();
    //    private TextView suspension;
    protected RecyclerView productView;
    protected List<Product.Classify> classifies = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        productView = (RecyclerView) findViewById(R.id.product_view);
        productView.setLayoutManager(new LinearLayoutManager(this));

        classifies.add(new Product.Classify("款式",
                Arrays.asList(new Product.Classify.Des("男款"), new Product.Classify.Des("女款"),
                        new Product.Classify.Des("中年款"),
                        new Product.Classify.Des("潮流款"),
                        new Product.Classify.Des("儿童款"))));

        classifies.add(new Product.Classify("颜色", Arrays.asList(new Product.Classify.Des("红色"),
                new Product.Classify.Des("接发垃圾费白色"),
                new Product.Classify.Des("接发垃圾费蓝色"),
                new Product.Classify.Des("接发垃圾费橘黄色"),
                new Product.Classify.Des("接发垃圾费格调灰"),
                new Product.Classify.Des("接发垃圾费深色"),
                new Product.Classify.Des("接发垃圾费咖啡色"))));
        classifies.add(new Product.Classify("接发垃圾费尺寸", Arrays.asList(new Product.Classify.Des("180"),
                new Product.Classify.Des("接发垃圾费175"),
                new Product.Classify.Des("接发垃圾费170"),
                new Product.Classify.Des("接发垃圾费165"),
                new Product.Classify.Des("接发垃圾费160"),
                new Product.Classify.Des("接发垃圾费155"),
                new Product.Classify.Des("接发垃圾费150"))));


        classifies.add(new Product.Classify("腰围", Arrays.asList(new Product.Classify.Des("26"),
                new Product.Classify.Des("27"),
                new Product.Classify.Des("28"),
                new Product.Classify.Des("29"),
                new Product.Classify.Des("30"),
                new Product.Classify.Des("31"),
                new Product.Classify.Des("32"),
                new Product.Classify.Des("33"),
                new Product.Classify.Des("34"),
                new Product.Classify.Des("35"))));
        classifies.add(new Product.Classify("肩宽", Arrays.asList(new Product.Classify.Des("26"),
                new Product.Classify.Des("27"),
                new Product.Classify.Des("28"),
                new Product.Classify.Des("29"),
                new Product.Classify.Des("30"),
                new Product.Classify.Des("31"),
                new Product.Classify.Des("32"),
                new Product.Classify.Des("33"),
                new Product.Classify.Des("34"),
                new Product.Classify.Des("35"))));
        classifies.add(new Product.Classify("臂长", Arrays.asList(new Product.Classify.Des("26"),
                new Product.Classify.Des("27"),
                new Product.Classify.Des("28"),
                new Product.Classify.Des("29"),
                new Product.Classify.Des("30"),
                new Product.Classify.Des("31"),
                new Product.Classify.Des("32"),
                new Product.Classify.Des("33"),
                new Product.Classify.Des("34"),
                new Product.Classify.Des("35"))));

        for (int i = 0; i < classifies.size(); i++) {

            classifies.get(i).lines = (i % 2) + 1;
        }

        productView.setAdapter(new ProductAdapter(this, classifies));
    }

}
