package cn.bb.service;

import cn.bb.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PayMentService {
    public int addPayment(Payment payment);

    public Payment findPaymentById(@Param("id") long id);
}
