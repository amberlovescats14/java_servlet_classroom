package dao;

public class DaoFactory {
    // always reference the interface
    private static Ahoy ahoyDao;

    public static Ahoy getAhoyDao() {
        if(ahoyDao == null) ahoyDao = new Ahoy();

        return ahoyDao;
    }

    // Contacts
    private static Contacts contactsDao;

    public static Contacts getContactsDao() {
        if(contactsDao == null) contactsDao = new ContactListDao() ;

        return contactsDao;
    }

    // Ads

    private static AdsDao adsDao;

    public static AdsDao getAdsDao() {
        if(ahoyDao == null) adsDao = new Ads();
        return adsDao;
    }

}
