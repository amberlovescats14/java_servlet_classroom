package dao;

import models.AdsBean;

import java.util.List;

public interface AdsDao  {
    AdsBean createAdd(AdsBean adsBean);
    List<AdsBean> readAllAds();
    AdsBean updateAd(AdsBean adsBean);
    void deleteAd(AdsBean adsBean);

}
