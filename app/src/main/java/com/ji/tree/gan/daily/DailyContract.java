package com.ji.tree.gan.daily;

import com.ji.tree.gan.GanDailyData;
import com.ji.tree.mvp.BasePresenter;
import com.ji.tree.mvp.BaseView;

import java.util.List;

public interface DailyContract {
    interface View extends BaseView<Presenter> {
        void show(List<GanDailyData.GanData> list);
    }

    interface Presenter extends BasePresenter {
        void history();
        void more();
    }
}
