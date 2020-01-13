package controllers;

import dao.Ads;
import dao.AdsDao;
import dao.DaoFactory;
import models.AdsBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "all-ads", urlPatterns = "/ads")
public class ShowAdsServlet extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            AdsDao adsDao = DaoFactory.getAdsDao();

            List<AdsBean> allAds = adsDao.readAllAds();

            req.setAttribute("allAds", allAds);
            req.getRequestDispatcher("/ads/index.jsp").forward(req,res);
        } catch(IOException | ServletException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }
}
