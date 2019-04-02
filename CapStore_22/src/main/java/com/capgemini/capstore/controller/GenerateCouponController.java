package com.capgemini.capstore.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.capstore.beans.Promo;
import com.capgemini.capstore.beans.SoftDelete;
import com.capgemini.capstore.exception.PromocodeAlreadyExistException;
import com.capgemini.capstore.service.GenerateCouponService;

public class GenerateCouponController {

	@Autowired
	GenerateCouponService generateCouponService;
	
	@RequestMapping(value="/createPromocode/{promoCode}/{discountOffered}/{promoValidity}/{softDelete}",method=RequestMethod.GET)
	public Promo createPromocode(@PathVariable String promoCode,@PathVariable double discountOffered,@PathVariable Date promoValidity,@PathVariable SoftDelete softDelete) throws PromocodeAlreadyExistException
	{
		Promo promocode = new Promo();
		promocode.setPromoCode(promoCode);
		promocode.setDiscountOffered(discountOffered);
		promocode.setPromoValidity(promoValidity);
		promocode.setSoftDelete(softDelete);
		return generateCouponService.savePromocode(promocode);
	}
	
	@RequestMapping(value="/findPromocode/{promoCode}",method=RequestMethod.GET)
	public Promo findPromocode(@PathVariable String promoCode) throws PromocodeAlreadyExistException
	{
		Promo promocode = generateCouponService.findPromocode(promoCode);
		return promocode;
	}
	
	@RequestMapping(value="/couponList",method=RequestMethod.GET)
	public List<Promo> viewPromocodes() throws PromocodeAlreadyExistException
	{
		return generateCouponService.viewCoupons();
	}
	
}
