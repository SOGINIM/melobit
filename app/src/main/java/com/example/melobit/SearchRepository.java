package com.example.melobit;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import io.reactivex.Observable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.Observer;


public class SearchRepository {


    private final MutableLiveData<Search_M> mutableLiveData_search = new MutableLiveData<>();
    private Context context;
    APIS_Music apiService;



    public SearchRepository(Context context) {
        this.context = context;
        apiService = RetroClass.getAPIS_Music();
    }




    public void searchAS(String text) {

        Observable<Search_M> mObservable = apiService.searchAS(text);
        mObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Search_M>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }





                    @Override
                    public void onNext(Search_M search_m) {
                        getMutableLiveData_search().postValue(search_m);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }




    public MutableLiveData<Search_M> getMutableLiveData_search() {
        return mutableLiveData_search;
    }
}
