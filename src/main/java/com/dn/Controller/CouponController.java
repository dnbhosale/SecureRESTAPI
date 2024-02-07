package com.dn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dn.Repo.CouponRepo;
import com.dn.model.Coupon;

@RestController
@RequestMapping("/couponapi")
public class CouponController {
	
	@Autowired
	CouponRepo cr;
	
	@PostMapping("/coupons")
	public Coupon addCoupon(@RequestBody Coupon c) {
		return cr.save(c);
	}
	
	@GetMapping("/coupons/{id}")
	public Coupon addCoupon(@PathVariable String id) {
		return cr.findByCode(id);
	}

}
