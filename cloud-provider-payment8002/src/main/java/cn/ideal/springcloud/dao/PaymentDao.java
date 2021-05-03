package cn.ideal.springcloud.dao;

import cn.ideal.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentDao
 * @Author: BWH_Steven
 * @Date: 2021/5/1 22:34
 * @Version: 1.0
 */


@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

