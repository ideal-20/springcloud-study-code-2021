package cn.ideal.springcloud.service.impl;

import cn.ideal.springcloud.dao.PaymentDao;
import cn.ideal.springcloud.entities.Payment;
import cn.ideal.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Author: BWH_Steven
 * @Date: 2021/5/1 22:37
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

