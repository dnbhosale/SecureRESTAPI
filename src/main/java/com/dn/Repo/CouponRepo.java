package com.dn.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dn.model.Coupon;
@Repository
public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String c);

}
