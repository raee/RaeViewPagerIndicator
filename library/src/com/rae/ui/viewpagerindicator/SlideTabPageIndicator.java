package com.rae.ui.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TabPageIndicator;

public class SlideTabPageIndicator extends TabPageIndicator implements
		PageIndicator {

//	private SlideBar mSlideBar;
//	private TabPageIndicator mPageIndicator;

	public SlideTabPageIndicator(Context context) {
		super(context);
	}

	public SlideTabPageIndicator(Context context, AttributeSet attrs) {
		super(context, attrs);
//		mSlideBar = new SlideBar(context, attrs);
//		mPageIndicator = new TabPageIndicator(context, attrs);
//
//		//mPageIndicator.setOnPageChangeListener(mSlideBar);
//
//		addView(mPageIndicator, LayoutParams.MATCH_PARENT,
//				LayoutParams.WRAP_CONTENT);
//		addView(mSlideBar, LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

	}
//
//	@Override
//	public void onPageScrollStateChanged(int arg0) {
//		mPageIndicator.onPageScrollStateChanged(arg0);
//	}
//
//	@Override
//	public void onPageScrolled(int arg0, float arg1, int arg2) {
//		mPageIndicator.onPageScrolled(arg0, arg1, arg2);
//	}
//
//	@Override
//	public void onPageSelected(int arg0) {
//		mPageIndicator.onPageSelected(arg0);
//	}
//
//	@Override
//	public void setViewPager(ViewPager view) {
//		mPageIndicator.setViewPager(view);
//	}
//
//	@Override
//	public void setViewPager(ViewPager view, int initialPosition) {
//		mPageIndicator.setViewPager(view, initialPosition);
//	}
//
//	@Override
//	public void setCurrentItem(int item) {
//		mPageIndicator.setCurrentItem(item);
//	}
//
//	@Override
//	public void setOnPageChangeListener(OnPageChangeListener listener) {
//		mSlideBar.setOnPageChangeListener(listener);
//	}
//
//	@Override
//	public void notifyDataSetChanged() {
//		mPageIndicator.notifyDataSetChanged();
//	}

}
