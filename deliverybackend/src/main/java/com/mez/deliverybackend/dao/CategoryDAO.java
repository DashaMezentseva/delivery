package com.mez.deliverybackend.dao;

import com.mez.deliverybackend.dto.Category;

import java.util.List;

public interface CategoryDAO {
    Category get(int id);
    List<Category> list();
    boolean add(Category category);
    boolean update(Category category);
    boolean delete(Category category);

}
