package net.saga.aeroconf.app.activity.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import net.saga.aeroconf.app.ui.adapter.NavItem;
import net.saga.aeroconf.app.ui.fragment.BlankFragment;
import net.saga.aeroconf.app.ui.fragment.DashboardFragment;

/**
 * Created by summers on 4/25/14.
 */
public class NavigationPagerAdapter extends FragmentStatePagerAdapter {

    private enum NavEnum {DASHBOARD, MY_AGENDA, SCHEDULE, VENUE_MAP, ABOUT};

    public  final static NavItem[] NAV_ITEMS = new NavItem[]{new NavItem(android.R.drawable.ic_dialog_dialer, "Dashboard"),
            new NavItem(android.R.drawable.ic_menu_my_calendar, "My Agenda"),
            new NavItem(android.R.drawable.ic_menu_agenda, "Schedule"),
            new NavItem(android.R.drawable.ic_dialog_map, "Venue Map"),
            new NavItem(android.R.drawable.ic_dialog_info, "About")};

    public NavigationPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        NavEnum value = NavEnum.valueOf(NAV_ITEMS[position].label.toUpperCase().replace(" ", "_"));
        switch (value) {
            case DASHBOARD:
                return new DashboardFragment();
            case MY_AGENDA:
                break;
            case SCHEDULE:
                break;
            case VENUE_MAP:
                break;
            case ABOUT:
                break;
        }
        return BlankFragment.newInstance();
    }

    @Override
    public int getCount() {
        return NAV_ITEMS.length;
    }
}
