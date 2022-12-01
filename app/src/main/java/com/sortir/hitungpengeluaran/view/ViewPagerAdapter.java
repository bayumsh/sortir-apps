package com.sortir.hitungpengeluaran.view;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sortir.hitungpengeluaran.view.fragment.pemasukan.PemasukanFragment;
import com.sortir.hitungpengeluaran.view.fragment.pengeluaran.PengeluaranFragment;

/**
 * Created by Azhar Rivaldi on 21-10-2022
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

   public ViewPagerAdapter(FragmentManager manager) {
      super(manager);
   }

   @Override
   public Fragment getItem(int position) {
      Fragment fragment = null;

      switch (position) {
         case 0:
            fragment = new PemasukanFragment();
            break;
         case 1:
            fragment = new PengeluaranFragment();
            break;
      }
      return fragment;
   }

   @Override
   public int getCount() {
      return 2;
   }

   @Override
   public CharSequence getPageTitle(int position) {
      String strTitle = "";
      switch (position) {
         case 0:
            strTitle = "Pemasukan";
            break;
         case 1:
            strTitle = "Pengeluaran";
            break;
      }
      return strTitle;
   }

}
