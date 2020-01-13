package dao;

import models.AdsBean;

import java.util.ArrayList;
import java.util.List;

public class Ads implements AdsDao {
    private List<AdsBean> list = new ArrayList<>();

    //constructor


    public Ads() {
        createAdd(new AdsBean(1, "Pensil For Sale", "Number 2"));
        createAdd(new AdsBean(2, "Single Socks", "Cant find the match"));
        createAdd(new AdsBean(3, "Nail Polish", "Lady Glitter Sparkles color"));
    }

    @Override
    public AdsBean createAdd(AdsBean adsBean) {
        AdsBean bean = new AdsBean();
        bean.setId(adsBean.getId());
        bean.setTitle(adsBean.getTitle());
        bean.setDescription(adsBean.getDescription());

        list.add(bean);

        return bean;
    }

    @Override
    public List<AdsBean> readAllAds() {
        return list;
    }

    @Override
    public AdsBean updateAd(AdsBean adsBean) {
      list = (List<AdsBean>) list.stream().map((bean -> {
            if(bean.getId() == adsBean.getId()){
                bean = adsBean;
            }
            return bean;
        }));
        return adsBean;
    }

    @Override
    public void deleteAd(AdsBean adsBean) {
       list = (List<AdsBean>) list.stream().filter(bean -> bean.getId() != adsBean.getId());
        System.out.println("deleted");
    }


}
