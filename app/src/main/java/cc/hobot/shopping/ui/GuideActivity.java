package cc.hobot.shopping.ui;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import cc.hobot.shopping.R;

public class GuideActivity extends AppCompatActivity {
    private int[] mGuideImgs = {R.drawable.guide_1, R.drawable.guide_2, R.drawable.guide_3, R.drawable.guide_4};
    private ViewPager mViewPager;
    private List<ImageView> mImgLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        initData();
        mViewPager.setAdapter(new MyPagerAdapter());

    }

    private void initData() {
        for (int i = 0; i < mGuideImgs.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundResource(mGuideImgs[i]);
            mImgLists.add(i, imageView);
        }
    }

    class MyPagerAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return mGuideImgs.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            container.addView(mImgLists.get(position));
            return mImgLists.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
