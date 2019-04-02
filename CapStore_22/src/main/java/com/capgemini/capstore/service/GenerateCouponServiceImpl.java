package com.capgemini.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.Promo;
import com.capgemini.capstore.dao.GenerateCouponDAO;
import com.capgemini.capstore.exception.PromocodeAlreadyExistException;

@Service
public class GenerateCouponServiceImpl implements GenerateCouponService {

	@Autowired
	GenerateCouponDAO generateCouponDAO;
	
	@Override
	public Promo savePromocode(Promo promo) throws PromocodeAlreadyExistException {
		Promo promoSearch = generateCouponDAO.findPromocode(promo.getPromoCode());
		if(promoSearch==null)
			return generateCouponDAO.createPromocode(promo);
		else
			throw new PromocodeAlreadyExistException("This Promocode Already Exist");
	}

	@Override
	public Promo findPromocode(String promoCode) throws PromocodeAlreadyExistException {
		Promo promoSearch = generateCouponDAO.findPromocode(promoCode);
		if(promoSearch!=null)
			return promoSearch;
		else
			throw new PromocodeAlreadyExistException("This Promocode does not exist");
	}
	
	@Override
	public List<Promo> viewCoupons() throws PromocodeAlreadyExistException
	{
		List<Promo> promocodeList = generateCouponDAO.displayAllCoupons();
		if(!promocodeList.isEmpty())
			return promocodeList;
		else
			throw new PromocodeAlreadyExistException("No Promocodes found");
	}

}
