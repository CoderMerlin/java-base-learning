package com.design.merlin.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Merlin
 * @Title: CourseCatalog
 * @ProjectName java-base-learning
 * @Description: 目录类
 * @date 2019/3/615:40
 */
public class CourseCatalog extends CatalogComponent{

    private List<CatalogComponent> items = new ArrayList<>();

    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        for (CatalogComponent catalogComponent : items) {
            catalogComponent.print();
        }
    }

}
