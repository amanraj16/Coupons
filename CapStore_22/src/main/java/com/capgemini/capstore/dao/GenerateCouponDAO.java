package com.capgemini.capstore.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Promo;

@Repository
public interface GenerateCouponDAO {
	
	public Promo createPromocode(Promo promo);
	public Promo findPromocode(String promoCode);
	public List<Promo> displayAllCoupons();
}
