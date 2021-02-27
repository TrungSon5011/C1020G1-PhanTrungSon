package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


@org.springframework.stereotype.Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select p from product p ",Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public Product findById(Integer id) {
        return BaseRepository.entityManager.find(Product.class,id);
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        if(product.getId() == null){
            BaseRepository.entityManager.persist(product);
        }else {
            BaseRepository.entityManager.merge(product);
        }
        entityTransaction.commit();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        Product product = BaseRepository.entityManager.find(Product.class,id);
        entityTransaction.begin();
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }
}
