package cn.bb.dao;

import cn.bb.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PayMentDao {
    public int addPayment(Payment payment);

    public Payment findPaymentById(@Param("id") long id);


}
