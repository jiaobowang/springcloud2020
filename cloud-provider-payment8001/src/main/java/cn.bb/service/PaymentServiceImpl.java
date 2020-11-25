package cn.bb.service;

import cn.bb.dao.PayMentDao;
import cn.bb.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PayMentService{
    @Autowired
    private PayMentDao payMentDao;
    @Override
    public int addPayment(Payment payment) {
        return payMentDao.addPayment(payment);
    }

    @Override
    public Payment findPaymentById(long id) {
        return payMentDao.findPaymentById(id);
    }
}
