package com.capgemini.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Promo;

@Transactional
@Repository
public class GenerateCouponDAOImpl implements GenerateCouponDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Promo createPromocode(Promo promo) {
		entityManager.persist(promo);
		return promo;
	}

	@Override
	public Promo findPromocode(String promoCode) {
		Promo promocode = entityManager.find(Promo.class,promoCode);
		return promocode;
	}

	@Override
	public List<Promo> displayAllCoupons() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select e from Promo",Promo.class).getResultList();
	}

}
