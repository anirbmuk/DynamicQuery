package blog.anirbanm.query.model.am.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 04 19:15:23 IST 2018
// ---------------------------------------------------------------------
public interface QueryModule extends ApplicationModule {
    void searchRightWay(String firstName, String lastName);

    void searchWrongWay(String firstName, String lastName);
}

