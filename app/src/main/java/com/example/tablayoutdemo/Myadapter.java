package com.example.tablayoutdemo;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Myadapter extends FragmentPagerAdapter {

    private Context mycontext;
    int totaltab;

    public Myadapter(Context context, FragmentManager fm, int totaltab) {
        super(fm);
        mycontext = context;
        this.totaltab = totaltab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 1:
                StatusFragment statusFragment = new StatusFragment();
                return statusFragment;

            case 2:
                CallsFragment callsFragment = new CallsFragment();
                return callsFragment;

            case 3:
                PaymentFragment paymentFragment = new PaymentFragment();
                return paymentFragment;

            case 4:
                DetailsFragment detailsFragment = new DetailsFragment();
                return detailsFragment;

            case 5:
                ContactFragment contactFragment = new ContactFragment();
                return contactFragment;

            case 6:
                AddressFragment addressFragment = new AddressFragment();
                return addressFragment;

            default:
                return null;

        }

    }
        @Override
        public int getCount () {
            return totaltab;
        }
    }
