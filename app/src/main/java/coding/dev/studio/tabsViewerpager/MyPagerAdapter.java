package coding.dev.studio.tabsViewerpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                Participants_User_Fragments participants_user_fragments = new Participants_User_Fragments();
                return participants_user_fragments;

            case 1:
                Comments_Fragment comments_fragment = new Comments_Fragment();
                return comments_fragment;
            case 2:
                ReviewFragment reviewFragment = new ReviewFragment();
                return reviewFragment;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Participants";

            case 1:
                return "Comments";
            case 2:
                return "Review";

            default:
                return null;
        }
    }
}
