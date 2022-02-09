package com.atguigu.gulimall.gulimallproduct;


import com.atguigu.gulimall.product.GulimallProductApplication;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("123231haha");
        brandService.save(brandEntity);
    }

    @Test
    public void testCatelogPath(){
        Long[] catelogPath = categoryService.findCatelogPath(224L);
        System.out.println(Arrays.asList(catelogPath));
    }



}
