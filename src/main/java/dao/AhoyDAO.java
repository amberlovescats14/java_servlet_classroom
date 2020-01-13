package dao;

import models.AhoyBean;

import java.util.List;

public interface AhoyDAO {
    // the class is coming from the bean
    List<AhoyBean> getAll();
    AhoyBean findOne(long id);
    void insert (AhoyBean ahoyBean);
    void update(AhoyBean ahoyBean);
    void destroy(AhoyBean ahoyBean);

}
