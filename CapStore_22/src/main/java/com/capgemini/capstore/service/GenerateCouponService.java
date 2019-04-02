package com.capgemini.capstore.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.capstore.beans.Promo;
import com.capgemini.capstore.exception.PromocodeAlreadyExistException;

@Repository
public interface GenerateCouponService {

	public Promo savePromocode(Promo promo) throws PromocodeAlreadyExistException;
	public Promo findPromocode(String promoCode) throws PromocodeAlreadyExistException;
	public List<Promo> viewCoupons() throws PromocodeAlreadyExistException;
}
