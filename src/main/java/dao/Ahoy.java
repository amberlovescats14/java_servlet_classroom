package dao;

import models.AhoyBean;

import java.util.ArrayList;
import java.util.List;

public class Ahoy implements AhoyDAO {
    private List<AhoyBean> ahoysList = new ArrayList<>();
    public Ahoy() {
        //this is mock data
        insert(new AhoyBean(1, "Amber", "Jones"));
        insert(new AhoyBean(2, "Cami", "Jones"));
        insert(new AhoyBean(3, "Mason", "Jones"));
    }

    // do u logic in here

    @Override
    public List<AhoyBean> getAll() {

        return ahoysList;
    }

    @Override
    public AhoyBean findOne(long id) {
        return null;
    }

    @Override
    public void insert(AhoyBean ahoyBean) {
        this.ahoysList.add(ahoyBean);
    }

    @Override
    public void update(AhoyBean ahoyBean) {

    }

    @Override
    public void destroy(AhoyBean ahoyBean) {

    }
}
